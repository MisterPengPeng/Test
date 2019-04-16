package itemBank;

import java.util.Scanner;

public class UpperOrLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		
		sc.close();
		
		System.out.println(((int)input >= 'a' ? (char)(input - 32) : (char)(input + 32)));
	}
}
