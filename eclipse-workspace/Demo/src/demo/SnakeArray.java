package demo;

import java.util.Scanner;

/*
** 蛇行矩阵 **

蛇行矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
排列的方向为向右上方。
以下是1个大小为2的蛇行矩阵
1 3
2
以下是1个大小为3的蛇行矩阵
1 3 6
2 5
4

输入
正整数N （0 < N <= 100）

输出
输出一个N行的蛇行矩阵。
矩阵三角中同一行的数字用一个空格分开。行尾不要多余的空格。

样例输入
5

样例输出
1 3 6 10 15
2 5 9 14
4 8 13
7 12
11
*/
public class SnakeArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		int[][] array = new int[input][];
		int tempInput = input;
		for (int i = 0; i < array.length; i++) {
			array[i] = new int[tempInput];
			tempInput--;
		}
		
//		array[0][0] = 1;
//		array[0][1] = array[0][0] + 2;
//		array[0][2] = array[0][1] + 3;
//		array[0][3] = array[0][2] + 4;
		
		int count = 2;
		int tempCount = count;
		int columnCount = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 && j == 0) {
					array[i][j] = 1;
				} else {
					if (j == 0 && i != 0) {
						array[i][j] = array[i - 1][j] + columnCount;
						columnCount++;
					} else {
						array[i][j] = array[i][j - 1] + count;
						count++;
					}
				}
			}
			count = tempCount + 1;
			tempCount++;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == array[i].length - 1) {
					System.out.println(array[i][j]);
				} else {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}
