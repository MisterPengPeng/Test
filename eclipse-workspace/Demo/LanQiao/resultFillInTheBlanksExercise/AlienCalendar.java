package resultFillInTheBlanksExercise;

import java.math.BigInteger;

/*
���⣺��������
ĳ��ϵ������������ż���
���ǵļ���Ҳ����ʮ���ơ�
���ǵ�����Ҳ������������ֻ��������û���ꡢ�µĸ��
��Ȥ���ǣ�����Ҳʹ�������ơ����ڡ��ĸ��
ֻ�������ǵ�һ�����ڰ�����9�죬
Ϊ�˷��㣬����ֱ��Ϊ: A,B,C....H,I
��һЩ�����Ͽ�����
���ǵ�23��������E
���ǵ�190��������A
���ǵ�343251��������I
�����˷ܵ��ǣ����Ǿ�ȻҲԤ���ˡ�����ĩ�ա������죬
��Ȼ��һ���ܴ�ܴ������
651764141421415346185
�������һ�£���ңԶ��һ���Ǹ����������ڼ���
����Ҫ�ύ����һ����д��ĸ����ʾ�����������ڼ���
��Ҫ��д�κζ�������ݡ�
*/
public class AlienCalendar {
	
	static char[] week = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	
	public static void main(String[] args) {
		String numberStr = "651764141421415346185";
		BigInteger number = new BigInteger(numberStr);
		System.out.println(week[number.mod(new BigInteger("9")).intValue() - 1]);
	}
}
