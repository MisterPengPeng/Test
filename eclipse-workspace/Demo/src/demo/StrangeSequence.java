package demo;

import java.util.Scanner;

/*
** ��ֵ����� **
��Ŀ����
��X�ǽػ�һ�ݵ��룬��һЩ���֣����£�
13
1113
3113
132113
1113122113
....
YY��ʿ����ҹ�о��������˹��ɣ�
��һ�е����������ʲô���Ժ�ÿһ�ж��Ƕ���һ�С���������
�����2�У��ǶԵ�1�е���������˼�ǣ�1��1��1��3�������ǣ�1113
��3�У���˼�ǣ�3��1,1��3�������ǣ�3113

�����дһ�����򣬿��Դӳ�ʼ���ֿ�ʼ���������������ı任��

����
��һ������һ��������ɵĴ���������100λ
�ڶ��У�һ������n����ʾ��Ҫ�������任���ٴΣ�n������20
���һ��������ʾ���һ�α任��Ľ����

���
���һ��������ʾ���һ�α任��Ľ����

��������
5
7

�������
13211321322115
*/
public class StrangeSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.next();		//��ű任�����ִ�
		int times = scanner.nextInt();		//���Ҫ�任�Ĵ���
		
		scanner.close();
		
		int counter = 1;		//��¼�����������ֵĴ���
		
		//���岿��
		for (int t = 0; t < times; t++) {		//ѭ��times��
			
			String temp = "";		//�½�һ����ʱ�ַ���ִ�в���
			
			for (int i = 0; i < num.length(); i++) {
				
				//������������������������֮��Ĳ���
				if (i + 1 < num.length() && num.charAt(i) == num.charAt(i + 1)) {
					counter++;
					continue;
				}
				
				temp += counter + "" + num.charAt(i);		//temp������� ���ֳ��ֵĴ��� + ����		˫������Ϊ�˰�����תΪ�ַ���
				counter = 1;		//������������
			}
			num = temp;		//��temp����num
		}
		
		System.out.println(num);		//���num
	}
}
