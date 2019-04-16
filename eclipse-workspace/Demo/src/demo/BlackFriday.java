package demo;

import java.util.Calendar;
import java.util.Scanner;

/*
** 黑色星期五 **

题目描述
有些西方人比较迷信，如果某个月的13号正好是星期五，他们就会觉得不太吉利，用古人的说法，就是“诸事不宜”。
请你编写一个程序，统计出在某个特定的年份中，出现了多少次既是13号又是星期五的情形，以帮助你的迷信朋友解决难题。 
说明：
（1）一年有365天，闰年有366天，所谓闰年，即能被4整除且不能被100整除的年份，或是既能被100整除也能被400整除的年份；
（2）已知1998年1月1日是星期四，用户输入的年份肯定大于或等于1998年。 

输入
输入只有一行，即某个特定的年份（大于或等于1998年）。 

输出
输出只有一行，即在这一年中，出现了多少次既是13号又是星期五的情形。 

样例输入
1998 

样例输出
3
*/
public class BlackFriday {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		int sum = 0;
		Calendar calendar = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			calendar.set(year, i, 13);
			if (calendar.get(Calendar.DAY_OF_WEEK) == 6) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
