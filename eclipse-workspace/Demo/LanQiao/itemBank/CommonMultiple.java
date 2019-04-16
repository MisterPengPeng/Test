package itemBank;

public class CommonMultiple {
	public static void main(String[] args) {
		for (int i = 20; i <= 1000; i++) {
			if (i % 11 == 0 && i % 17 == 0) {
				System.out.println(i);
			}
		}
	}
}
