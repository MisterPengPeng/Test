package demo;

import java.util.Scanner;

/*
С������

ģ������ͼ���������������ָ����ܰ�����ָ����
1. ���֣�'NUM X'��XΪһ��ֻ������д��ĸ�����ֵ��ַ�������ʾһ����ǰ���Ƶ���
2. ����ָ�'ADD','SUB','MUL','DIV','MOD'���ֱ��ʾ�Ӽ��ˣ�����ȡ�̣�����ȡ��
3. ����ת��ָ�'CHANGE K'������ǰ����ת��ΪK����(2��K��36)
4. ���ָ�'EQUAL'���Ե�ǰ����������
5. ����ָ�'CLEAR'�������ǰ����

ָ������¹��������
���֣�����ָ�����������������ת��ָ����ָ�����ָ���п�����������
����ָ�����ֵĵ�һ�����֣���ʾ������������֡����ڸ�����ָ��͸������м䲻���������ָ������ָ��
����ָ�����ֵĵ�һ�����֣���ʾ����ֵ����������ָ��͵�һ�������м䲻���������ָ������ָ��
����ת��ָ����ܳ������κεط�

����������м������Ϊ�Ǹ���������С��2^63��
�Դ�д��'A'~'Z'��ʾ10~35

�����ʽ
��1�У�1��n����ʾָ������
��2..n+1�У�ÿ�и���һ��ָ�ָ������һ����'CLEAR'��Ϊ��ʼ����������ָ�����

�����ʽ
���θ���ÿһ��'EQUAL'�õ��Ľ��

��������
7
CLEAR
NUM 1024
CHANGE 2
ADD
NUM 100000
CHANGE 8
EQUAL

�������
2040
*/
public class Counter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputnum = scanner.nextInt();
		for (int i = 0; i < inputnum; i++) {
			String input = scanner.next();
			if (!input.equals("CLEAR") && i == 0) {
				System.out.println("��һ�������\"CLEAR\"��ʼ");
			}
			switch (input) {
			case "NUM":
				Num();
				break;
				
			case "ADD":
				Add();
				break;
				
			case "SUB":
				Sub();
				break;
				
			case "MUL":
				Mul();
				break;
				
			case "DIV":
				Div();
				break;
				
			case "MOD":
				Mod();
				break;
				
			case "CHANGE":
				Change();
				break;
	
			case "EQUAL":
				Equal();
				break;
				
			case "CLEAR":
				Clear();
				break;
			}
		}
		scanner.close();
	}

	private static void Clear() {
		//�����ǰ����
		
	}

	private static void Equal() {
		//������
		
	}

	private static void Change() {
		//�ı����
		
	}

	private static void Mod() {
		//ȡ��
		
	}

	private static void Div() {
		//ȡ��
		
	}

	private static void Mul() {
		//���
		
	}

	private static void Sub() {
		//���
		
	}

	private static void Add() {
		//���
		
	}

	private static void Num() {
		//��ʾһ����ǰ��������
		
	}
}
