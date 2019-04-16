package lanQiaoSeventhB;

public class T6 {

	static int counter = 0;
	static int[][] data = new int[3][4];
	static boolean[] book = new boolean[10];

	static {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				data[i][j] = -5;
			}
		}
	}

	public static void main(String[] args) {
		f(0, 1);
		System.out.println(counter);
	}

	private static void f(int i, int j) {
		if (i == 2 && j == 3) {
			counter++;
//			for (int[] a : data) {
//				for (int b : a) {
//					System.out.print(b + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
			return;
		}

		for (int k = 0; k <= 9; k++) {
			if (!book[k]) {
				book[k] = true;
				if (i > 0 && j > 0 && Math.abs(k - data[i - 1][j - 1]) != -1 
						&& Math.abs(k - data[i][j - 1]) != 1
						&& Math.abs(k - data[i - 1][j]) != 1) {
					if (j != 3 && Math.abs(k - data[i - 1][j + 1]) != 1) {
						data[i][j] = k;
						f(j == 3 ? i + 1 : i, j == 3 ? 0 : j + 1);
						data[i][j] = -5;
						book[k] = false;
					} else if (j == 3) {
						data[i][j] = k;
						f(j == 3 ? i + 1 : i, j == 3 ? 0 : j + 1);
						data[i][j] = -5;
						book[k] = false;
					}
					continue;
				}
				if (i == 0 && Math.abs(k - data[i][j - 1]) != 1) {
					data[i][j] = k;
					f(j == 3 ? i + 1 : i, j == 3 ? 0 : j + 1);
					data[i][j] = -5;
					book[k] = false;
					continue;
				}
				if (j == 0 && Math.abs(k - data[i - 1][j]) != 1
						&& Math.abs(k - data[i - 1][j + 1]) != 1) {
					data[i][j] = k;
					f(j == 3 ? i + 1 : i, j == 3 ? 0 : j + 1);
					data[i][j] = -5;
					book[k] = false;
					continue;
				}
				if (j == 3 && i != 0 && Math.abs(k - data[i - 1][j - 1]) != -1 
						&& Math.abs(k - data[i][j - 1]) != 1
						&& Math.abs(k - data[i - 1][j]) != 1) {
					data[i][j] = k;
					f(j == 3 ? i + 1 : i, j == 3 ? 0 : j + 1);
					data[i][j] = -5;
					book[k] = false;
					continue;
				}
				
			}
		}
	}
}
