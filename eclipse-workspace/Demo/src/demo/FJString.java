package demo;

import java.util.Scanner;

/*
** FJ的字符串 **

题目描述
FJ在沙盘上写了这样一些字符串： 
A1  =  “A” 
A2  =  “ABA” 
A3  =  “ABACABA” 
A4  =  “ABACABADABACABA” 
…  … 
你能找出其中的规律并写所有的数列AN吗？

输入
仅有一个数：N ≤ 26。

输出
请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。 

样例输入
3

样例输出
ABACABA
*/
public class FJString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		print(n);
		System.out.println();
	}
	
	static void print(int n) {
		if (n == 1)
			System.out.print('A');
		else {
			print(n - 1);// 前半部分
			System.out.print((char) ('A' + n - 1));
			print(n - 1);// 后半部分
		}
	}
}
