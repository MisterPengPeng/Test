package lanQiaoFifthC;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class T6 {
	
	static boolean[] book = new boolean[31];
	static TreeSet<String> check = new TreeSet<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		long time = System.currentTimeMillis();
		int[] data = new int[n];
		f(n, data, 0);
		while (!check.isEmpty()) {
			String[] temp = check.pollFirst().split(",");
			for (int i = 0; i < temp.length; i++) {
				System.out.print("1/" + temp[i] + " ");
			}
			System.out.println();
		}
		System.out.println(System.currentTimeMillis() - time);
	}
	
	public static void f(int total, int[] data, int index) {
		if (index == total) {
			if (check(data) && check.add(toString(data))) {}
			return;
		}
		
		for (int i = 2; i <= 30; i++) {
			if (!book[i]) {
				book[i] = true;
				data[index] = i;
				f(total, data, index + 1);
				data[index] = 0;
				book[i] = false;
			}
		}
	}

	private static String toString(int[] data) {
		Arrays.sort(data);
		String temp = "";
		for (int i = 0; i < data.length; i++) {
			temp += data[i] + ",";
		}
		
		return temp;
	}

	private static boolean check(int[] data) {
		int denominator = 1;
		int numerator = 0;
		for (int i = 0; i < data.length; i++) {
			denominator *= data[i];
		}
		for (int i = 0; i < data.length; i++) {
			numerator += denominator / data[i];
		}
		
		if (numerator == denominator) {
			return true;
		}
		return false;
	}
}
