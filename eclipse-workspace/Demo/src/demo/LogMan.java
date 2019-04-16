package demo;

import java.util.Scanner;

/*
** Log大侠 **
题目描述
atm参加了速算训练班，经过刻苦修炼，对以2为底的对数算得飞快，人称Log大侠。
一天，Log大侠的好友 drd 有一些整数序列需要变换，Log大侠正好施展法力...
变换的规则是： 对其某个子序列的每个整数变为: [log_2 (x) + 1]  其中 [] 表示向下取整，就是对每个数字求以2为底的对数，然后取下整。
例如对序列 3 4 2 操作一次后，这个序列会变成 2 3 2。

drd需要知道，每次这样操作后，序列的和是多少。

输入
第一行两个正整数 n m 。
第二行 n 个数，表示整数序列，都是正数。
接下来 m 行，每行两个数 L R 表示 atm 这次操作的是区间 [L, R]，数列序号从1开始。

输出
输出 m 行，依次表示 atm 每做完一个操作后，整个序列的和。

样例输入
3 3
5 6 4
1 2
2 3
1 3

样例输出
10
8
6
*/
public class LogMan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();				//n个数
		int m = scanner.nextInt();				//m行
		int[] array = new int[n];				//整数序列, 都是正数
		int[][]	interval = new int[m][2];		//操作区间
		
		//为array赋值
		for (int i = 0; i < array.length; i++) {		
			array[i] = scanner.nextInt();
		}
		
		//为interval赋值
		for (int i = 0; i < interval.length; i++) {		
			for (int j = 0; j < interval[i].length; j++) {
				interval[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		int sum = 0;
		for (int i = 0; i < m; i++) {		//循环m次
			for (int j = interval[i][0]; j <= interval[i][interval[i].length - 1]; j++) {		//循环interval[i]的区间次
				array[j - 1] = (int)(Math.floor(Math.log(array[j - 1]) / Math.log(2) + 1));		//array的第j个数做(log2 array[j - 1] + 1)的向下取整操作
			}
			
			for (int j = 0; j < array.length; j++) {
				sum += array[j];
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
