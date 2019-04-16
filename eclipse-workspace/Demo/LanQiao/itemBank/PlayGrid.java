package itemBank;

import java.util.Scanner;

public class PlayGrid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		int[][] task = new int[m][3];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				task[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for (int i = 0; i < m; i++) {
			int p = task[i][0];
			int x = task[i][1];
			int y = task[i][2];
			switch (p) {
				case 1:
					data[x - 1] = y;
					break;
				
				case 2:
					int sum = 0;
					for (int j = x - 1; j <= y - 1; j++) {
						sum += data[j];
					}
					System.out.println(sum);
					break;
					
				case 3:
					int max = data[x - 1];
					for (int j = x; j <= y - 1; j++) {
						if (data[j] > max) {
							max = data[j];
						}
					}
					System.out.println(max);
					break;
				
				default:
					break;
			}
		}
	}
}
