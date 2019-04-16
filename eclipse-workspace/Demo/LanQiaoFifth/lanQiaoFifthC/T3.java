package lanQiaoFifthC;

public class T3 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 10000; i <= 99999; i++) {
			if (isPrime(i) && isPalin(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	private static boolean isPalin(int i) {
		String temp = i + "";
		int length = temp.length();
		int mid = length / 2 - 1;
		char[] book = new char[mid + 1];
		int top = 0;
		for (int j = 0; j <= mid; j++) {
			book[top++] = temp.charAt(j);
		}
		int next = 0;
		if (length % 2 == 0) {
			next = mid + 1;
		} else {
			next = mid + 2;
		}
		for (int j = next; j < length; j++) {
			if (temp.charAt(j) != book[--top]) {
				return false;
			}
		}
		
		if (top == 0) {
			return true;
		}
		return false;
	}

	private static boolean isPrime(int i) {
		if (i % 2 == 0) {
			return false;
		}
		
		for (int j = 3; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
