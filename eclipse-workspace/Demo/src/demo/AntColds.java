package demo;

import java.util.Scanner;

/*
** 蚂蚁感冒 **

问题描述
　　长100厘米的细长直杆子上有n只蚂蚁。它们的头有的朝左，有的朝右。
　　每只蚂蚁都只能沿着杆子向前爬，速度是1厘米/秒。
　　当两只蚂蚁碰面时，它们会同时掉头往相反的方向爬行。
　　这些蚂蚁中，有1只蚂蚁感冒了。并且在和其它蚂蚁碰面时，会把感冒传染给碰到的蚂蚁。
　　请你计算，当所有蚂蚁都爬离杆子时，有多少只蚂蚁患上了感冒。

输入格式
　　第一行输入一个整数n (1 < n < 50), 表示蚂蚁的总数。
　　接着的一行是n个用空格分开的整数 Xi (-100 < Xi < 100), Xi的绝对值，表示蚂蚁离开杆子左边端点的距离。正值表示头朝右，负值表示头朝左，数据中不会出现0值，也不会出现两只蚂蚁占用同一位置。其中，第一个数据代表的蚂蚁感冒了。

输出格式
　　要求输出1个整数，表示最后感冒蚂蚁的数目。
  
样例输入
3
5 -2 8
												.......8.-10.12.......-20....25...........................................................................
样例输出
1

样例输入
5
-10 8 -20 12 25

样例输出
3

*/
public class AntColds {
	public static void main(String args[]) {
		int L = 0;
		int	R = 0;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] kk = new int[n+1];
		for(int i = 1; i <= n; i++) {
			kk[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 2; i <= n; i++) {
			if (kk[1] > 0) {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0) {
					R++;
				}
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0) {
					L++;
				}
			} else {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0) {
					R++;
				}
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0) {
					L++;
				}
			}
		}
		if (L != 0 || R != 0) {
			System.out.println(R + L + 1);
		} else {
			System.out.println(1);
		}
	}	
}
	

