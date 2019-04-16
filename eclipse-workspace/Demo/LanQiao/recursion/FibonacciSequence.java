package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ2��Fibonacci���� **
��Ŀ����
Fibonacci����Ϊ��1, 1, 2, 3, 5, 8, 13, 21, ...
Fibonacci���еĵ��ƹ�ʽΪ��Fn = F(n-1) + F(n-2)������F1 = F2 = 1��
ʹ�õݹ飨��Ҫʹ��ѭ��������Fn��ֵ

����
����һ������n (n > 0)

���
���һ�У�����һ����������ʾFn��ֵ

��������
8

�������
21
*/
public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		if (n == 1 | n == 2) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
