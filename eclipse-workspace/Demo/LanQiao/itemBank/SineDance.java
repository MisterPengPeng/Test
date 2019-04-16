package itemBank;

import java.util.Scanner;

public class SineDance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Sn(N, 1));
	}
	
	public static String Sn(int x, int y) {
		if (x <= 1) {
			return An(x) + "+" + y;
		}
		return "(" + Sn(x - 1, y + 1) + ")" + An(x) + "+" + y;
	}
	
	public static String An(int x) {
		return Sin(x, 1);
	}
	
	public static String Sin(int x, int i) {
		if (x <= 1) {
			return "sin(" + (x + i - 1) + ")";
		}
		return "sin(" + (i) + (i % 2 == 0 ? "+" : "-") + Sin(x - 1, i + 1) + ")";
	}
}
