package itemBank;

import java.util.Scanner;

public class VowelLetterFirstPosition {
	
	static char[] vowelLetters = {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < 5; j++) {
				if (input.charAt(i) == vowelLetters[j]) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		System.out.println(0);
	}
}
