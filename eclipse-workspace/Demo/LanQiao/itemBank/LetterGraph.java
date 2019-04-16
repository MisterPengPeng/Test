package itemBank;

import java.util.Scanner;

public class LetterGraph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		scanner.close();
		
		char[][] letter = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int l = 0, j = 'A' + i; l < i && l < m; l++, j--) {
				letter[i][l] = (char) j;
				System.out.print(letter[i][l]);
			}
			for (int k = 0 + i, j = 'A'; k < m; k++, j++) {
				letter[i][k] = (char) j;
				System.out.print(letter[i][k]);
			}
			System.out.println();
		}
	}
}
