package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ5.2����¥�� **
��Ŀ����
¥��һ����N�ף���¥����һ����1�ף�Ҳ����һ����2�ס�
��дһ�����򣬼������ж����ֲ�ͬ���߷���

����
һ������N����ʾ¥��һ����N��

���
һ����������ʾ�ܹ�����¥�߷�

��������
4

�������
5
*/
public class ClimbStairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int stairs = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Recursion(stairs));
	}
	
	public static int Recursion(int stairs) {
		if (stairs <= 0) {
			return 0;
		}
		
		if (stairs == 1) {
			return 1;
		}
		
		if (stairs == 2) {
			return 2;
		}
		
		return Recursion(stairs - 1) + Recursion(stairs - 2);
	}
}
