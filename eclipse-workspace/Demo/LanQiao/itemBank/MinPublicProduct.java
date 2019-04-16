package itemBank;

import java.util.Scanner;

public class MinPublicProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println(lcm(a, b));
	}
	
	public static long lcm(long a, long b) {
		for (long i = Math.min(a, b); i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}
		return -1;
	}
}
