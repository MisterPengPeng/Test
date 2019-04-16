package itemBank;

import java.util.Scanner;

public class FJString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(f(N));
	}
	
	public static String f(int N) {
		if (N == 1) {
			return "A";
		}
		
		return f(N - 1) + (char)('A' + N - 1) + f(N - 1);
	}
}
