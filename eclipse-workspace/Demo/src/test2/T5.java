package test2;

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		sc.close();
		
		f(x, 0, n);
	}
	
	public static void f(long input, long currentStep, long destinationStep) {
		if (currentStep == destinationStep) {
			System.out.println(input);
			return;
		}
		long nextInput = 0l;
		while (input != 0) {
			nextInput += Math.pow(input % 10, 2);
			input /= 10;
		}
		f(nextInput, currentStep + 1, destinationStep);
	}
}
