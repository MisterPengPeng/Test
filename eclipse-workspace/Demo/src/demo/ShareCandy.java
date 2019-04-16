package demo;

import java.util.Scanner;

/*
	���ǹ�
	
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
public class ShareCandy {
	static int addedCandy = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int children = scanner.nextInt();
		int[] candy = new int[children];
		for (int i = 0; i < children; i++) {
			candy[i] = scanner.nextInt();
		}
		scanner.close();
		Recursion(candy);
	}
	
	public static void Recursion(int[] arr) {
		int[] tempCandy = new int[arr.length];		//�ݴ�С�����ǹ���һ��
		for (int i = 0; i < arr.length; i++) {
			tempCandy[i] = arr[i] / 2;
			arr[i] = arr[i] / 2;
		}
		
		//����, һ�ֽ���
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] += tempCandy[tempCandy.length - 1];
			} else {
				arr[i] += tempCandy[i - 1];
			}
		}
		
		//����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i]++;
				addedCandy++;
			}
		}
		if (CheckAndPrint(arr)) {
			System.out.println(addedCandy);
		} else {
			Recursion(arr);
		}
	}
	
	//�������С���ѵ��ǹ��ǲ���һ����, ���һ����, ���������
	public static boolean CheckAndPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[0]) {
				return false;
			}
		}
		return true;
	}
}





















