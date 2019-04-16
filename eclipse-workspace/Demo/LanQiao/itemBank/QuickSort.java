package itemBank;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] data = new int[input];
		for (int i = 0; i < input; i++) {
			data[i] = sc.nextInt();
		}
		
		sc.close();
		
		
		Arrays.sort(data);
		for (int i : data) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis() - time);
	}
}
