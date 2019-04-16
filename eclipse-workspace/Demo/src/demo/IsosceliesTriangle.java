package demo;

import java.util.Scanner;

/*
	等腰三角形
	
	本题目要求你在控制台输出一个由数字组成的等腰三角形。
	具体的步骤是：
	1. 先用1,2,3，...的自然数拼一个足够长的串
	2. 用这个串填充三角形的三条边。从上方顶点开始，逆时针填充。
	比如，当三角形高度是8时：
	输入
	一个正整数n(3<n<300),表示三角形的高度
	输出
	用数字填充的等腰三角形。
	为了便于测评，我们要求空格一律用"."代替。
	例如，输入：5
	程序应该输出：
	....1
	...2.1
	..3...2
	.4.....1
	567891011

	10
	程序应该输出：
	.........1
	........2.2
	.......3...2
	......4.....2
	.....5.......1
	....6.........2
	...7...........0
	..8.............2
	.9...............9
	1011121314151617181

	15
	程序应该输出：
	..............1
	.............2.3
	............3...2
	...........4.....3
	..........5.......1
	.........6.........3
	........7...........0
	.......8.............3
	......9...............9
	.....1.................2
	....0...................8
	...1.....................2
	..1.......................7
	.1.........................2
	21314151617181920212223242526
*/
public class IsosceliesTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		StringBuilder stringBuilder = new StringBuilder();		//用StringBuilder来完成一些String做不到的事情
		for (int i = 1; ; i++) {								//填充要用到的数字,一共用到的数字长度为4 * input - 4
			stringBuilder.append(i);
			if (stringBuilder.length() >= 4 * input - 4) {
				break;
			}
		}
		
		String left = stringBuilder.substring(1, input - 1);	//存放左边数字
		String bottom = stringBuilder.substring(input - 1, 3 * input - 2);	//存放底部数字
		String right = stringBuilder.substring(3 * input - 2, 4 * input - 4);	//存放右边数字
		right = new StringBuilder(right).reverse().toString();	//因为是逆时针打印，为了方便所以把右边数字翻转
		
		PrintDots(input - 1);									//打印第零行圆点, input - 1个
		System.out.println(1);									//第零行的数字一定为1, 直接打印
		
		//循环输出第二行到倒数第二行
		for (int i = 1; i < input - 1; i++) {
			PrintDots(input - 1 - i);							//从第二行开始打印,打印左边圆点,圆点数量为input - 1 - line number
			System.out.print(left.charAt(i - 1));				//
			PrintDots(2 * i - 1);
			System.out.print(right.charAt(i - 1));
			System.out.println();
		}
		System.out.print(bottom);
	}
	
	//输出圆点
	public static void PrintDots(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(".");
		}
	}
}
