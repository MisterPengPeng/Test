package ahaAlgorithm;

import java.util.Scanner;

public class P32Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();					//获取用户输入
		
		scanner.close();
		
		char[] charInput = input.toCharArray();			//存放用户输入
		
		int length = input.length();					//用户输入字符串的长度
		int mid = length / 2 - 1;						//获取中点的前一个
		char[] checkChar = new char[mid + 2];			//存放要检查的回文部分
		
		int top = 0;									//栈顶
		for (int i = 0; i <= mid; i++) {				//入栈
			checkChar[++top] = charInput[i];
		}
		
		int next = 0;									//从next开始检查
		//定位next
		if (length % 2 == 0) {
			next = mid + 1;
		} else {
			next = mid + 2;
		}
		
		//出栈
		for (int i = next; i < length; i++) {
			if (checkChar[top--] != charInput[i]) {
				break;
			}
		}
		
		//最后检查是否是回文
		if (top == 0) {									//如果全部出栈
			System.out.println("Is palindrome");		//是回文
		} else {
			System.out.println("Isn't palindrome");		//不是回文
		}
	}
}
