package itemBank;

import java.util.Scanner;

public class SequenceFeatures {
	
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = scanner.nextInt();
			if (data[i] < min) {
				min = data[i];
			}
			if (data[i] > max) {
				max = data[i];
			}
			sum += data[i];
		}
		
		scanner.close();
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
