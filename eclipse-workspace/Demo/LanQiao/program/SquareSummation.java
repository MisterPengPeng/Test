package program;

import java.util.Arrays;
import java.util.Scanner;

/*
��ƽ����
��ƽ���Ͷ����ֳ�Ϊ�������ն���
ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
�����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�
���磺
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
��^���ű�ʾ�˷�����˼��
����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
Ҫ�����4��������
0 <= a <= b <= c <= d
�������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��
��������Ϊһ��������N (N<5000000)
Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�
���磬���룺
5
�����Ӧ�������
0 0 1 2
�����磬���룺
12
�����Ӧ�������
0 2 2 2
�����磬���룺
773535
�����Ӧ�������
1 1 267 838
��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 3000ms
���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�
���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��*/
public class SquareSummation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		for (int i = 0; i < Math.sqrt(input); i++) {
			for (int j = 0; j < Math.sqrt(input); j++) {
				for (int k = 0; k < Math.sqrt(input); k++) {
					for (int l = 0; l < Math.sqrt(input); l++) {
						if ((i * i) + (j * j) + (k * k) + (l * l) == input) {
							print(i, j, k, l);
							return;
						}
					}
				}
			}
		}
	}
	
	public static void print(int i, int j, int k, int l) {
		int[] temp = {i, j, k, l};
		Arrays.sort(temp);
		for (int m : temp) {
			if (m != l) {
				System.out.print(m + " ");
			} else {
				System.out.println(m);
			}
		}
	}
}
