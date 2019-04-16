package test2;

import java.util.Scanner;

public class T6 {
	
	static int n;
	static int[] result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		sc.close();
		
		result = new int[n];
		dfs(0, 2, 0, 1);
	}
	
	public static void dfs(int x, int nextStart, long numerator, long denominator) {
		for (int i = nextStart; i < 30; i++) {
			result[x] = i;
			long newDenominator = i * denominator;
			long newNumerator = numerator * i + 1 * denominator;
			if (x == n - 1) {
				if (newDenominator == newNumerator) {
					print();
					break;
				} else if (newNumerator < newDenominator) {
					break;
				}
			} else {
				if (newNumerator < newDenominator) {
					dfs(x + 1, i + 1, newNumerator, newDenominator);
				}
			}
		}
	}
	
	public static void print() {
		for (int i = 0; i < n; i++) {
			System.out.print("1/" + result[i]);
			if (i == n - 1) {
				System.out.println();
			} else {
				System.out.print(' ');
			}
		}
	}
}
