package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
** 兰顿蚂蚁 **

问题描述

兰顿蚂蚁，是于1986年，由克里斯·兰顿提出来的，属于细胞自动机的一种。

平面上的正方形格子被填上黑色或白色。在其中一格正方形内有一只“蚂蚁”。

蚂蚁的头部朝向为：上下左右其中一方。

蚂蚁的移动规则十分简单：
若蚂蚁在黑格，右转90度，将该格改为白格，并向前移一格；
若蚂蚁在白格，左转90度，将该格改为黑格，并向前移一格。

规则虽然简单，蚂蚁的行为却十分复杂。刚刚开始时留下的路线都会有接近对称，像是会重复，但不论起始状态如何，蚂蚁经过漫长的混乱活动后，会开辟出一条规则的“高速公路”。
蚂蚁的路线是很难事先预测的。
你的任务是根据初始状态，用计算机模拟兰顿蚂蚁在第n步行走后所处的位置。


输入格式
　　输入数据的第一行是 m n 两个整数（3 < m, n < 100），表示正方形格子的行数和列数。
　　接下来是 m 行数据。
　　每行数据为 n 个被空格分开的数字。0 表示白格，1 表示黑格。

　　接下来是一行数据：x y s k, 其中x y为整数，表示蚂蚁所在行号和列号（行号从上到下增长，列号从左到右增长，都是从0开始编号）。s 是一个大写字母，表示蚂蚁头的朝向，我们约定：上下左右分别用：UDLR表示。k 表示蚂蚁走的步数。

输出格式
　　输出数据为两个空格分开的整数 p q, 分别表示蚂蚁在k步后，所处格子的行号和列号。

样例输入
5 6
0 0 0 0 0 0
0 0 0 0 0 0
0 0 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
2 3 L 5

样例输出
1 3

样例输入
3 3
0 0 0
1 1 1
1 1 1
1 1 U 6

样例输出
0 0
*/
public class LangtonAnt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//输入阵列行数列数
		int inputLine = scanner.nextInt();
		int inputColumn = scanner.nextInt();
		
		//输入0, 1阵列, 0表示白格, 1表示黑格
		//若蚂蚁在黑格,右转90度,将该格改为白格,并向前移一格
		//若蚂蚁在白格,左转90度,将该格改为黑格,并向前移一格
		ArrayList<StringBuilder> array = new ArrayList<StringBuilder>();
		for (int i = 0; i < inputLine; i++) {
			array.add(new StringBuilder());
		}
		
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < inputColumn; j++) {
				array.get(i).append(scanner.next());
			}
		}
		
		/* **************************************
		 * 这里的x, y代表行号列号, 与坐标系中x, y刚好相反*
		 * 这里的x, y代表行号列号, 与坐标系中x, y刚好相反*
		 * 这里的x, y代表行号列号, 与坐标系中x, y刚好相反*
		 * **************************************
		 * */
		//输入蚂蚁起始位置, 起始方向和行走步数
		int x = scanner.nextInt();		//起始位置, 行号
		int y = scanner.nextInt();		//起始位置, 列号
		String s = scanner.next();		//起始方向,上下左右分别用：UDLR表示
		int k = scanner.nextInt();		//行走步数
		
		scanner.close();
		
		for (int i = 0; i < k; i++) {
			if (array.get(x).charAt(y) == '0') {
				if (s.equals("U")) {
					array.get(x).setCharAt(y, '1');
					y--;
					s = "L";
				} else if (s.equals("D")) {
					array.get(x).setCharAt(y, '1');
					y++;
					s = "R";
				} else if (s.equals("L")) {
					array.get(x).setCharAt(y, '1');
					x++;
					s = "D";
				} else if (s.equals("R")) {
					array.get(x).setCharAt(y, '1');
					x--;
					s = "U";
				}
			} else if (array.get(x).charAt(y) == '1') {
				if (s.equals("U")) {
					array.get(x).setCharAt(y, '0');
					y++;
					s = "R";
				} else if (s.equals("D")) {
					array.get(x).setCharAt(y, '0');
					y--;
					s = "L";
				} else if (s.equals("L")) {
					array.get(x).setCharAt(y, '0');
					x--;
					s = "U";
				} else if (s.equals("R")) {
					array.get(x).setCharAt(y, '0');
					x++;
					s = "D";
				}
			}
		}
		System.out.println(x + " " + y);
	}
}
