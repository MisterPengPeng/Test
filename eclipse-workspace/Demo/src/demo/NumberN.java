package demo;

import java.util.Scanner;

/*
12345678910111213��. ��N����λ�Ǽ�
���룺N
�������Nλ�ϵ���

����
�������룺1
���������1
�������룺11
���������0
*/
public class NumberN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String strCount = "";
		int count = 1;
		while(true) {
			strCount += count + "";
			if (strCount.length() > input) {
				System.out.println(strCount.charAt((input - 1)));
				break;
			}
			count++;
		}
		sc.close();
	}
}
