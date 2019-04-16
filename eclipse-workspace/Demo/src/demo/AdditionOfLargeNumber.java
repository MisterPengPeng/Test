package demo;

import java.util.Scanner;


/*
** �����ӷ� ** ��Ҫʹ��BigInteger��
��Ŀ����
��������������a,b�����a+b��ֵ��

����
���У���һ��a���ڶ���b��a��b�ĳ��Ⱦ�С��1000λ��

���
һ�У�a+b��ֵ�� 

��������
4 
2 

�������
6
*/
public class AdditionOfLargeNumber {
	
	public static final int MAX = 1001;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputA = scanner.nextLine();
		String inputB = scanner.nextLine();
		
		scanner.close();
		
		byte[] a = new byte[MAX];
		byte[] b = new byte[MAX];
		byte[] sum = new byte[MAX];
		
		for (int i = inputA.length() - 1, j = 0; i >= 0; i--, j++) {
			a[j] = (byte)(inputA.charAt(i) - '0');
		}
		
		for (int i = inputB.length() - 1, j = 0; i >= 0; i--, j++) {
			b[j] = (byte)(inputB.charAt(i) - '0');
		}
		
		int length = Math.max(inputA.length(), inputB.length());
		for (int i = length; i >= 0; i--) {
			sum[i] = (byte)(a[i] + b[i] + sum[i]);
			if (sum[i] >= 10) {
				sum[i] %= 10;
				sum[i + 1] += 1;
			}
		}
		
		for (int i = length; i >= 0; i--) {
			if (sum[length] == 0) {
				sum[length]++;
			} else {
				System.out.print(sum[i]);
			}
		}
	}
}
