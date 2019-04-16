package demo;

import java.util.Scanner;

/*
	����������
	
	����ĿҪ�����ڿ���̨���һ����������ɵĵ��������Ρ�
	����Ĳ����ǣ�
	1. ����1,2,3��...����Ȼ��ƴһ���㹻���Ĵ�
	2. ���������������ε������ߡ����Ϸ����㿪ʼ����ʱ����䡣
	���磬�������θ߶���8ʱ��
	����
	һ��������n(3<n<300),��ʾ�����εĸ߶�
	���
	���������ĵ��������Ρ�
	Ϊ�˱��ڲ���������Ҫ��ո�һ����"."���档
	���磬���룺5
	����Ӧ�������
	....1
	...2.1
	..3...2
	.4.....1
	567891011

	10
	����Ӧ�������
	.........1
	........2.2
	.......3...2
	......4.....2
	.....5.......1
	....6.........2
	...7...........0
	..8.............2
	.9...............9
	1011121314151617181

	15
	����Ӧ�������
	..............1
	.............2.3
	............3...2
	...........4.....3
	..........5.......1
	.........6.........3
	........7...........0
	.......8.............3
	......9...............9
	.....1.................2
	....0...................8
	...1.....................2
	..1.......................7
	.1.........................2
	21314151617181920212223242526
*/
public class IsosceliesTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		StringBuilder stringBuilder = new StringBuilder();		//��StringBuilder�����һЩString������������
		for (int i = 1; ; i++) {								//���Ҫ�õ�������,һ���õ������ֳ���Ϊ4 * input - 4
			stringBuilder.append(i);
			if (stringBuilder.length() >= 4 * input - 4) {
				break;
			}
		}
		
		String left = stringBuilder.substring(1, input - 1);	//����������
		String bottom = stringBuilder.substring(input - 1, 3 * input - 2);	//��ŵײ�����
		String right = stringBuilder.substring(3 * input - 2, 4 * input - 4);	//����ұ�����
		right = new StringBuilder(right).reverse().toString();	//��Ϊ����ʱ���ӡ��Ϊ�˷������԰��ұ����ַ�ת
		
		PrintDots(input - 1);									//��ӡ������Բ��, input - 1��
		System.out.println(1);									//�����е�����һ��Ϊ1, ֱ�Ӵ�ӡ
		
		//ѭ������ڶ��е������ڶ���
		for (int i = 1; i < input - 1; i++) {
			PrintDots(input - 1 - i);							//�ӵڶ��п�ʼ��ӡ,��ӡ���Բ��,Բ������Ϊinput - 1 - line number
			System.out.print(left.charAt(i - 1));				//
			PrintDots(2 * i - 1);
			System.out.print(right.charAt(i - 1));
			System.out.println();
		}
		System.out.print(bottom);
	}
	
	//���Բ��
	public static void PrintDots(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(".");
		}
	}
}
