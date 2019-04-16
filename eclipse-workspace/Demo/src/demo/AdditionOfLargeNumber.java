package demo;

import java.util.Scanner;


/*
** 大数加法 ** 不要使用BigInteger类
题目描述
输入两个正整数a,b，输出a+b的值。

输入
两行，第一行a，第二行b。a和b的长度均小于1000位。

输出
一行，a+b的值。 

样例输入
4 
2 

样例输出
6
*/
public class AdditionOfLargeNumber {
	
	public static final int MAX = 1001;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputA = scanner.nextLine();
		String inputB = scanner.nextLine();
		
		scanner.close();
		
		byte[] a = new byte[MAX];
		byte[] b = new byte[MAX];
		byte[] sum = new byte[MAX];
		
		for (int i = inputA.length() - 1, j = 0; i >= 0; i--, j++) {
			a[j] = (byte)(inputA.charAt(i) - '0');
		}
		
		for (int i = inputB.length() - 1, j = 0; i >= 0; i--, j++) {
			b[j] = (byte)(inputB.charAt(i) - '0');
		}
		
		int length = Math.max(inputA.length(), inputB.length());
		for (int i = length; i >= 0; i--) {
			sum[i] = (byte)(a[i] + b[i] + sum[i]);
			if (sum[i] >= 10) {
				sum[i] %= 10;
				sum[i + 1] += 1;
			}
		}
		
		for (int i = length; i >= 0; i--) {
			if (sum[length] == 0) {
				sum[length]++;
			} else {
				System.out.print(sum[i]);
			}
		}
	}
}
