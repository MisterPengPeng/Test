package itemBank;

public class PerfectNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 9999; i++) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int parameter) {
		int sum = 0;
		for (int i = 1; i < parameter; i++) {
			if (parameter % i == 0) {
				sum += i;
			}
		}
		return sum == parameter ? true : false;
	}
}
