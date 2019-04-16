package dynamicProgramming;

import java.util.Scanner;

public class HappyJin {
	
	static int N;		//总钱数
	static int m;		//希望购买的物品个数
	static int[] v;		//价格
	static int[] p;		//重要度
	static int[] f = new int[30001];
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		m = scanner.nextInt();
		v = new int[m];
		p = new int[m];
		for (int i = 0; i < m; i++) {
			v[i] = scanner.nextInt();
			p[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < m; i++) {
			for (int j = N; j >= v[i]; j--) {
				if (f[j] <= f[j - v[i]] + v[i] * p[i]) {
					f[j] = f[j - v[i]] + v[i] * p[i];
				}
			}
		}
		System.out.println(f[N]);
	}
}
