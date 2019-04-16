package itemBank;

import java.util.Scanner;

public class ExchangeUpperAndLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) >= 'a' ? (char)(input.charAt(i) - 32) : (char)(input.charAt(i) + 32));
		}
	}
}
