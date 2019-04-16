package dynamicProgramming;

public class FirstDPQuestion {
	
	static class Item {
		int weight;
		int price;
		
		public Item(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}
		
		public Item() {

		}
	}
	
	static final int MAXLIMIT = 100;
	static Item[] items = {
			new Item(50, 300),
			new Item(30, 150),
			new Item(30, 100),
			new Item(10, 80),
			new Item(15, 400),
			new Item(40, 120),
			new Item(25, 450),
			new Item(5, 50)
	};
	
	public static void main(String[] args) {
		int answer = maxValue(MAXLIMIT, items.length - 1);
		System.out.println(answer);
	}
	
	public static int maxValue(int capacity, int count) {
		if (count == 0) {
			return capacity >= items[count].weight ? items[count].price : -1;
		}
		
		int priceIfNoTake = maxValue(capacity, count - 1);
		int priceIfTake = 0;
		if (capacity >= items[count].weight) {
			priceIfTake = items[count].price + maxValue(capacity - items[count].weight, count - 1);
		}
		
		return Math.max(priceIfNoTake, priceIfTake);
	}
}