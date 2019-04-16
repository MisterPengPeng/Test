package recursion;

import java.util.Scanner;

/*
** 递归练习1：序列求和 **
题目描述
使用递归（不要使用循环）计算1+2+3+...+n的值

输入
输入一个整数n

输出
输出一行，包括一个整数，表示1+2+3+...+n的值

样例输入
100

样例输出
5050
*/
public class SequenceSummation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(recursion(n));
	}
	
	public static int recursion(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 0) {
			return 0;
		} else if (num < 0) {
			return recursion(num + 1) + num;
		} else {
			return recursion(num - 1) + num;
		}
	}
}
