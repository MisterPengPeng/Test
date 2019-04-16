package itemBank;

public class SpecialNumFourty {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int i) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		if (sum == 10) {
			return true;
		}
		return false;
	}
}
