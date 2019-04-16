package lanQiaoSixthC;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int w = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		
		in.close();
		
		int currentNum = 1;
		int mI = -1;
		int mJ = -1;
		int nI = -1;
		int nJ = -1;
		for (int i = 1; i <= Integer.MAX_VALUE;) {
			for (int j = 1; j <= w;) {
				if (nI != -1 && nJ != -1 && mI != -1 && mJ != -1) {
					System.out.println(Math.abs((nI - mI) + (nJ - mJ)));
					return;
				}
				if (currentNum == m) {
					mI = i - 1;
					mJ = j - 1;
				} else if (currentNum == n) {
					nI = i - 1;
					nJ = j - 1;
				}
				if (i % 2 == 0 ? j == 1 : j == w) {
					i++;
					j = i % 2 == 0 ? w : 1;
					currentNum++;
				} else {
					j = i % 2 == 0 ? j - 1 : j + 1;
					currentNum++;
				}
			}
		}
	}
}
