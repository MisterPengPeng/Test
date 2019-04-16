package demo;

import java.util.Scanner;

/*
问题： 
一个人买汽水，一块钱一瓶汽水，三个瓶盖可以换一瓶汽水，两个空瓶可以换一瓶汽水 
问20块钱可以买多少汽水？
*/
public class BuySoda {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int money = in.nextInt();
		
		in.close();
		f(money, money, money);
	}
	
	public static void f(int bottle, int cap, int total) {
		if (bottle < 2 && cap < 3) {
			System.out.println(total);
			return;
		}
		
		//新换了几瓶汽水
		int newSoda = 0;
		
		//两个瓶身换一瓶, 除以二
		//三个瓶盖换一瓶, 除以三
		newSoda += bottle / 2;
		newSoda += cap / 3;
		
		//换了之后还剩多少个瓶盖和瓶身
		bottle %= 2;
		cap %= 3;
		
		//已经换过的汽水再加上新换的汽水
		total += newSoda;
		
		//又得到了新的瓶身和瓶盖
		bottle += newSoda;
		cap += newSoda;
		
		f(bottle, cap, total);	//进行下一轮换汽水
	}
}
