package itemBank;

import java.util.Scanner;

public class LegendOfKingAndQueen {
	
	static int n;				//皇宫大小, n * n
	static int[][] map;			//设初始值为0, 表示可以放置皇后;被国王占领的地方是1, 被皇后占领的地方是2.
	static boolean[][] book;	//可能用不到, 记得删除
	static int x;				//国王位置x, 因为这里输入是从1开始, 而数组下标从零开始, 所以减1, y同理.
	static int y;				//国王位置y.
	static int counter = 0;		//统计方案数
	
	public static void main(String[] args) {
		
		//用户输入
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];		//建立皇宫
		book = new boolean[n][n];	//建立查重
		x = sc.nextInt() - 1;
		y = sc.nextInt() - 1;
		
		sc.close();
		
		//初始化数据
		king();		//将国王占领的地方和周围九个八个格子标为1, 如果国王的位置在皇宫边界位置, 则忽略超出位置.
		
		f(0);
		
		System.out.println(counter);
	}
	
	public static void f(int row) {
		if (row == n) {
			counter++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (map[row][i] == 0 && check(row, i)) {
				map[row][i] = 2;
				f(row + 1);
				map[row][i] = 0;
			}
		}
	}
	
	public static boolean check(int x, int y) {
		//up
		if (x > 0) {
			for (int i = x - 1; i >= 0; i--) {
				if (map[i][y] == 2) {
					return false;
				}
			}
		}
		
		//up left
		if (x > 0 && y > 0) {
			for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
				if (map[i][j] == 2) {
					return false;
				}
			}
		}
		
		//up right
		if (x > 0 && y < n - 1) {
			for (int i = x - 1, j = y + 1; i >= 0 && j < n; i--, j++) {
				if (map[i][j] == 2) {
					return false;
				}
			}
		}
		
		//left
		if (y > 0) {
			for (int i = y - 1; i >= 0; i--) {
				if (map[x][i] == 2) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void king() {
		map[x][y] = 1;
		if (0 < x && x < n - 1 && 0 < y && y < n - 1) {
			map[x - 1][y] = 1;
			map[x - 1][y - 1] = 1;
			map[x - 1][y + 1] = 1;
			map[x][y - 1] = 1;
			map[x][y + 1] = 1;
			map[x + 1][y] = 1;
			map[x + 1][y - 1] = 1;
			map[x + 1][y + 1] = 1;
		}
		
		if (x == 0 && 0 < y && y < n - 1) {
			map[x][y - 1] = 1;
			map[x][y + 1] = 1;
			map[x + 1][y] = 1;
			map[x + 1][y - 1] = 1;
			map[x + 1][y + 1] = 1;
		}
		
		if (x == 0 && y == 0) {
			map[x + 1][y] = 1;
			map[x + 1][y + 1] = 1;
			map[x][y + 1] = 1;
		}
		
		if (x == 0 && y == n - 1) {
			map[x + 1][y] = 1;
			map[x + 1][y - 1] = 1;
			map[x][y - 1] = 1;
		}
		
		if (x == n - 1 && 0 < y && y < n - 1) {
			map[x][y - 1] = 1;
			map[x][y + 1] = 1;
			map[x - 1][y] = 1;
			map[x - 1][y - 1] = 1;
			map[x - 1][y + 1] = 1;
		}
		
		if (x == n - 1 && y == 0) {
			map[x - 1][y] = 1;
			map[x - 1][y + 1] = 1;
			map[x][y + 1] = 1;
		}
		
		if (x == n - 1 && y == n - 1) {
			map[x][y - 1] = 1;
			map[x - 1][y - 1] = 1;
			map[x - 1][y] = 1;
		}
		
		if (y == 0 && 0 < x && x < n - 1) {
			map[x - 1][y] = 1;
			map[x - 1][y + 1] = 1;
			map[x][y + 1] = 1;
			map[x + 1][y] = 1;
			map[x + 1][y + 1] = 1;
		}
		
		if (y == n - 1 && 0 < x && x < n - 1) {
			map[x - 1][y] = 1;
			map[x - 1][y - 1] = 1;
			map[x][y - 1] = 1;
			map[x + 1][y - 1] = 1;
			map[x + 1][y] = 1;
		}
	}
}
