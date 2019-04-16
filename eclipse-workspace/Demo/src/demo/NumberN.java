package demo;

import java.util.Scanner;

/*
12345678910111213…. 第N个数位是几
输入：N
输出：第N位上的数

例：
样例输入：1
样例输出：1
样例输入：11
样例输出：0
*/
public class NumberN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String strCount = "";
		int count = 1;
		while(true) {
			strCount += count + "";
			if (strCount.length() > input) {
				System.out.println(strCount.charAt((input - 1)));
				break;
			}
			count++;
		}
		sc.close();
	}
}
