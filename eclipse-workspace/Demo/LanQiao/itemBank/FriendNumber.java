package itemBank;

import java.util.Scanner;

public class FriendNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		sc.close();
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= input1 / 2; i++) {
			if (input1 % i == 0) {
				sum1 += i;
			}
		}
		
		for (int i = 1; i <= input2 / 2; i++) {
			if (input2 % i == 0) {
				sum2 += i;
			}
		}
		
		if (sum1 == input2 && sum2 == input1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
