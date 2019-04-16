package demo;

import java.util.Scanner;

/*
2. ���ǹ�
��������
��n��С����Χ����һȦ����ʦ��ÿ��С���������ż�����ǹ���Ȼ������������Ϸ��
ÿ��С���Ѷ����Լ����ǹ���һ������ֱߵĺ��ӡ�
һ�ַ��Ǻ�ӵ���������ǵĺ�������ʦ����1���ǹ����Ӷ����ż����
�������������Ϸ��ֱ������С���ѵ��ǹ�������ͬΪֹ
���������Ԥ������֪�ĳ�ʼ�ǹ������£���ʦһ����Ҫ�������ٸ��ǹ���

�����ʽ
�������ȶ���һ������N(2<N<100)����ʾС���ѵ�������
������һ���ÿո�ֿ���N��ż����ÿ��ż��������1000����С��2��

�����ʽ
Ҫ��������һ����������ʾ��ʦ��Ҫ�������ǹ�����

��������
3
2 2 4

�������
4
*/
public class ShareCandyPractice {
	
	static int[] candy;
	static int counter;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		candy = new int[N];
		for (int i = 0; i < N; i++) {
			candy[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Recursion(candy);
	}
	
	public static void Recursion(int[] candy) {
		
		int book = 0;
		for (int i = 1; i < candy.length; i++) {
			if (candy[i - 1] == candy[i]) {
				book++;
			}
		}
		if (book == candy.length - 1) {
			System.out.println(counter);
			return;
		}
		
		for (int i = 0; i < candy.length; i++) {
			candy[i] /= 2;
		}
		
		int[] temp = new int[candy.length];
		for (int i = 0; i < candy.length; i++) {
			temp[i] = candy[i]; 
		}
		for (int i = 0; i < candy.length; i++) {
			if (i == candy.length - 1) {
				candy[0] += temp[candy.length - 1];
			} else {
				candy[i + 1] += temp[i];
			}
		}
		
		for (int i = 0; i < candy.length; i++) {
			if (candy[i] % 2 != 0) {
				candy[i]++;
				counter++;
			}
		}
		
		Recursion(candy);
	}
}
