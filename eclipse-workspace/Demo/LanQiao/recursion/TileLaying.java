package recursion;

import java.util.Scanner;

/*
** ��ש�̷� **
��Ŀ����
��һ����ΪN(1< =��< =10)�ĵذ壬�������ֲ�ͬ��ש��һ�ֳ���Ϊ1����һ�ֳ���Ϊ2����Ŀ���ޡ�Ҫ���������ΪN�ĵذ�������һ���ж����ֲ�ͬ���̷��� 
���磬����Ϊ4�ĵ���һ��������5���̷��� 
4=1+1+1+1 
4=2+1+1 
4=1+2+1 
4=1+1+2 
4=2+2 
����õݹ�ķ�������������⡣ 

����
ֻ��һ����N������ذ�ĳ��� 

���
���һ�������������в�ͬ�Ĵ�ש�̷ŷ��������� 

��������
4

�������
5
*/
public class TileLaying {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Recursion(n));
	}
	
	public static int Recursion(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		
		return  Recursion(n - 1) + Recursion(n - 2);
	}
}
