package recursion;

import java.util.Scanner;

/*
** 递归练习5.2：爬楼梯 **
题目描述
楼梯一共有N阶，上楼可以一步上1阶，也可以一步上2阶。
编写一个程序，计算总有多少种不同的走法。

输入
一个整数N，表示楼梯一共有N阶

输出
一个整数，表示总共的上楼走法

样例输入
4

样例输出
5
*/
public class ClimbStairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int stairs = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Recursion(stairs));
	}
	
	public static int Recursion(int stairs) {
		if (stairs <= 0) {
			return 0;
		}
		
		if (stairs == 1) {
			return 1;
		}
		
		if (stairs == 2) {
			return 2;
		}
		
		return Recursion(stairs - 1) + Recursion(stairs - 2);
	}
}
