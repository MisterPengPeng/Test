package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ5.1������ˮ����Ϊ�����⣩ **
��Ŀ����
һ��������ˮ��һ��Ǯһƿ��ˮ������ƿ�ǿ��Ի�һƿ��ˮ��������ƿ���Ի�һƿ��ˮ 
��N��Ǯ�����������ˮ�� 

����
һ������N����ʾ��ʼ�ʽ�N����Χ[1, 30]

���
һ����������ʾ���˶�����ˮ

��������
20

�������
113
*/
public class BuyDrinks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		
		scanner.close();
		
		int result = Recursion(money, 0, 0);
		System.out.println(result);
	}
	
	public static int Recursion(int result, int bottle, int cap) {
		cap %= 3;
		bottle %= 2;
		cap += result;
		bottle += result;
		if (bottle < 2 && cap < 3) {
			return result;
		} else {
			return Recursion(bottle / 2 + cap / 3, bottle, cap) + result;
		}
	}
}
