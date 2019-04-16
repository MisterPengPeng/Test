package itemBank;

import java.util.Scanner;

public class IsNarcissisticNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		if (check(input)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static boolean check(int input) {
		int temp = input;
		int sum = 0;
		while (temp != 0) {
			sum += Math.pow(temp % 10, 3);
			temp /= 10;
		}
		if (sum == input) {
			return true;
		}
		return false;
	}
}
