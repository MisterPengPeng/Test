package recursion;

import java.util.Scanner;

/*
** 瓷砖铺放 **
题目描述
有一长度为N(1< =Ｎ< =10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？ 
例如，长度为4的地面一共有如下5种铺法： 
4=1+1+1+1 
4=2+1+1 
4=1+2+1 
4=1+1+2 
4=2+2 
编程用递归的方法求解上述问题。 

输入
只有一个数N，代表地板的长度 

输出
输出一个数，代表所有不同的瓷砖铺放方法的总数 

样例输入
4

样例输出
5
*/
public class TileLaying {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Recursion(n));
	}
	
	public static int Recursion(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		
		return  Recursion(n - 1) + Recursion(n - 2);
	}
}
