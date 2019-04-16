package lanQiaoSixthC;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int penWidth = in.nextInt();
		int height = in.nextInt();
		
		in.close();
		
		long time = System.currentTimeMillis();
		int[][] data = new int[height][penWidth + height - 1];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = 0;
			}
		}
		
		for (int i = 0; i < height; i++) {
			for (int j = i; j < i + penWidth; j++) {
				data[i][j] = 1;
			}
			
			for (int j = data[i].length - 1 - i; j >= data[i].length - i - penWidth; j--) {
				data[i][j] = 1;
			}
		}
		
		for (int[] a : data) {
			for (int b : a) {
				System.out.print(b == 0 ? '.' : '*');
			}
			System.out.println();
		}
		System.out.println(System.currentTimeMillis() - time);
	}
}
