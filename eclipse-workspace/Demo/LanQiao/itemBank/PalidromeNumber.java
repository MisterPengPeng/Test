package itemBank;

public class PalidromeNumber {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if (isPalin(i)) {
				System.out.println(i);
			}
		}
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

