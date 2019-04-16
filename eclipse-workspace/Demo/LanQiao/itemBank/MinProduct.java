package itemBank;

import java.util.Arrays;
import java.util.Scanner;

public class MinProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] answer = new int[T];
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int[][] data = new int[2][n];
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < n; k++) {
					data[j][k] = sc.nextInt();
				}
			}
			
			Arrays.sort(data[0]);
			Arrays.sort(data[1]);
			reverse(data[1]);
			int sum = 0;
			for (int a = 0; a < n; a++) {
				sum += (data[0][a] * data[1][a]);
			}
			answer[i] = sum;
		}
		sc.close();
		
		for (int i : answer) {
			System.out.println(i);
		}
	}
	
	public static void reverse(int[] data) {
		for (int i = 0; i < data.length / 2; i++) {
			swap(data, i, data.length - 1 - i);
		}
	}
	
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
