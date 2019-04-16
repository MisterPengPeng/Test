package itemBank;

import java.util.Scanner;

public class SpecialPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 10000; i < 999999; i++) {
			if (isPalin(i) && equalsInput(i, input)) {
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
	
	public static boolean equalsInput(int i, int input) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		if (sum == input) {
			return true;
		}
		return false;
	}
}
