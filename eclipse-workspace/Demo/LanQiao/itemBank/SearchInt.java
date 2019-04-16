package itemBank;

import java.util.Scanner;

public class SearchInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		char[] data = new char[n];
		for (int i = 0; i < n; i++) {
			data[i] = (char) scanner.nextInt();
		}
		int needSearch = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < n; i++) {
			if (data[i] == needSearch) {
				System.out.println(i + 1);
				return;
			}
		}
		
		System.out.println(-1);
	}
}
