package wtf;

import java.util.Scanner;

public class MonkeyShareApple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		int sum = (int)Math.pow(n, n + 1) - (n - 1) * m;
		
		System.out.println(sum);
	}
}
