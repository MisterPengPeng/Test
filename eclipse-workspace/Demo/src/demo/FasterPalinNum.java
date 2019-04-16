package demo;

import java.util.Scanner;

public class FasterPalinNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNum = input.nextInt();
		long startTime = System.currentTimeMillis();
		PrintNum(inputNum);
		input.close();
		long endTime = System.currentTimeMillis();
		double time = endTime - startTime;
		System.out.println("用时: " + time);
	}
	
	
	
	
	
	//寻找并打印回文数字，如果输入的数字没有回文数，返回-1
	public static void PrintNum(int num) {
		int isPalin = 0;
		//五位数字
		int[] palinNum5 = {0, 0, 0, 0, 0};
		for (int n1 = 1; n1 <= 9; n1++) {
			for (int n2 = 0; n2 <= 9; n2++) {
				palinNum5[0] = n1;
				palinNum5[1] = n2;
				palinNum5[2] = num - 2 * (n1 + n2);
				palinNum5[3] = palinNum5[1];
				palinNum5[4] = palinNum5[0];
				if ((palinNum5[0] + palinNum5[1] + palinNum5[2] + palinNum5[3] + palinNum5[4]) == num) {
					if (palinNum5[2] < 10 && palinNum5[2] >= 0) {
						for (int i : palinNum5) {
							System.out.print(i);
						}
						System.out.println();
						isPalin++;
					}
				}
			}
		}
		
		//六位数字
		int[] palinNum6 = {0, 0, 0, 0, 0, 0};
		for (int n1 = 1; n1 <= 9; n1++) {
			for (int n2 = 0; n2 <= 9; n2++) {
				for (int n3 = 0; n3 <= 9; n3++) {
					palinNum6[0] = n1;
					palinNum6[1] = n2;
					palinNum6[2] = n3;
					palinNum6[3] = palinNum6[2];
					palinNum6[4] = palinNum6[1];
					palinNum6[5] = palinNum6[0];
					if ((palinNum6[0] + palinNum6[1] + palinNum6[2] + palinNum6[3] + palinNum6[4] + palinNum6[5]) == num) {
						for (int i : palinNum6) {
							System.out.print(i);
						}
						System.out.println();
						isPalin++;
					}
				}
			}
		}
		if (isPalin == 0) {
			System.out.println(-1);
		}
	}
}
