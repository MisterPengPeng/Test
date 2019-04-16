package dynamicProgramming;

import java.util.Scanner;

/*
在上面的数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。
路径上的每一步都只能往左下或 右下走。只需要求出这个最大和即可，不必给出具体路径。 
三角形的行数大于1小于等于100，数字为 0 - 99

输入格式：
//第一行表示三角形的行数    接下来输入三角形
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

要求输出最大和
*/
public class Main {
	
	static int line;
	static int[][] triangle;
	static int maxNum = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		line = scanner.nextInt();
		triangle = new int[line][];
		for (int i = 0; i < line; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				triangle[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		maxNum(0, 0, 0);
	}
	
	public static int maxNum(int line, int column, int value) {
		int nextColumn = column;
		if (line == Main.line) {
			System.out.println(value);
			return 0;
		}
		
		if (line == 0 && column == 0) {
			value += triangle[line][column];
		} else {
			if (column == 0) {
				value += triangle[line][column + 1];
				nextColumn++;
			} else {
				if (triangle[line][column + 1] > triangle[line][column - 1]) {
					value += triangle[line][column + 1];
					nextColumn++;
				} else if (line != Main.line - 1 && triangle[line][column + 1] == triangle[line][column - 1]) {
					if (triangle[line + 1][column + 2] > triangle[line + 1][column - 2]) {
						value += triangle[line][column + 1];
						nextColumn++;
					} else if (triangle[line + 1][column - 2] > triangle[line + 1][column + 2]) {
						value += triangle[line][column - 1];
						nextColumn--;
					}
				} else {
					value += triangle[line][column - 1];
					nextColumn--;
				}
			}
		}
		
		return maxNum(line + 1, nextColumn, value);
	}
}
