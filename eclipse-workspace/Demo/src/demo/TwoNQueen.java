package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
** 2n�ʺ����� **

����һ��n*n�����̣���������һЩλ�ò��ܷŻʺ�.
����Ҫ�������з���n���ڻʺ��n���׻ʺ�ʹ����������ڻʺ󶼲���ͬһ�С�ͬһ�л�ͬһ���Խ����ϣ�����������׻ʺ󶼲���ͬһ�С�ͬһ�л�ͬһ���Խ�����.
���ܹ��ж����ַŷ���
nС�ڵ���8.

����
����ĵ�һ��Ϊһ������n����ʾ���̵Ĵ�С�� 
������n�У�ÿ��n��0��1�����������һ������Ϊ1����ʾ��Ӧ��λ�ÿ��ԷŻʺ����һ������Ϊ0����ʾ��Ӧ��λ�ò����ԷŻʺ� 

���
���һ����������ʾ�ܹ��ж����ַŷ��� 

��������
4 
1  1  1  1 
1  1  1  1 
1  1  1  1 
1  1  1  1 

�������
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
