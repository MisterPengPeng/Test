package itemBank;

import java.util.Scanner;

public class ChipTesting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int chips = scanner.nextInt();
		int[][] data = new int[chips][chips];
		for (int i = 0; i < chips; i++) {
			for (int j = 0; j < chips; j++) {
				data[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int[] result = new int[chips];
		for (int j = 0; j < chips; j++) {
			int goodChip = 0;
			for (int i = 0; i < chips; i++) {
				if (i != j && data[i][j] == 1) {
					goodChip++;
				}
			}
			if (goodChip >= chips / 2) {
				result[j] = 1;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 1) {
				System.out.print((i + 1) + " ");
			}
		}
	}
}
