package demo;


/*
1. ���ӷ��㽶
5ֻ�����Ǻ����ѣ��ں��ߵ�Ҭ������˯���ˡ����ڼ䣬���̴���һ����㽶������ɳ̲����ȥ��
��1ֻ�������������㽶���ֳ�5�ѣ���ʣ��1�����ͳԵ������Լ���һ�ݲ���������˯����
��2ֻ�������������°��㽶���ֳ�5�ѣ���ʣ��2�����ͳԵ������Լ���һ�ݲ���������˯����
��3ֻ�������������°��㽶���ֳ�5�ѣ���ʣ��3�����ͳԵ������Լ���һ�ݲ���������˯����
��4ֻ�������������°��㽶���ֳ�5�ѣ���ʣ��4�����ͳԵ������Լ���һ�ݲ���������˯����
��5ֻ�������������°��㽶���ֳ�5�ѣ����������ò�ʣ��
�����һ��ʼ�����ж��ٸ��㽶��
*/
public class MonkeyShareBanana {
	public static void main(String[] args) {
		int banana = 5;
		while (true) {
			if (banana % 5 == 1 && banana >= 5) {
				int first = banana - ((banana - 1) / 5) - 1;
				if (first % 5 == 2 && first >= 5) {
					int second = first - ((first - 2) / 5) - 2;
					if (second % 5 == 3 && second >= 5) {
						int third = second - ((second - 3) / 5) - 3;
						if (third % 5 == 4 && third >= 5) {
							int fourth = third - ((third - 4) / 5) - 4;
							if (fourth % 5 == 0 && fourth >= 5) {
								System.out.println(banana);
								break;
							}
						}
					}
				}
			}
			banana++;
		}
	}
}
