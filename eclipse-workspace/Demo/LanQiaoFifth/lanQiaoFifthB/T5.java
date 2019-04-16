package lanQiaoFifthB;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class T5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		in.close();
		
		int counter = 0;
		TreeSet<String> book = new TreeSet<String>();
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(n, 2)) {
					int[] data = {i, j, n};
					Arrays.sort(data);
					String temp = data[0] + "" + data[1] + "" + data[2];
					if (book.add(temp)) {
						counter++;
					}
				}
			}
		}
		
		System.out.println(counter);
	}
}
