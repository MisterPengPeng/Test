package demo;

/*
	�ڼ���������
	
	��x�������е��οͶ�������һ����������Ϊ�οͱ�š�
	x�ǵĹ����и���񱣬��ֻϲ������3,5��7��
	�����涨���ο͵ı�����ֻ�������ӣ�3,5,7,�Ϳ��Ի��һ�ݽ�Ʒ��
	��������ǰ10�����������ǣ�
	3 5 7 9 15 21 25 27 35 45
	�����11�����������ǣ�49
	С���쵽��һ���������� 59084709587505����ȥ�콱��ʱ���˼�Ҫ����׼ȷ��˵�����ǵڼ����������֣������첻����Ʒ��
	�����С������һ�£�59084709587505�ǵڼ����������֡�
	
	����˼·: 
		��װ�������� 3 * 5 * 7
		���a��x�η�����N��a>0����a������1������ô��x������aΪ��N�Ķ�����logarithm��
		Math.pow(3, a) * Math.pow(5, b) * Math.pow(7, c);
*/
public class LuckyNum {
	public static void main(String[] args) { 
		int serialNum = 0;
		for (int a = 0; Math.pow(3, a) < 59084709587505l; a++) {
			for (int b = 0; Math.pow(5, b) < 59084709587505l; b++) {
				for (int c = 0; Math.pow(7, c) < 59084709587505l; c++) {
					double luckyNum = Math.pow(3, a) * Math.pow(5, b) * Math.pow(7, c);
					if (luckyNum < 59084709587505l) {
						serialNum++;
					}
				}
			}
		}
		System.out.println(serialNum);
	}
}
