package ahaAlgorithm;

import java.util.Scanner;

public class P32Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();					//��ȡ�û�����
		
		scanner.close();
		
		char[] charInput = input.toCharArray();			//����û�����
		
		int length = input.length();					//�û������ַ����ĳ���
		int mid = length / 2 - 1;						//��ȡ�е��ǰһ��
		char[] checkChar = new char[mid + 2];			//���Ҫ���Ļ��Ĳ���
		
		int top = 0;									//ջ��
		for (int i = 0; i <= mid; i++) {				//��ջ
			checkChar[++top] = charInput[i];
		}
		
		int next = 0;									//��next��ʼ���
		//��λnext
		if (length % 2 == 0) {
			next = mid + 1;
		} else {
			next = mid + 2;
		}
		
		//��ջ
		for (int i = next; i < length; i++) {
			if (checkChar[top--] != charInput[i]) {
				break;
			}
		}
		
		//������Ƿ��ǻ���
		if (top == 0) {									//���ȫ����ջ
			System.out.println("Is palindrome");		//�ǻ���
		} else {
			System.out.println("Isn't palindrome");		//���ǻ���
		}
	}
}
