package demo;

import java.util.Scanner;

/*
** FJ���ַ��� **

��Ŀ����
FJ��ɳ����д������һЩ�ַ����� 
A1  =  ��A�� 
A2  =  ��ABA�� 
A3  =  ��ABACABA�� 
A4  =  ��ABACABADABACABA�� 
��  �� 
�����ҳ����еĹ��ɲ�д���е�����AN��

����
����һ������N �� 26��

���
�������Ӧ���ַ���AN����һ�����з�����������в��ú��ж���Ŀո���С��س����� 

��������
3

�������
ABACABA
*/
public class FJString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		print(n);
		System.out.println();
	}
	
	static void print(int n) {
		if (n == 1)
			System.out.print('A');
		else {
			print(n - 1);// ǰ�벿��
			System.out.print((char) ('A' + n - 1));
			print(n - 1);// ��벿��
		}
	}
}
