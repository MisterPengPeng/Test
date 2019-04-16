package breadthFirstSearch;

import java.util.Scanner;

/*
** 带分数 **

问题描述
100 可以表示为带分数的形式：100 = 3 + 69258 / 714。
还可以表示为：100 = 82 + 3546 / 197。
注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
类似这样的带分数，100 有 11 种表示法。

输入格式
从标准输入读入一个正整数N (N<1000*1000(1000000))

输出格式
程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。

注意：不要求输出每个表示，只统计有多少表示法！

样例输入1
100

样例输出1
11

样例输入2
105

样例输出2
6
*/
public class Fraction {
	//n = i + a / b				4 = 1 + 9 / 3
	//a = b * (n - i)			9 = 3 * (4 - 1)
	//分子 = 分母 * (结果 - 整数)
	
	
	static int[] book = new int[10];		//用来检查数字是否用过, 下表为数字, 元素为判断标准, 0表示没用过, 1表示用过
	static int counter = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		for (int integer = 1; integer <= 987654; integer++) {
			one:
			for (int denominator = 1; denominator <= 12346; denominator++) {
				String temp = denominator + "";
				String temp1 = integer + "";
				for (int i = 0; i < temp1.length(); i++) {
					String temp2 = temp1.charAt(i) + "";
					if (temp.contains(temp2)) {
						continue one;
					}
				}
				int numerator = denominator * (input - integer);
				int result = integer + (numerator / denominator);
				if (result == input && check(result)) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
	
	public static boolean check(int result) {
		int length = new String(result + "").length();
		for (int i = 0; i < length; i++) {
			if (result % 10 == result % 100) {
				return false;
			}
			result /= 10;
		}
		return true;
	}
}
