package program;

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
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
*/
public class SquareSummationB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		for (int a = 0; a < Math.sqrt(input); a++) {
			for (int b = 0; b < Math.sqrt(input); b++) {
				for (int c = 0; c < Math.sqrt(input); c++) {
					for (int d = 0; d < Math.sqrt(input); d++) {
						if (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2) == input) {
							System.out.println(a + " " + b + " " + c + " " + d);
							return;
						}	
					}
				}
			}
		}
	}
}
