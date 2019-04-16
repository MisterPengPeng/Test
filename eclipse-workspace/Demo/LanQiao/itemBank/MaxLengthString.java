package itemBank;

import java.util.Scanner;

public class MaxLengthString {
	
	static int max = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] data = new String[5];
		for (int i = 0; i < 5; i++) {
			data[i] = sc.next();
			if (data[i].length() > data[max].length()) {
				max = i;
			}
		}
		
		sc.close();
		
		System.out.println(data[max]);
	}
}
