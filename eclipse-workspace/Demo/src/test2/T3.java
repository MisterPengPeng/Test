package test2;

public class T3 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 10000; i <= 99999; i++) {
			if (isPrime(i) && isPalin(i)) {
				counter++;
				System.out.println(i);
			}
		}
		System.out.println(counter);
	}
	
	public static boolean isPrime(int n) {
		if (n <= 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalin(int i) {
		String string = i + "";
		char[] book = new char[10];
		int length = string.length();
		int mid = length / 2 - 1;
		int top = 0;
		int next = 0;
		if (length % 2 == 0) {
			next = mid + 1;
		} else {
			next = mid + 2;
		}
		for (int j = 0; j <= mid; j++) {
			book[top++] = string.charAt(j);
		}
		for (int j = next; j < length; j++) {
			if (string.charAt(j) != book[--top]) {
				return false;
			}
		}
		
		if (top == 0) {
			return true;
		}
		return false;
	}
}
