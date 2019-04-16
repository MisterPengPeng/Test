package demo;

import java.util.Scanner;

/*
	回文数字
	问题描述
	观察数字：12321，123321 都有一个共同的特征，无论从左到右读还是从右向左读，都是相同的。这样的数字叫做：回文数字。
	本题要求你找到一些5位或6位的十进制数字。满足如下要求：该数字的各个数位之和等于输入的整数。
	输入格式
	一个正整数 n (10<n<100), 表示要求满足的数位和。
	输出格式
	若干行，每行包含一个满足要求的5位或6位整数。数字按从小到大的顺序排列。如果没有满足条件的，输出：-1
	样例输入
	44
	样例输出
	99899
	499994
	589985
	598895
	679976
	688886
	697796
	769967
	778877
	787787
	796697
	859958
	868868
	877778
	886688
	895598
	949949
	958859
	967769
	976679
	985589
	994499
	样例输入
	60
	样例输出
	-1
*/
public class PalindromeNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNum = input.nextInt();
		long startTime = System.currentTimeMillis();
		PrintNum(inputNum);
		input.close();
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("用时: " + time);
	}
	
	public static void PrintNum(int num) {
		int havePalindrome = 0;
		for (int i = 10000; i <= 999999; i++) {
			int judgeNum = 0;
			String strI = i + "";
			for (int a = 0; a < strI.length(); a++) {
				judgeNum += strI.charAt(a) - 48;
			}
			int isPalindrome = 0;
			if (judgeNum == num) {
				for (int y = 0; y < strI.length() / 2; y++) {
					if (strI.charAt(y) != strI.charAt(strI.length() - y - 1)) {
						isPalindrome++;
						break;
					}
				}
				if (isPalindrome == 0) {
					System.out.println(i);
					havePalindrome++;
				}
			}
		}
		if (havePalindrome == 0) {
			System.out.println(-1);
		}
	}
}
