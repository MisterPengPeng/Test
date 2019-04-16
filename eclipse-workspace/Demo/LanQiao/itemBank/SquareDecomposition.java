package itemBank;

import java.util.Scanner;

public class SquareDecomposition {
	
	static int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		f(input);
	}
	
	public static void f(int input) {
		if (input == 1) {
			System.out.print("2(0)");
			return;
		}
		if (input == 2) {
			System.out.print("2");
			return;
		}
		
		int j = input;
		for (int i = 14; i >= 0; i--) {
			if (j - arr[i] >= 0) {
				System.out.print("2");
				if (i > 1) {
					System.out.print("(");
					f(i);
					System.out.print(")");
				}
				j = j - arr[i];
				if (j != 0) {
					System.out.print("+");
					f(j);
					return;
				}
			}
		}
	}
}
