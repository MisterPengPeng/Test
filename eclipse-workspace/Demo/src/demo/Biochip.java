package demo;

import java.util.Scanner;

/*
** ����оƬ **

��Ŀ����
X��ʿ�����о�һ������оƬ�����߼��ܼ��ȡ�������ԶԶ������ͨ�İ뵼��оƬ��
��ʿ��оƬ������� n ��΢�͹�Դ��ÿ����Դ����һ�ξͻ�ı���״̬����������תΪ�رգ���ر�תΪ������
��Щ��Դ�ı�Ŵ� 1 �� n����ʼ��ʱ�����й�Դ���ǹرյġ�
��ʿ�ƻ���оƬ��ִ�����¶�����
���б��Ϊ2�ı����Ĺ�Դ����һ�Σ�Ҳ���ǰ� 2 4 6 8 ... ����Ź�Դ��
���б��Ϊ3�ı����Ĺ�Դ����һ��, Ҳ���Ƕ� 3 6 9 ... ����Ź�Դ������ע���ʱ6�Ź�Դ�ֹر��ˡ�
���б��Ϊ4�ı����Ĺ�Դ����һ�Ρ�
.....
ֱ�����Ϊ n �ı����Ĺ�Դ����һ�Ρ�

X��ʿ��֪����������Щ������ĳ�������е���Щ��Դ�ǵ����ġ�

����
3���ÿո�ֿ���������N L R  (L<R<N<10^15)  N��ʾ��Դ����L��ʾ�������߽磬R��ʾ������ұ߽硣

���
���1����������ʾ�������в�����[L,R] �������ж��ٸ���Դ�ǵ����ġ�
p
��������
5 2 3

�������
2
*/

/*
 * ���������ε������������, ����ż���ε����ǲ�����
*/
public class Biochip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		long N = scanner.nextLong();
		long L = scanner.nextLong();
		long R = scanner.nextLong();
		
		scanner.close();
		
		long sqrtL = (long) Math.sqrt(L);
		long sqrtR = (long) Math.sqrt(R);  
		
		if (sqrtL * sqrtL != L) {
			sqrtL++;
		}
		
		long num = sqrtR - sqrtL + 1;
		long num2 = R - L + 1;
		
		System.out.println(num2 - num);
	}
}
