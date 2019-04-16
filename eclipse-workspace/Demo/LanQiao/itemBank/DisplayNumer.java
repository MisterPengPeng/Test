package itemBank;

import java.util.Scanner;

public class DisplayNumer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		String data = "";
		while (input != 0) {
			data += input % 10;
			input /= 10;
		}
		for (int i = data.length() - 1; i >= 0; i--) {
			System.out.print(data.charAt(i));
			if (i != 0) {
				System.out.print(" ");
			}
		}
	}
}
