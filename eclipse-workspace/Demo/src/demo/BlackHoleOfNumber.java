package demo;

import java.util.Arrays;
import java.util.Scanner;

/*
** ���ֺڶ� **

��Ŀ����
����һ����λ����ֻҪ���Ǹ���λ�ϵ������ǲ�ȫ��ͬ�ģ����������Ĺ��ɣ� 
1)����ɸ���λ�����ĸ������ɴ�С���У��γ������ĸ����ֹ��ɵ�������λ���� 
2)����ɸ���λ�����ĸ�������С�������У��γ������ĸ����ֹ��ɵ���С����λ��(����ĸ����к���0����õ�����������λ)�� 
3)���������Ĳ�õ�һ���µ���λ��(��λ�㱣��)�� 
�ظ����Ϲ��̣����һ����õ��Ľ����6174�� 
���磺4312  3087  8352  6174���������α任���õ�6174 

����
һ����λ���������뱣֤��λ���ֲ�ȫ��ͬ 

���
һ����������ʾ������־������ٴα任�ܵõ�6174 

��������
4312 

�������
3
*/
public class BlackHoleOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		scanner.close();
		
		char[] arr = input.toCharArray();
		int counter = 1;
		
		while (true) {
			char[] temp = Arrays.copyOf(arr, arr.length);
			Sort(temp);
			int sort = sum(temp);
			InversionSort(temp);
			int inversionSort = sum(temp);
			int difference = inversionSort - sort;
			if (difference == 6174) {
				break;
			} else {
				counter++;
				char ge = (char)(difference % 10 + 48);
				char shi = (char)((difference / 10) % 10 + 48);
				char bai = (char)((difference / 100) % 10 + 48);
				char qian = (char)(difference / 1000 + 48);
				arr[0] = qian;
				arr[1] = bai;
				arr[2] = shi;
				arr[3] = ge;
			}
		}
		
		System.out.println(counter);
	}

	public static int sum(char[] arr) {
		int sum = 0;
		sum += (arr[0] - 48) * 1000;
		sum += (arr[1] - 48) * 100;
		sum += (arr[2] - 48) * 10;
		sum += (arr[3] - 48);
		return sum;
	}
	
	//��С��������
	public static void Sort(char[] arr) {
		Arrays.sort(arr);
	}
	
	//�Ӵ�С����
	public static void InversionSort(char[] arr) {
		Sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
