package demo;

import java.util.Scanner;

/*
���⣺ 
һ��������ˮ��һ��Ǯһƿ��ˮ������ƿ�ǿ��Ի�һƿ��ˮ��������ƿ���Ի�һƿ��ˮ 
��20��Ǯ�����������ˮ��
*/
public class BuySoda {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int money = in.nextInt();
		
		in.close();
		f(money, money, money);
	}
	
	public static void f(int bottle, int cap, int total) {
		if (bottle < 2 && cap < 3) {
			System.out.println(total);
			return;
		}
		
		//�»��˼�ƿ��ˮ
		int newSoda = 0;
		
		//����ƿ��һƿ, ���Զ�
		//����ƿ�ǻ�һƿ, ������
		newSoda += bottle / 2;
		newSoda += cap / 3;
		
		//����֮��ʣ���ٸ�ƿ�Ǻ�ƿ��
		bottle %= 2;
		cap %= 3;
		
		//�Ѿ���������ˮ�ټ����»�����ˮ
		total += newSoda;
		
		//�ֵõ����µ�ƿ���ƿ��
		bottle += newSoda;
		cap += newSoda;
		
		f(bottle, cap, total);	//������һ�ֻ���ˮ
	}
}
