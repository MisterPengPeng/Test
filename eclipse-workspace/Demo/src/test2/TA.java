package test2;

import java.util.Scanner;

public class TA {
	
	static int[][] board = new int[9][9];
	static boolean[][] book = new boolean[9][9];
	static boolean[][] rowUsed = new boolean[9][10];
	static boolean[][] columnUsed = new boolean[9][10];
	static boolean[][] gridUsed = new boolean[9][10];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			String str = sc.next();
			for (int j = 0; j < 9; j++) {
				int n = str.charAt(j) - '0';
				board[i][j] = n;
				book[i][j] = (n == 0);
				rowUsed[i][n] = true;
				columnUsed[j][n] = true;
				int gNum = toGridNumber(i, j);
				gridUsed[gNum][n] = true;
			}
		}
		
		sc.close();
		
		dfs(0, 0);
	}
	
	public static void dfs(int i, int j) {
		int newI;
		int newJ;
		if (j == 8) {
			newJ = 0;
			newI = i + 1;
		} else {
			newJ = j + 1;
			newI = i;
		}
		if (!book[i][j]) {
			if (i == 8 && j == 8) {
				print();
			} else {
				dfs(newI, newJ);
			}
		} else {
			int gNum = toGridNumber(i, j);
			for (int n = 1; n <= 9; n++) {
				if ((!rowUsed[i][n]) && (!columnUsed[j][n]) && (!gridUsed[gNum][n])) {
					board[i][j] = n;
					if (i == 8 && j == 8) {
						print();
					} else {
						rowUsed[i][n] = true;
						columnUsed[j][n] = true;
						gridUsed[gNum][n] = true;
						dfs(newI, newJ);
						rowUsed[i][n] = false;
						columnUsed[j][n] = false;
						gridUsed[gNum][n] = false;
					}
				}
			}
		}
	}
	
	public static int toGridNumber(int i, int j) {
		int Di = i / 3;
		int Dj = j / 3;
		return Di * 3 + Dj;
	}
	
	public static void print() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}