package test2;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		if (n == 1) {
			System.out.println(2 % m);
		} else if (n == 2) {
			System.out.println(6 % m);
		} else {
			long x1 = 1;
			long x2 = 2;
			long x3 = 0;
			long sum = 5;
			for (long i = 3; i <= n; i++) {
				x3 = (x1 + x2) % m;
				sum = (sum + ((x3 * x3 % m)) % m);
				x1 = x2;
				x2 = x3;
			}
			System.out.println((sum + 1) % m);
		}
	}
}
