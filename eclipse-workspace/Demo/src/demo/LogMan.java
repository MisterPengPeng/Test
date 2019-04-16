package demo;

import java.util.Scanner;

/*
** Log���� **
��Ŀ����
atm�μ�������ѵ���࣬�����̿�����������2Ϊ�׵Ķ�����÷ɿ죬�˳�Log������
һ�죬Log�����ĺ��� drd ��һЩ����������Ҫ�任��Log��������ʩչ����...
�任�Ĺ����ǣ� ����ĳ�������е�ÿ��������Ϊ: [log_2 (x) + 1]  ���� [] ��ʾ����ȡ�������Ƕ�ÿ����������2Ϊ�׵Ķ�����Ȼ��ȡ������
��������� 3 4 2 ����һ�κ�������л��� 2 3 2��

drd��Ҫ֪����ÿ���������������еĺ��Ƕ��١�

����
��һ������������ n m ��
�ڶ��� n ��������ʾ�������У�����������
������ m �У�ÿ�������� L R ��ʾ atm ��β����������� [L, R]��������Ŵ�1��ʼ��

���
��� m �У����α�ʾ atm ÿ����һ���������������еĺ͡�

��������
3 3
5 6 4
1 2
2 3
1 3

�������
10
8
6
*/
public class LogMan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();				//n����
		int m = scanner.nextInt();				//m��
		int[] array = new int[n];				//��������, ��������
		int[][]	interval = new int[m][2];		//��������
		
		//Ϊarray��ֵ
		for (int i = 0; i < array.length; i++) {		
			array[i] = scanner.nextInt();
		}
		
		//Ϊinterval��ֵ
		for (int i = 0; i < interval.length; i++) {		
			for (int j = 0; j < interval[i].length; j++) {
				interval[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		int sum = 0;
		for (int i = 0; i < m; i++) {		//ѭ��m��
			for (int j = interval[i][0]; j <= interval[i][interval[i].length - 1]; j++) {		//ѭ��interval[i]�������
				array[j - 1] = (int)(Math.floor(Math.log(array[j - 1]) / Math.log(2) + 1));		//array�ĵ�j������(log2 array[j - 1] + 1)������ȡ������
			}
			
			for (int j = 0; j < array.length; j++) {
				sum += array[j];
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
