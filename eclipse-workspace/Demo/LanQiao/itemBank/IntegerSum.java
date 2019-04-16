package itemBank;

import java.util.Scanner;

public class IntegerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= input / 2 + 1; i++) {
			int sum = i;
			for (int j = i + 1; j <= input / 2 + 1; j++) {
				sum += j;
				if (sum > input) {
					break;
				}
				if (sum == input) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}