package itemBank;

import java.util.Scanner;

public class MaxMinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		sc.close();
		
		long res = 0;
		if (n % 2 != 0) {
			res = n * (n - 1) * (n - 2);
		} else {
			if (n % 3 != 0) {
				res = (n - 1) * n * (n - 3);
			} else {
				res = (n - 1) * (n - 2) * (n - 3);
			}
		}
		System.out.println(res);
	}
}
