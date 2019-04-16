package test4;

import java.util.LinkedList;
import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int times = in.nextInt();
		
		LinkedList<int[]> data = new LinkedList<int[]>();
		for (; times > 0; times--) {
			in.nextLine();
			int n = in.nextInt();
			int[] time = new int[n];
			for (int i = 0; i < n; i++) {
				time[i] = in.nextInt();
			}
			data.add(time);
		}
		in.close();
		
		while (!data.isEmpty()) {
			
		}
	}
}
