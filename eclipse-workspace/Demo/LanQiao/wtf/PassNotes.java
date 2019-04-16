package wtf;

import java.util.Scanner;

public class PassNotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int dp[][][][] = new int[55][55][55][55];
		int map[][] = new int[55][55];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					int l = i + j - k;
					if (l <= 0 || l > m) {
						continue;
					}
					dp[i][j][k][l] = Math.max(Math.max(dp[i - 1][j][k - 1][l], dp[i - 1][j][k][l - 1])
							, Math.max(dp[i][j - 1][k - 1][l], dp[i][j - 1][k][l - 1]));
					if (i == k && j == l) {
						dp[i][j][k][l] += map[i][j];
					} else {
						dp[i][j][k][l] += map[i][j] + map[k][l];
					}
				}
			}
		}
		System.out.println(dp[n][m][n][m]);
	}
}
