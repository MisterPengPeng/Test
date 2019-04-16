package demo;

import java.util.Scanner;


/*
	Excel地址（2018年校内预选赛）
	
	问题描述
	Excel单元格的地址表示很有趣，它使用字母来表示列号。
	比如，
	A表示第1列，
	B表示第2列，
	Z表示第26列，
	AA表示第27列，
	AB表示第28列，
	BA表示第53列，
	....
	当然Excel的最大列号是有限度的，所以转换起来不难。
	如果我们想把这种表示法一般化，可以把很大的数字转换为很长的字母序列呢？
	本题目即是要求对输入的数字, 输出其对应的Excel地址表示方式。
	
	样例输入
	26
	
	样例输出
	Z
	
	样例输入
	2054
	样例输出
	BZZ
	数据规模和约定
	我们约定，输入的整数范围[1,2147483647]
	峰值内存消耗（含虚拟机） < 256M
	CPU消耗 < 1000ms
*/
public class ExcelAddress {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			long[] letter = new long[10000];	//用来存放字母的ascii码
			long input = scanner.nextLong();	//存放用户输入的值(要转换的地址)
			int i = 1;		//标记字母在数组中的位置
			while (input != 0) {
				//如果用户输入为26，
				if (input % 26 == 0) {
					letter[i] = 90;
					input -= 1;
				} else {
					letter[i] = input % 26 + 64;
				}
				input /= 26;
				i++;
			}
			for (int j = i - 1; j > 0; j--) {
				System.out.print((char)letter[j]);
			}
			System.out.println();
			scanner.close();
	}
}
