package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ4���ݹ鵹���ַ����� **
��Ŀ����
���һ���ݹ���򣬵����ַ����顣����ӡʵ�ֹ��� 
�ݹ��߼�Ϊ�� 
���ַ����ȵ���1ʱ��ֱ�ӷ��� 
���򣬵�����β�����ַ����ڵݹ�ص����ַ������ʣ�²��� 

����
�ַ����鳤�ȼ������� 

���
���������У���ӡ�ַ�����ı仯����� 
����һ�У��ڳ����β����ӡ���ú������ĸ���Ԫ�ء� 

��������
5 abcde

�������
ebcda
edcba

edcba
*/
public class ReverseCharArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		StringBuilder array = new StringBuilder(scanner.next());
		
		scanner.close();
		
		System.out.println(Recursion(0, length - 1, array));
	}
	
	public static StringBuilder Reverse(int start, int end, StringBuilder array) {
		char temp = array.charAt(start);
		array.setCharAt(start, array.charAt(end));
		array.setCharAt(end, temp);
		System.out.println(array);
		
		return array;
	}
	
	public static StringBuilder Recursion(int start, int end, StringBuilder array) {
		if (end - start <= 0) {
			if (array.length() != 1) {
				System.out.println();
			}
			return array;
		} else {
			return Recursion(start + 1, end - 1, Reverse(start, end, array));
		}
		
//		return (end - start) <= 0 ? array : Recursion(start + 1, end - 1, Reverse(start, end, array));
	}
}
