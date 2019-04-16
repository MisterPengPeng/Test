package demo;

import java.util.Scanner;

/*
** 回形取数 **

题目描述
回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一开始位于矩阵左上角，方向向下。

输入
输入第一行是两个不超过200的正整数m,  n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。

输出
输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。

样例输入
3 3 
1 2 3 
4 5 6 
7 8 9 

样例输出
1 4 7 8 9 6 3 2 5
*/
public class FetchNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();		//一共有几行
		int column = scanner.nextInt();		//一共有几列
		
		int[][] array = new int[line][column];		//存放矩阵
		
		//给矩阵赋值
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int counter = 1;		//统计输出了几个数, 超出 line * column 就跳出循环
		int arrayLine = -1;		//当前行
		int arrayColumn = 0;	//当前列
		
		while (counter <= line * column) {
			while (arrayLine + 1 < line && array[arrayLine + 1][arrayColumn] != -1) {
				System.out.print(array[++arrayLine][arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayColumn + 1 < column && array[arrayLine][arrayColumn + 1] != -1) {
				System.out.print(array[arrayLine][++arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayLine - 1 >= 0 && array[arrayLine - 1][arrayColumn] != -1) {
				System.out.print(array[--arrayLine][arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayColumn - 1 >= 0 && array[arrayLine][arrayColumn - 1] != -1) {
				System.out.print(array[arrayLine][--arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
		}
	}
}
