package itemBank;

import java.util.Arrays;
import java.util.Scanner;

public class SearchK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[][]	demand = new int[m][3];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				demand[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for (int i = 0; i < m; i++) {
			int[] temp = Arrays.copyOfRange(data, demand[i][0] - 1, demand[i][1]);
//			int[] temp = new int[demand[i][1] - demand[i][0] + 1];
			Arrays.sort(temp);
			reverse(temp);
			System.out.println(temp[demand[i][2] - 1]);
		}
	}
	
	public static void reverse(int[] data) {
		for (int i = 0; i < data.length / 2; i++) {
			swap(data, i, data.length - 1 - i);
		}
	}
	
	public static void swap(int[] data, int i, int j) {
		int temp = 0;
		temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
