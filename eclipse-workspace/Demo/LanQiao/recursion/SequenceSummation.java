package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ1��������� **
��Ŀ����
ʹ�õݹ飨��Ҫʹ��ѭ��������1+2+3+...+n��ֵ

����
����һ������n

���
���һ�У�����һ����������ʾ1+2+3+...+n��ֵ

��������
100

�������
5050
*/
public class SequenceSummation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(recursion(n));
	}
	
	public static int recursion(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 0) {
			return 0;
		} else if (num < 0) {
			return recursion(num + 1) + num;
		} else {
			return recursion(num - 1) + num;
		}
	}
}
