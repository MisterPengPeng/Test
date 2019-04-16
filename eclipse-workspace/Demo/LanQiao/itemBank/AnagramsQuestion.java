package itemBank;

import java.util.Scanner;

public class AnagramsQuestion {
	
	static int[] book1 = new int[48];
	static int[] book2 = new int[48];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.next();
		String input2 = sc.next();
		
		sc.close();
		
		for (int i = 0; i < input1.length(); i++) {
			book1[input1.charAt(i) < 'a' ? input1.charAt(i) - 'A' : input1.charAt(i) - 'a'] += 1;
		}
		
		for (int i = 0; i < input2.length(); i++) {
			book2[input2.charAt(i) < 'a' ? input2.charAt(i) - 'A' : input2.charAt(i) - 'a'] += 1;
		}
		
		for (int i = 0; i < 48; i++) {
			if (book1[i] != book2[i]) {
				System.out.println("N");
				return;
			}
		}
		System.out.println("Y");
	}
}
