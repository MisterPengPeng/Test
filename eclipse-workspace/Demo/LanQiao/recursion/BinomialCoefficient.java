package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ3�������ʽϵ��ֵ **
��Ŀ����
C(k n) = 1								k=0 | k=n
		 C(k n-1) + C(k-1 n-1)			0 < k < n
����
һ�У�k��n���Կո�ָ�

���
C(k n)��ֵ

��������
3 10

�������
120
*/
public class BinomialCoefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Function(k, n));
	}

	public static int Function(int k, int n) {
		if (k == 0 | k == n) {
			return 1;
		} else if (k < n && k > 0) {
			return Function(k, n - 1) + Function(k - 1, n - 1);
		} else {
			return 0;
		}
	}
}
