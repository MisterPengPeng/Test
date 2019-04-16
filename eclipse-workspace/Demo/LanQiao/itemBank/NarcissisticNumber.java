package itemBank;

public class NarcissisticNumber {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int parameter) {
		int temp = parameter;
		int result = 0;
		while (temp != 0) {
			result += Math.pow(temp % 10, 3);
			temp /= 10;
		}
		return result == parameter ? true : false;
	}
}
