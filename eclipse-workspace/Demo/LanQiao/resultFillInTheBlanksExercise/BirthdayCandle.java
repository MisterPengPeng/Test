package resultFillInTheBlanksExercise;



/*
��������
ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������
��������������һ����Ϩ��236������
���ʣ����Ӷ����꿪ʼ������party�ģ�
����д����ʼ������party����������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class BirthdayCandle {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			for (int j = i; j <= 100; j++) {
				sum += j;
				if (sum == 236) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
