package demo;

/*
	���췵��
	
	С�������������ٳ֡���Ī������ӵ�x��վ�����ʽ�С����֪ÿ�춼�зɴ��������򣬵���Ҫ108Ԫ�Ĵ�Ʊ������ȴ���޷��ġ�
	��������x��ս�򹤡����ĵ��ϰ��Ӧ��ʳ�ޣ���1�����1ԪǮ��
	���ң��Ժ��ÿһ�춼��ǰһ���2ԪǮ��ֱ�������㹻��Ǯ��Ʊ��
	
	�����һ�£�С���ڵڼ�����ܴչ�108Ԫ�����ص���
*/
public class ReturnToEarth {
	public static void main(String[] args) {
		int wages = 1;
		int money = 0;
		for (int day = 1; ; day++) {
			money += wages;
			wages += 2;
			if (money >= 108) {
				System.out.println(day);
				break;
			}
		}
	}
}
