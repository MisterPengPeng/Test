package demo;

import java.util.Scanner;


/*
	Excel��ַ��2018��У��Ԥѡ����
	
	��������
	Excel��Ԫ��ĵ�ַ��ʾ����Ȥ����ʹ����ĸ����ʾ�кš�
	���磬
	A��ʾ��1�У�
	B��ʾ��2�У�
	Z��ʾ��26�У�
	AA��ʾ��27�У�
	AB��ʾ��28�У�
	BA��ʾ��53�У�
	....
	��ȻExcel������к������޶ȵģ�����ת���������ѡ�
	�������������ֱ�ʾ��һ�㻯�����԰Ѻܴ������ת��Ϊ�ܳ�����ĸ�����أ�
	����Ŀ����Ҫ������������, ������Ӧ��Excel��ַ��ʾ��ʽ��
	
	��������
	26
	
	�������
	Z
	
	��������
	2054
	�������
	BZZ
	���ݹ�ģ��Լ��
	����Լ���������������Χ[1,2147483647]
	��ֵ�ڴ����ģ���������� < 256M
	CPU���� < 1000ms
*/
public class ExcelAddress {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			long[] letter = new long[10000];	//���������ĸ��ascii��
			long input = scanner.nextLong();	//����û������ֵ(Ҫת���ĵ�ַ)
			int i = 1;		//�����ĸ�������е�λ��
			while (input != 0) {
				//����û�����Ϊ26��
				if (input % 26 == 0) {
					letter[i] = 90;
					input -= 1;
				} else {
					letter[i] = input % 26 + 64;
				}
				input /= 26;
				i++;
			}
			for (int j = i - 1; j > 0; j--) {
				System.out.print((char)letter[j]);
			}
			System.out.println();
			scanner.close();
	}
}
