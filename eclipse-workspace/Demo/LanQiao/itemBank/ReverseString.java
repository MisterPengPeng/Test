package itemBank;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
	}
}