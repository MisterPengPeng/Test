package demo;

import java.util.Scanner;

/*
** ����ȡ�� **

��Ŀ����
����ȡ�������ؾ���ı�ȡ��������ǰ������������ȡ���Ѿ�ȡ��������ת90�ȡ�һ��ʼλ�ھ������Ͻǣ��������¡�

����
�����һ��������������200��������m,  n����ʾ������к��С�������m��ÿ��n����������ʾ�������

���
���ֻ��һ�У���mn������Ϊ����������ȡ���õ��Ľ������֮����һ���ո�ָ�����ĩ��Ҫ�ж���Ŀո�

��������
3 3 
1 2 3 
4 5 6 
7 8 9 

�������
1 4 7 8 9 6 3 2 5
*/
public class FetchNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();		//һ���м���
		int column = scanner.nextInt();		//һ���м���
		
		int[][] array = new int[line][column];		//��ž���
		
		//������ֵ
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int counter = 1;		//ͳ������˼�����, ���� line * column ������ѭ��
		int arrayLine = -1;		//��ǰ��
		int arrayColumn = 0;	//��ǰ��
		
		while (counter <= line * column) {
			while (arrayLine + 1 < line && array[arrayLine + 1][arrayColumn] != -1) {
				System.out.print(array[++arrayLine][arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayColumn + 1 < column && array[arrayLine][arrayColumn + 1] != -1) {
				System.out.print(array[arrayLine][++arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayLine - 1 >= 0 && array[arrayLine - 1][arrayColumn] != -1) {
				System.out.print(array[--arrayLine][arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
			
			while (arrayColumn - 1 >= 0 && array[arrayLine][arrayColumn - 1] != -1) {
				System.out.print(array[arrayLine][--arrayColumn] + " ");
				array[arrayLine][arrayColumn] = -1;
				counter++;
			}
		}
	}
}
