package demo;


/*
** ����⣺�������� **

С�����ٳֵ�X�ĳǣ�����������3�����ơ�
һ���˿��ƣ�ȥ����С���ƣ���52�ţ������ȷ���4���ˣ�ÿ����13�š�
��ʱ��С��������ͻȻð��һ�����⣺

��������ǻ�ɫ��ֻ���ǵ�����Ҳ�������Լ��õ����Ƶ��Ⱥ�˳���Լ��������õ��ĳ�ʼ�������һ���ж������أ�
*/
public class CardTypeNumber {
	static int counter = 0;
	
	public static void main(String[] args) {
		CatchingCard(1, 0);
		System.out.println(counter);
	}
	
	public static void CatchingCard(int cardNum, int total) {
		for (int i = 0; i <= 4; i++) {
			if (total + i == 13) {
				counter++;
				return;
			}
			
			if (cardNum < 13) {
				CatchingCard(cardNum + 1, total + i);
			}
		}
	}
}
