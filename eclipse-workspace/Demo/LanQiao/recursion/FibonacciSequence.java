package recursion;

import java.util.Scanner;

/*
** 递归练习2：Fibonacci数列 **
题目描述
Fibonacci数列为：1, 1, 2, 3, 5, 8, 13, 21, ...
Fibonacci数列的递推公式为：Fn = F(n-1) + F(n-2)，其中F1 = F2 = 1。
使用递归（不要使用循环）计算Fn的值

输入
输入一个整数n (n > 0)

输出
输出一行，包括一个整数，表示Fn的值

样例输入
8

样例输出
21
*/
public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		if (n == 1 | n == 2) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
