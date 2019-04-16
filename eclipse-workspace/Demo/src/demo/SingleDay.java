package demo;

import java.util.Scanner;

/*
单身节（2018年校内预选赛）

问题描述
在刚刚过去的单身节中，小Hi受尽了各种伤害，他在心中暗下决心，一定不再过明年的单身节。为了逃离单身节，小Hi准备编写一个程序向他的女神发送一颗红心。
一个size为1的红心如下图所示
 _   _
/ \_/ \
|     |
\     /
 \   /
  \_/

但是这颗红心太小了，所以小Hi将其每条边的长度都乘以N，从而使得女神能够看得清楚。N=2时的输出如下
  __      __
 /  \    /  \
/    \__/    \
|            |
|            |
\            /
 \          /
  \        /
   \      /
	\    /
	 \__/

输入
第一行包含一个整数N，表示红心的大小
对于100%数据，满足N<=10
输出
输出一个size为N的红心
行末的空格不需要输出
样例输入输出参照前面的例子
*/
public class SingleDay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		/**
		 * 除最上面行号从零开始
		 * 每一部分的行号都从一开始
		 * */
		
		//打印第零行
		PrintSpace(input);				//第零行的规律为
		PrintUnderLine(input);			//空格 * input + 下划线 * input + 空格 * (input * 3) + 下划线 * input
		PrintSpace(input * 3);			//根据规律打印第零行
		PrintUnderLine(input);
		System.out.println();
		
		//打印从第一行开始的上半部分
		for (int i = 1; i <= input; i++) {
			PrintSpace(input - i);			//打印左边斜线前的空格			上部分每一行的规律为
			PrintSlash(1);					//打印左边斜线					空格 * (input - 行号) + 斜线 + 空格 * (input + 行号 * 2 - 2) + 反斜线 + 空格 * (input * 3 - 行号 * 2) + 斜线 + 空格 * (input + i * 2 - 2) + 反斜线
			PrintSpace(input + i * 2 - 2);	//打印左边反斜线前的空格																		   或下划线 * input
			PrintBackSlash(1);				//打印反斜线

			//判断是否打印下划线
			if (i == input) {					//如果是上部分最后一行
				PrintUnderLine(input);			//打印下划线
			} else {							//否则
				PrintSpace(input * 3 - i * 2);	//继续打印空格
			}
			PrintSlash(1);						//打印右边斜线
			PrintSpace(input + i * 2 - 2);		//打印右边反斜线前的空格
			PrintBackSlash(1);					//打印右边反斜线
			System.out.println();				//换行
		}
		
		//打印中间部分
		for (int i = 1; i <= input; i++) {
			PrintVerticalLine(1);				//打印左边竖线						中间部分每一行规律为
			PrintSpace(input * 7 - 2);			//打印左右两边竖线之间的空格			竖线 + 空格 * input * 7 - 2 + 竖线
			PrintVerticalLine(1);				//打印右边竖线
			System.out.println();				//换行
		}
		
		//打印底部
		for (int i = 1; i <= input * 3; i++) {
			PrintSpace(i - 1);					//打印左边反斜线前的空格				底部每一行规律为
			PrintBackSlash(1);					//打印左边反斜线					空格 * (行号 - 1) + 反斜线 + 空格 * (input * 7 - i * 2) + 斜线
			if (i == input * 3) {				//如果是最后一行										     或下划线 * input
				PrintUnderLine(input);			//打印下划线
			} else {							//否则
				PrintSpace(input * 7 - i * 2);	//继续打印空格
			}
			PrintSlash(1);						//打印右边斜线
			System.out.println();				//换行
		}
	}
	
	
	//打印空格
	public static void PrintSpace(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
	}
	
	//打印下划线
	public static void PrintUnderLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("_");
		}
	}
	
	//打印斜线
	public static void PrintSlash(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("/");
		}
	}
	
	//打印反斜线
	public static void PrintBackSlash(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("\\");
		}
	}
	
	//打印竖线
	public static void PrintVerticalLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("|");
		}
	}
}
