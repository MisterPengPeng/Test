package resultFillInTheBlanksExercise;

import java.util.Scanner;

/*
ƽ����Ȧ

�����һ����������ÿһλ��ƽ��������ͣ��õ�һ���µ���������
���²���������������ͬ���Ĵ���

���һ������ᷢ�֣����ܿ�ʼȡ����ʲô���֣�
���������������1����������ͬһ��ѭ��Ȧ��

��д�����ѭ��Ȧ�������Ǹ����֡�

����д��������֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class SquareOddCircle {
	
	static int number;
	static int maxNumber = 0;
	static int times = 50;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		number = scanner.nextInt();
		
		scanner.close();
		number = function(number);
		dfs(number, times);
	}
	
	public static void dfs(int number, int times) {
		if (times == 0 || number == 1) {
			System.out.println(maxNumber);
			return;
		}
		number = function(number);
		if (number > maxNumber) {
			maxNumber = number;
		}
		dfs(number, times - 1);
	}
	
	public static int function(int number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10) * (number % 10);
			number /= 10;
		}
		return sum;
	}
}
