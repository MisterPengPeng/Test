package recursion;

import java.util.Scanner;

/*
** δ�����ߵķ��� **
��Ŀ����
ÿ�궬�죬����δ�����϶��ǻ����ĺõط�������������׼��������Ь��������̫���ˣ�ÿ�������չ��󣬳���һ˫��Ь����ʣ��
ÿ�����ϣ���Ь���ڶ����������������л�Ь��m��������Ҫ��Ь��n�������ڵ������ǣ���Щ���ж������ŷ������Ա������������û�б�Ь��������γ��档������ͬ��������ˣ����綼����Ь���ǻ�Ь������λ����ͬһ���ŷ���

����
������������ʾm��n

���
һ����������ʾ������ŷ��ķ�������

��������
3 2

�������
5

���ݹ�ģ��Լ��
����m, n �� [0,18]
*/
public class TroubleOnTheLakeside {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();		//��Ь
		int n = scanner.nextInt();		//��Ь
		
		scanner.close();
		
		System.out.println(Recursion(m, n));
	}
	
	public static int Recursion(int m, int n) {
		if (m < n) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		
		return Recursion(m - 1, n) + Recursion(m, n - 1);
	}
}
