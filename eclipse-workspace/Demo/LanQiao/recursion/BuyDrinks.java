package recursion;

import java.util.Scanner;

/*
** 递归练习5.1：买汽水（华为面试题） **
题目描述
一个人买汽水，一块钱一瓶汽水，三个瓶盖可以换一瓶汽水，两个空瓶可以换一瓶汽水 
问N块钱可以买多少汽水？ 

输入
一个整数N，表示初始资金N，范围[1, 30]

输出
一个整数，表示买了多少汽水

样例输入
20

样例输出
113
*/
public class BuyDrinks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		
		scanner.close();
		
		int result = Recursion(money, 0, 0);
		System.out.println(result);
	}
	
	public static int Recursion(int result, int bottle, int cap) {
		cap %= 3;
		bottle %= 2;
		cap += result;
		bottle += result;
		if (bottle < 2 && cap < 3) {
			return result;
		} else {
			return Recursion(bottle / 2 + cap / 3, bottle, cap) + result;
		}
	}
}
