package demo;

import java.util.Scanner;

public class FibonaciDP {
	
	static int input;
	static long[] data;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		input = in.nextInt();
		data = new long[input + 1];
		data[1] = 1;
		data[2] = 1;
		for (int i = 3; i <= input; i++) {
			data[i] = -1;
		}
		
		in.close();
		
		System.out.println(f(input));
	}
	
	public static long f(int n) {
		if (n == 1 && n == 2) {
			return data[n];
		}
		if (data[n] == -1) {
			data[n] = f(n - 1) + f(n - 2);
		}
		return data[n];
	}
}
