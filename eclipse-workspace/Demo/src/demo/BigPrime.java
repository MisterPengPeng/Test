package demo;

import java.util.Scanner;

public class BigPrime {

	static int length = 0;
	static int primeTable[] = new int[999999];
	static long time;
	static {
		time = System.currentTimeMillis();
//		int primeTable[] = new int[999999];
		for (int j = 100000; j <= 999999; j++) {
			if (isPrime(j)) {
				primeTable[length] = j;
				length++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		long[] data = new long[N];
		for (int i = 0; i < N; i++) {
			data[i] = in.nextLong();
		}

		in.close();
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < length; j++) {
				if (data[i] % primeTable[j] == 0) {
					System.out.println(data[i] + "=" + primeTable[j] + "*" + data[i] / primeTable[j]);
					break;
				}
			}
		}
		System.out.println(System.currentTimeMillis() - time);
	}

	public static boolean isPrime(int i) {
		if (i % 2 == 0) {
			return false;
		}
		for (int j = 3; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
