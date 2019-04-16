package lanQiaoSeventhC;

import java.util.Scanner;

public class T8 {
	
	static int max;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		in.close();

		if (N <= 2) {
			System.out.println(4);
			return;
		}
		
		for (int i = 2; i < N; i++) {
			fac(i);
		}
		
		System.out.println(max);
	}
	
	static void fac(int n) {
		 
		if (n == 1) {
			return;
		} else if (n % 2 == 0) {
			n = n / 2;
			fac(n);
		} else {
			n = n * 3 + 1;
			fac(n);
		}
 
		if (n > max) {
			max = n;
		}
	}
}
