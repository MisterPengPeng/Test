package itemBank;

import java.util.Scanner;

public class PrefixExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char operationalCharacter = sc.next().charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		switch (operationalCharacter) {
			case (char)43:
				System.out.println(a + b);
				break;
			
			case (char)45:
				System.out.println(a - b);
				break;
				
			case (char)42:
				System.out.println(a * b);
				break;
			
			case (char)47:
				System.out.println(a / b);
				break;
				
			default:
				break;
		}
	}
}
