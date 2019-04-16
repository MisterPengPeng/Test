package recursion;

import java.util.Scanner;

/*
** 递归练习3：求二项式系数值 **
题目描述
C(k n) = 1								k=0 | k=n
		 C(k n-1) + C(k-1 n-1)			0 < k < n
输入
一行，k和n，以空格分隔

输出
C(k n)的值

样例输入
3 10

样例输出
120
*/
public class BinomialCoefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Function(k, n));
	}

	public static int Function(int k, int n) {
		if (k == 0 | k == n) {
			return 1;
		} else if (k < n && k > 0) {
			return Function(k, n - 1) + Function(k - 1, n - 1);
		} else {
			return 0;
		}
	}
}
