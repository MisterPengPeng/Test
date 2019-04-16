package demo;

import java.util.Scanner;

/*
����ڣ�2018��У��Ԥѡ����

��������
�ڸոչ�ȥ�ĵ�����У�СHi�ܾ��˸����˺����������а��¾��ģ�һ�����ٹ�����ĵ���ڡ�Ϊ�����뵥��ڣ�СHi׼����дһ������������Ů����һ�ź��ġ�
һ��sizeΪ1�ĺ�������ͼ��ʾ
 _   _
/ \_/ \
|     |
\     /
 \   /
  \_/

������ź���̫С�ˣ�����СHi����ÿ���ߵĳ��ȶ�����N���Ӷ�ʹ��Ů���ܹ����������N=2ʱ���������
  __      __
 /  \    /  \
/    \__/    \
|            |
|            |
\            /
 \          /
  \        /
   \      /
	\    /
	 \__/

����
��һ�а���һ������N����ʾ���ĵĴ�С
����100%���ݣ�����N<=10
���
���һ��sizeΪN�ĺ���
��ĩ�Ŀո���Ҫ���
���������������ǰ�������
*/
public class SingleDay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		/**
		 * ���������кŴ��㿪ʼ
		 * ÿһ���ֵ��кŶ���һ��ʼ
		 * */
		
		//��ӡ������
		PrintSpace(input);				//�����еĹ���Ϊ
		PrintUnderLine(input);			//�ո� * input + �»��� * input + �ո� * (input * 3) + �»��� * input
		PrintSpace(input * 3);			//���ݹ��ɴ�ӡ������
		PrintUnderLine(input);
		System.out.println();
		
		//��ӡ�ӵ�һ�п�ʼ���ϰ벿��
		for (int i = 1; i <= input; i++) {
			PrintSpace(input - i);			//��ӡ���б��ǰ�Ŀո�			�ϲ���ÿһ�еĹ���Ϊ
			PrintSlash(1);					//��ӡ���б��					�ո� * (input - �к�) + б�� + �ո� * (input + �к� * 2 - 2) + ��б�� + �ո� * (input * 3 - �к� * 2) + б�� + �ո� * (input + i * 2 - 2) + ��б��
			PrintSpace(input + i * 2 - 2);	//��ӡ��߷�б��ǰ�Ŀո�																		   ���»��� * input
			PrintBackSlash(1);				//��ӡ��б��

			//�ж��Ƿ��ӡ�»���
			if (i == input) {					//������ϲ������һ��
				PrintUnderLine(input);			//��ӡ�»���
			} else {							//����
				PrintSpace(input * 3 - i * 2);	//������ӡ�ո�
			}
			PrintSlash(1);						//��ӡ�ұ�б��
			PrintSpace(input + i * 2 - 2);		//��ӡ�ұ߷�б��ǰ�Ŀո�
			PrintBackSlash(1);					//��ӡ�ұ߷�б��
			System.out.println();				//����
		}
		
		//��ӡ�м䲿��
		for (int i = 1; i <= input; i++) {
			PrintVerticalLine(1);				//��ӡ�������						�м䲿��ÿһ�й���Ϊ
			PrintSpace(input * 7 - 2);			//��ӡ������������֮��Ŀո�			���� + �ո� * input * 7 - 2 + ����
			PrintVerticalLine(1);				//��ӡ�ұ�����
			System.out.println();				//����
		}
		
		//��ӡ�ײ�
		for (int i = 1; i <= input * 3; i++) {
			PrintSpace(i - 1);					//��ӡ��߷�б��ǰ�Ŀո�				�ײ�ÿһ�й���Ϊ
			PrintBackSlash(1);					//��ӡ��߷�б��					�ո� * (�к� - 1) + ��б�� + �ո� * (input * 7 - i * 2) + б��
			if (i == input * 3) {				//��������һ��										     ���»��� * input
				PrintUnderLine(input);			//��ӡ�»���
			} else {							//����
				PrintSpace(input * 7 - i * 2);	//������ӡ�ո�
			}
			PrintSlash(1);						//��ӡ�ұ�б��
			System.out.println();				//����
		}
	}
	
	
	//��ӡ�ո�
	public static void PrintSpace(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
	}
	
	//��ӡ�»���
	public static void PrintUnderLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("_");
		}
	}
	
	//��ӡб��
	public static void PrintSlash(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("/");
		}
	}
	
	//��ӡ��б��
	public static void PrintBackSlash(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("\\");
		}
	}
	
	//��ӡ����
	public static void PrintVerticalLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("|");
		}
	}
}
