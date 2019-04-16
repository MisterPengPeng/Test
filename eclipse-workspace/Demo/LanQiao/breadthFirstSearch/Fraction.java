package breadthFirstSearch;

import java.util.Scanner;

/*
** ������ **

��������
100 ���Ա�ʾΪ����������ʽ��100 = 3 + 69258 / 714��
�����Ա�ʾΪ��100 = 82 + 3546 / 197��
ע���������������У�����1~9�ֱ������ֻ����һ�Σ�������0����
���������Ĵ�������100 �� 11 �ֱ�ʾ����

�����ʽ
�ӱ�׼�������һ��������N (N<1000*1000(1000000))

�����ʽ
�������������������1~9���ظ�����©����ɴ�������ʾ��ȫ��������

ע�⣺��Ҫ�����ÿ����ʾ��ֻͳ���ж��ٱ�ʾ����

��������1
100

�������1
11

��������2
105

�������2
6
*/
public class Fraction {
	//n = i + a / b				4 = 1 + 9 / 3
	//a = b * (n - i)			9 = 3 * (4 - 1)
	//���� = ��ĸ * (��� - ����)
	
	
	static int[] book = new int[10];		//������������Ƿ��ù�, �±�Ϊ����, Ԫ��Ϊ�жϱ�׼, 0��ʾû�ù�, 1��ʾ�ù�
	static int counter = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		for (int integer = 1; integer <= 987654; integer++) {
			one:
			for (int denominator = 1; denominator <= 12346; denominator++) {
				String temp = denominator + "";
				String temp1 = integer + "";
				for (int i = 0; i < temp1.length(); i++) {
					String temp2 = temp1.charAt(i) + "";
					if (temp.contains(temp2)) {
						continue one;
					}
				}
				int numerator = denominator * (input - integer);
				int result = integer + (numerator / denominator);
				if (result == input && check(result)) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
	
	public static boolean check(int result) {
		int length = new String(result + "").length();
		for (int i = 0; i < length; i++) {
			if (result % 10 == result % 100) {
				return false;
			}
			result /= 10;
		}
		return true;
	}
}
