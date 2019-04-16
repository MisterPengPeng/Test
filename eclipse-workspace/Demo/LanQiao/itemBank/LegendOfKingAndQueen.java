package itemBank;

import java.util.Scanner;

public class LegendOfKingAndQueen {
	
	static int n;				//�ʹ���С, n * n
	static int[][] map;			//���ʼֵΪ0, ��ʾ���Է��ûʺ�;������ռ��ĵط���1, ���ʺ�ռ��ĵط���2.
	static boolean[][] book;	//�����ò���, �ǵ�ɾ��
	static int x;				//����λ��x, ��Ϊ���������Ǵ�1��ʼ, �������±���㿪ʼ, ���Լ�1, yͬ��.
	static int y;				//����λ��y.
	static int counter = 0;		//ͳ�Ʒ�����
	
	public static void main(String[] args) {
		
		//�û�����
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];		//�����ʹ�
		book = new boolean[n][n];	//��������
		x = sc.nextInt() - 1;
		y = sc.nextInt() - 1;
		
		sc.close();
		
		//��ʼ������
		king();		//������ռ��ĵط�����Χ�Ÿ��˸����ӱ�Ϊ1, ���������λ���ڻʹ��߽�λ��, ����Գ���λ��.
		
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
