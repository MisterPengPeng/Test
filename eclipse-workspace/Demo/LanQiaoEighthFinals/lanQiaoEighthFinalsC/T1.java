package lanQiaoEighthFinalsC;

public class T1 {
	public static void main(String[] args) {
		int counter = 0;
		
		for (int i = 1; i <= 1000; i++) {
			counter += f(i);
		}
		
		System.out.println(counter);
	}

	private static int f(int i) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}
}
