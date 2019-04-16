package itemBank;

import java.util.Scanner;

public class TakeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int[][] data = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int counter = 0;
		int i = -1;
		int j = 0;
		while (counter < row * column) {
			while (i + 1 < row && data[i + 1][j] != -1) {
				System.out.print(data[++i][j] + " ");
				data[i][j] = -1;
				counter++;
			}
			while (j + 1 < column && data[i][j + 1] != -1) {
				System.out.print(data[i][++j] + " ");
				data[i][j] = -1;
				counter++;
			}
			while (i - 1 >= 0 && data[i - 1][j] != -1) {
				System.out.print(data[--i][j] + " ");
				data[i][j] = -1;
				counter++;
			}
			while (j - 1 >= 0 && data[i][j - 1] != -1) {
				System.out.print(data[i][--j] + " ");
				data[i][j] = -1;
				counter++;
			}
		}
	}
}
