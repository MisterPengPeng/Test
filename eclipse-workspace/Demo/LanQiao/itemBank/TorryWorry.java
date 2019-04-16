package itemBank;

import java.util.Scanner;

public class TorryWorry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		sc.close();

		int result = 1;
		for (int i = 0, j = 2; j <= Integer.MAX_VALUE && i < input; j++) {
			if (isPrime(j)) {
				result *= j;
				i++;
			}
		}
		System.out.println(result % 50000);
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
