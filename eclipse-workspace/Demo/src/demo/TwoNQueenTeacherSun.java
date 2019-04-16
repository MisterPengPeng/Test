package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoNQueenTeacherSun {
	static int N;
	static final int NO = 0;
	static final int YES = 1;
	static final int QUEEN = 2;
	static ArrayList<int[][]> solutions = new ArrayList<int[][]>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[][] board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		eightQueen(board, 0);
		int counter = 0;
		for (int i = 0; i < solutions.size(); i++) {
			for (int j = i + 1; j < solutions.size(); j++) {
				if (isOK(solutions.get(i), solutions.get(j))) {
					counter += 2;
				}
			}
		}
		System.out.println(counter);
	}
	
	public static boolean isOK(int[][] board1, int[][] board2) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board1[i][j] == QUEEN && board2[i][j] == QUEEN) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void eightQueen(int[][] board, int hangHao) {
		for (int i = 0; i < N; i++) {
			if (board[hangHao][i] == NO) {
				continue;
			}
			playQueen(board[hangHao], i);
			if (isValid(board, hangHao, i)) {
				if (hangHao == N - 1) {
					saveSolution(board);
				} else {
					eightQueen(board, hangHao + 1);
				}
			}
		}
	}
	
	public static void playQueen(int[] hang, int lie) {
		for (int i = 0; i < N; i++) {
			if (hang[i] == NO) {
				continue;
			}
			hang[i] = YES;
		}
		hang[lie] = QUEEN;
	}
	
	public static boolean isValid(int[][] board, int hangHao, int lieHao) {
		// 同一列
		for (int i = 0; i < hangHao; i++) {
			if (board[i][lieHao] == board[hangHao][lieHao]) {
				return false;
			}
		}
		
		// 左上方向斜线
		int i, j;
		for (i = hangHao - 1, j = lieHao - 1;i >= 0 && j >= 0;i--, j--) {
			if (board[i][j] == board[hangHao][lieHao]) {
				return false;
			}
		}
		
		// 右上方向斜线
		for (i = hangHao - 1, j = lieHao + 1;i >= 0 && j < N;i--, j++) {
			if (board[i][j] == board[hangHao][lieHao]) {
				return false;
			}
		}
		return true;
	}
	
	public static void saveSolution(int[][] board) {
		int[][] newboard = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				newboard[i][j] = board[i][j];
			}
		}
		solutions.add(newboard);
	}
	
//	static int counter = 0;
//	public static void printBoard(int[][] board) {
//		counter++;
//		System.out.println();
//		System.out.println(counter + ":");
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (board[i][j] == YES) {
//					System.out.print("X ");
//				} else if (board[i][j] == NO) {
//					System.out.print("+ ");
//				} else {
//					System.out.print("Q ");
//				}
//			}
//			System.out.println();
//		}
//	}
}