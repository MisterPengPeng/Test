package demo;

import java.util.Scanner;

/*
** դ���ӡ���� **

��Ŀ����
��дһ����������������������Ϊդ��ĸ߶ȺͿ�ȣ�Ȼ���á�+������-���͡�|���������ַ�����ӡһ��դ��

����
����ֻ��һ�У����������������ֱ�Ϊդ��ĸ߶ȺͿ�ȡ�
�߶ȺͿ�ȵķ�Χ[-20, 20]

���
�����Ӧ��դ��
��Ȼ�߶�<=0ʱ�������դ��ֻ���һ������


��������
3  2 				4  3

�������
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
| | |				| | | |
+-+-+				+-+-+-+
					| | | |
					+-+-+-+
*/
public class PrintGrid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		
		scanner.close();
		
		//����߶Ȼ��߿��С�ڵ�����, ���һ������
		if (height <= 0 || width <= 0) {
			System.out.println();
			return;
		}
		
		//��ӡդ��
		for (int j = 0; j < height; j++) {
			//��ӡ�ڵ�
			for (int i = 0; i <= width; i++) {
				if (i == width) {
					System.out.println('+');
				} else {
					System.out.print("+-");
				}
			}
			
			//��ӡ������
			for (int k = 0; k <= width; k++) {
				if (k == width) {
					System.out.println('|');
				} else {
					System.out.print("| ");
				}
			}
		}
		
		//��ӡ���ױ�
		for (int i = 0; i <= width; i++) {
			if (i == width) {
				System.out.println('+');
			} else {
				System.out.print("+-");
			}
		}
	}
}
