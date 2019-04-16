package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ6����ŵ�� **
��Ŀ����
��ŵ�����ֳƺ�������������Դ��ӡ��һ�����ϴ�˵��������ߡ������촴�������ʱ�������������ʯ���ӣ���һ�������ϴ������ϰ��մ�С˳������64Ƭ�ƽ�Բ�̡�
���������������Ű�Բ�̴����濪ʼ����С˳�����°ڷ�����һ�������ϡ����ҹ涨����СԲ���ϲ��ܷŴ�Բ�̣�����������֮��һ��ֻ���ƶ�һ��Բ�̡�
�������Ǹ�3��ʯ�����Ϊ1��2��3������1��ʯ���������ϴӴ���С�ں�n��Բ�̣������������Բ�̴�1��ʯ��Ų��3��ʯ������ϸ����˳��

����
1������n

���
�����У�ÿһ������ɿո�ֿ���2������x��y��1 <= x,y <= 3������ʾ��xʯ�����Ϸ���Բ��Ų��yʯ���ϡ�
�����������в���������Բ��Ӧ�ð�˳��ڷŵ�3��ʯ����

��������
3

�������
1 3
1 2
3 2
1 3
2 1
2 3
1 3
*/
public class HanoiTower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		Recursion(n, 1, 2, 3);
	}
	
	public static void Recursion(int n, int one, int two, int three) {
		if (n == 1) {
			System.out.println(one + " " + three);
			return;
		}
		Recursion(n - 1, one, three, two);
		System.out.println(one + " " + three);
		Recursion(n - 1, two, one, three);
	}
}
