package itemBank;

public class SpecialNumber {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			if (isSpecial(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isSpecial(int i) {
		int temp = i;
		int sum = 0;
		while (temp != 0) {
			sum += Math.pow(temp % 10, 3);
			temp /= 10;
		}
		if (sum == i) {
			return true;
		}
		return false;
	}
}
