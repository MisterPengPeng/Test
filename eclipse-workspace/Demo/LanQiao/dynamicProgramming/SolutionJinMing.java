package dynamicProgramming;

import java.util.Scanner;

public class SolutionJinMing {
	
	static int n;
	static int m;
	static int[] v;
	static int[] p;
	static int[] q;
	static int[] f;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		v = new int[m];
		p = new int[m];
		q = new int[m];
		f = new int[n];
		for (int i = 0; i < m; i++) {
			v[i] = scanner.nextInt();
			p[i] = scanner.nextInt();
			q[i] = scanner.nextInt();
		}
		
		scanner.close();
		
	}
}
