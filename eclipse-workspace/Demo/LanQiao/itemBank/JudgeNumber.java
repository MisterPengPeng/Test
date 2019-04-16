package itemBank;

import java.util.Scanner;

public class JudgeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		
		if ('0' <= (input.charAt(0)) && (input.charAt(0) <= '9')) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
