package test4;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int i = in.nextInt();
			int j = in.nextInt();
			int max = 0;
			for (int a = i; a <= j; a++) {
				int currentMax = findMax(a);
				if (currentMax > max) {
					max = currentMax;
				}
			}
			
			System.out.println(i + " " + j + " " + max);
		}
	}

	private static int findMax(int a) {
		int length = 0;
		int temp = a;
		while (temp != 1) {
			temp = temp % 2 == 0 ? temp /= 2 : temp * 3 + 1;
			length++;
		}
		return length + 1;
	}
}
