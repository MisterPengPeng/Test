package itemBank;

import java.util.Scanner;

public class TwoNQueen {

	static int size;
	static int[][] map;
	static int counter = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		size = scanner.nextInt();
		map = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				map[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		dfs(0, 2);
		System.out.println(counter);
	}

	public static void dfs(int i, int queenType) {
		if (i == size) {
			if (queenType == 2) {
				dfs(0, 3);
			} else {
				counter++;
			}
			return;
		}

		for (int j = 0; j < size; j++) {
			if (map[i][j] == 1 && check(i, j, queenType)) {
				map[i][j] = queenType;
				dfs(i + 1, queenType);
				map[i][j] = 1;
			}
		}

//		for (int j = 0; j < size; j++) {
//			
//		}
	}

	public static boolean check(int i, int j, int queen) {
		// upLeft
		if (i != 0 && j != 0) {
			for (int a = i - 1, b = j - 1; a >= 0 && b >= 0; a--, b--) {
				if (map[a][b] == queen) {
					return false;
				}
			}
		}

		// up
		if (i != 0) {
			for (int a = i - 1; a >= 0; a--) {
				if (map[a][j] == queen) {
					return false;
				}
			}
		}

		// upRight
		if (i != 0 && j < size - 1) {
			for (int a = i - 1, b = j + 1; a >= 0 && b < size; a--, b++) {
				if (map[a][b] == queen) {
					return false;
				}
			}
		}

		return true;
	}

}
