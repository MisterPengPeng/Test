package demo;

import java.util.Scanner;

/*
	分糖果
	
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
public class ShareCandy {
	static int addedCandy = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int children = scanner.nextInt();
		int[] candy = new int[children];
		for (int i = 0; i < children; i++) {
			candy[i] = scanner.nextInt();
		}
		scanner.close();
		Recursion(candy);
	}
	
	public static void Recursion(int[] arr) {
		int[] tempCandy = new int[arr.length];		//暂存小朋友糖果的一半
		for (int i = 0; i < arr.length; i++) {
			tempCandy[i] = arr[i] / 2;
			arr[i] = arr[i] / 2;
		}
		
		//分糖, 一轮结束
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] += tempCandy[tempCandy.length - 1];
			} else {
				arr[i] += tempCandy[i - 1];
			}
		}
		
		//补糖
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i]++;
				addedCandy++;
			}
		}
		if (CheckAndPrint(arr)) {
			System.out.println(addedCandy);
		} else {
			Recursion(arr);
		}
	}
	
	//检查所有小朋友的糖果是不是一样多, 如果一样多, 输出补糖数
	public static boolean CheckAndPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[0]) {
				return false;
			}
		}
		return true;
	}
}





















