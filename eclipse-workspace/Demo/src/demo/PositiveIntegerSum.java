package demo;

import java.util.Scanner;

/*
** �����������ĺ� **

��Ŀ����
78��������Ա�ʾΪ�����������ĺͣ�1+2+3+��+12��18+19+20+21��25+26+27�� 

����
һ��������  n(< =10000) 

���
m��(n��m�ֱ�ʾ��)��ÿ��������������a��b����ʾa+(a+1)+...+b=n�� 
���ڶ��ֱ�ʾ����aС�ķ���������� 

��������
78 

�������
1 12
18 21
25 27
*/
public class PositiveIntegerSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 1; i < (n <= 7200 ? n : n / 3); i++) {
			int sum = 0;
			int j;
			for (j = i; j < n && sum < n; j++) {
				sum += j;
			}
			if (sum == n) {
				System.out.println(i + " " + (j - 1));
			}
		}
	}
}