package itemBank;

import java.util.Scanner;

public class PrintGraphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int floor = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < floor - 1; i++) {
			System.out.printf("%" + (floor - i - 1) + "s", " ");
			for (int j = 0; j < (i + 1) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < floor * 2 - 1; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
