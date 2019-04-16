package dynamicProgramming;

import java.util.Scanner;

public class BallGame {
	static int[] n = new int[3];
	static int[] x = new int[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < x.length; i++) {
			System.out.print(dfs(x[i], 0, 0, true) + " ");
		}
	}

	public static char dfs(int rest, int inHand1, int inHand2, boolean should1Play) {
		boolean gameOver = true;
 		boolean canDraw = false;
		for (int i = 0; i < n.length; i++) {
			if (n[i] <= rest) {
				gameOver = false;
				int new1 = inHand1;
				int new2 = inHand2;
				if (should1Play) {
					new1 += n[i];
				} else {
					new2 += n[i];
				}
 				char result = dfs(rest - n[i], new1, new2, !should1Play);
				if (should1Play) {
 					if (result == '+') {
						return '+';
					} else if (result == '0') {
						canDraw = true;
					}
				} else {
					if (result == '-') {
						return '-';
					} else if (result == '0') {
						canDraw = true;
					}
				}
			}
		}
		if (gameOver) {
			boolean win1 = inHand1 % 2 == 1;
			boolean win2 = inHand2 % 2 == 1;
			if (win1) {
				if (win2) {
					return '0';
				} else {
					return '+';
				}
			} else {
				if (win2) {
					return '-';
				} else {
					return '0';
				}
			}
		} else {
			if (canDraw) {
				return '0';
			} else {
				if (should1Play) {
					return '-';
				} else {
					return '+';
				}
			}
		}
	}
}
