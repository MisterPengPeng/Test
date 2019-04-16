package lanQiaoFifthC;

public class T1 {
	public static void main(String[] args) {
		int N = 8;
		int[][] a = new int[N][N];

		for (int i = 0; i < N; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
		}

		for (int i = 1; i < N; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1]; // МоїХ
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(String.format("%-5d", a[i][j]));
			System.out.println();
		}
	}
}
