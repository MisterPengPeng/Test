package demo;

import java.util.Scanner;

/*
2. 分糖果
问题描述
有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
每个小朋友都把自己的糖果分一半给左手边的孩子。
一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
反复进行这个游戏，直到所有小朋友的糖果数都相同为止
你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。

输入格式
程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）

输出格式
要求程序输出一个整数，表示老师需要补发的糖果数。

样例输入
3
2 2 4

样例输出
4
*/
public class ShareCandyPractice {
	
	static int[] candy;
	static int counter;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		candy = new int[N];
		for (int i = 0; i < N; i++) {
			candy[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Recursion(candy);
	}
	
	public static void Recursion(int[] candy) {
		
		int book = 0;
		for (int i = 1; i < candy.length; i++) {
			if (candy[i - 1] == candy[i]) {
				book++;
			}
		}
		if (book == candy.length - 1) {
			System.out.println(counter);
			return;
		}
		
		for (int i = 0; i < candy.length; i++) {
			candy[i] /= 2;
		}
		
		int[] temp = new int[candy.length];
		for (int i = 0; i < candy.length; i++) {
			temp[i] = candy[i]; 
		}
		for (int i = 0; i < candy.length; i++) {
			if (i == candy.length - 1) {
				candy[0] += temp[candy.length - 1];
			} else {
				candy[i + 1] += temp[i];
			}
		}
		
		for (int i = 0; i < candy.length; i++) {
			if (candy[i] % 2 != 0) {
				candy[i]++;
				counter++;
			}
		}
		
		Recursion(candy);
	}
}
