package itemBank;

import java.util.Scanner;

public class GraphicDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < input; i++) {
			for (int j = input - i; j > 0; j--) {
				System.out.print("*");
				if (j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
