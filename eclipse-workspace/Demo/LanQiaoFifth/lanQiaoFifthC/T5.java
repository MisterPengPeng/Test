package lanQiaoFifthC;

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int step = sc.nextInt();
		
		sc.close();
		
		f(input, step);
	}

	private static void f(int input, int step) {
		if (step == 0) {
			System.out.println(input);
			return;
		}
		
		int sum = 0;
		int temp = input;
		while (temp != 0) {
			sum += Math.pow(temp % 10, 2);
			temp /= 10;
		}
		f(sum, step - 1);
	}
}
