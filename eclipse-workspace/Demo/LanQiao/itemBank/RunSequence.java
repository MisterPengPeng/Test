package itemBank;

import java.util.Scanner;

public class RunSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		sc.close();
		
		System.out.println((int)(Math.pow(2, k) - k - 1) * 2);
	}
}
