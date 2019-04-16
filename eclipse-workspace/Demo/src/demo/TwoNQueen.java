package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
** 2n皇后问题 **

给定一个n*n的棋盘，棋盘中有一些位置不能放皇后.
现在要向棋盘中放入n个黑皇后和n个白皇后，使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或同一条对角线上.
问总共有多少种放法？
n小于等于8.

输入
输入的第一行为一个整数n，表示棋盘的大小。 
接下来n行，每行n个0或1的整数，如果一个整数为1，表示对应的位置可以放皇后，如果一个整数为0，表示对应的位置不可以放皇后。 

输出
输出一个整数，表示总共有多少种放法。 

样例输入
4 
1  1  1  1 
1  1  1  1 
1  1  1  1 
1  1  1  1 

样例输出
2
*/
public class TwoNQueen {
	static int N;
	static final int NO = 0;
	static final int YES = 1;
	static final int QUEEN = 2;
	static ArrayList<int[][]> solutions = new ArrayList<int[][]>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int[][] board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
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
	
	public static void eightQueen(int[][] board, int line) {
		for (int i = 0; i < N; i++) {
			if (board[line][i] == NO) {
				continue;
			}
			PlayQueen(board[line], i);
			if (IsValid(board, line, i)) {
				if (line == N - 1) {
					SaveSolution(board);
				} else {
					eightQueen(board, line + 1);
				}
			}
		}
	}
	
	public static void PlayQueen(int[] line, int column) {
		for (int i = 0; i < N; i++) {
			if (line[i] == NO) {
				continue;
			}
			line[i] = YES;
		}
		line[column] = QUEEN;
	}
	
	public static boolean IsValid(int[][] board, int line, int column) {
		for (int i = 0; i < line; i++) {
			if (board[i][column] == board[line][column]) {
				return false;
			}
		}
		
		int i;
		int j;
		for (i = line - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == board[line][column]) {
				return false;
			}
		}
		
		for (i = line - 1, j = column + 1; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == board[line][column]) {
				return false;
			}
		}
		return true;
	}
	
	public static void SaveSolution(int[][] board) {
		int[][] newBoard = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				newBoard[i][j] = board[i][j];
			}
		}
		solutions.add(newBoard);
	}
}
