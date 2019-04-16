package itemBank;

import java.util.Scanner;

public class AestheticClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] data = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (check(data[i], data[j])) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
	
	public static boolean check(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
