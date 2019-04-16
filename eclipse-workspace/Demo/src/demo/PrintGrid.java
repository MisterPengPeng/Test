package demo;

import java.util.Scanner;

/*
** 栅格打印问题 **

题目描述
编写一个程序，输入两个整数，作为栅格的高度和宽度，然后用“+”、“-”和“|”这三个字符来打印一个栅格。

输入
输入只有一行，包括两个整数，分别为栅格的高度和宽度。
高度和宽度的范围[-20, 20]

输出
输出相应的栅格。
宽度或高度<=0时，不输出栅格，只输出一个换行


样例输入
3  2 				4  3

样例输出
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
					| | | |
					+-+-+-+
*/
public class PrintGrid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		
		scanner.close();
		
		//如果高度或者宽度小于等于零, 输出一个换行
		if (height <= 0 || width <= 0) {
			System.out.println();
			return;
		}
		
		//打印栅格
		for (int j = 0; j < height; j++) {
			//打印节点
			for (int i = 0; i <= width; i++) {
				if (i == width) {
					System.out.println('+');
				} else {
					System.out.print("+-");
				}
			}
			
			//打印连接线
			for (int k = 0; k <= width; k++) {
				if (k == width) {
					System.out.println('|');
				} else {
					System.out.print("| ");
				}
			}
		}
		
		//打印最后底边
		for (int i = 0; i <= width; i++) {
			if (i == width) {
				System.out.println('+');
			} else {
				System.out.print("+-");
			}
		}
	}
}
