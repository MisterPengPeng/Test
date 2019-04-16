package test3;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int n = sc.nextInt();
		
		sc.close();
		
		f(input, n);
	}
	
	public static void f(String input, int step) {
		if (step == 0) {
			System.out.println(input);
			return;
		}
		StringBuilder temp = new StringBuilder(input);
		for (int i = 0; i < temp.length(); i += 2) {
			int counter = 1;
			if (i + counter < temp.length()) {
				while (temp.charAt(i + counter) == temp.charAt(i)) {
					counter++;
					if (i + counter >= temp.length() - 1) {
						break;
					}
				}
			}
			temp.replace(i, i + counter, counter + "" + temp.charAt(i));
		}
		f(temp.toString(), step - 1);
	}
}
