package itemBank;

import java.util.Scanner;

public class DetermineThePositionOfVowelLetters {
	
	static char[] vowelLetters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		
		
		for (int i = 0; i < vowelLetters.length; i++) {
			if (input.indexOf(vowelLetters[i]) != -1) {
				System.out.println(input.indexOf(vowelLetters[i]) + 1);
				return;
			}
		}
		
		System.out.println(0);
	}
}
