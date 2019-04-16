package itemBank;

import java.util.Scanner;

public class Exponent {
	
	static int n;
	static int m;
	static int result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sc.close();
		
		int counter = 0;
		for (int i = 1; i <= m; i++) {
			result = (int)(Math.pow(n, i));
			String temp = result + "";
			for (int j = 0; j < 12 - temp.length(); j++) {
				System.out.print(" ");
			}
			if (counter == 4) {
				System.out.println(result);
				counter = 0;
			} else {
				System.out.print(result);
				counter++;
			}
		}
	}
}
