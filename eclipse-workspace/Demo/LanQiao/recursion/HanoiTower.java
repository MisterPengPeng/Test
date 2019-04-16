package recursion;

import java.util.Scanner;

/*
** 递归练习6：汉诺塔 **
题目描述
汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
现在我们给3根石柱编号为1，2，3，并在1号石柱从下往上从大往小摆好n个圆盘，请给出将所有圆盘从1号石柱挪到3号石柱的详细操作顺序。

输入
1个数字n

输出
若干行，每一行输出由空格分开的2个整数x、y（1 <= x,y <= 3），表示将x石柱最上方的圆盘挪到y石柱上。
经过这若干行操作后，所有圆盘应该按顺序摆放到3号石柱上

样例输入
3

样例输出
1 3
1 2
3 2
1 3
2 1
2 3
1 3
*/
public class HanoiTower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		Recursion(n, 1, 2, 3);
	}
	
	public static void Recursion(int n, int one, int two, int three) {
		if (n == 1) {
			System.out.println(one + " " + three);
			return;
		}
		Recursion(n - 1, one, three, two);
		System.out.println(one + " " + three);
		Recursion(n - 1, two, one, three);
	}
}
