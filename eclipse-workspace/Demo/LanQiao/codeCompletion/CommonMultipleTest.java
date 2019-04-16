package codeCompletion;

import java.math.BigInteger;

public class CommonMultipleTest {
	public static void main(String[] args) {
		System.out.println(f(40));
	}
	
	public static BigInteger f(int n) {
		BigInteger sum = BigInteger.valueOf(1);
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (arr[j] % arr[i] == 0) {
					arr[j] /= arr[i];
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			sum = sum.multiply(BigInteger.valueOf(arr[i]));
		}
		
		return sum;
	}
}
