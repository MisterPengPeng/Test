package recursion;

import java.util.Scanner;

/*
** �ݹ���ϰ5��������Ϣ **
��Ŀ����
Abhi��һλ�ع�����������Ҫ������Ϣ�������������¼��ܷ��������дһ������Э������ɼ��ܡ�
�÷����Ե���Ϊ��λ���м��ܡ���������һ�����ʣ������м����ĸ�������ʳ���Ϊż������ȡ�м����ֱߵ���ĸ����Ϊ���ĵ��ʵĵ�1����ĸ��
��ʱԭ���ʾͱ���Ϊ������2���֣�Ȼ�����ζ���2������ִ������Ĳ��裬�Դ�����ֱ��ԭ���ʵ�������ĸ���Ѿ����뵽���ĵ����������������������з��ֹ���

����
1�����ʣ�����[1, 10000]

���
���ܺ�ĵ���

��������1
abcd

�������1
bacd

��������2
abcdefghijklmn

�������2
gcabedfkihjmln
*/
public class TopSecretInformation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder word = new StringBuilder(scanner.next());
		
		scanner.close();
		
		StringBuilder result = new StringBuilder();
		
		Recursion(word, result);
		
		System.out.println(result);
	}
	
	public static void Recursion(StringBuilder word, StringBuilder result) {
		int middle = (word.length() - 1) / 2;
		if (word.toString().isEmpty()) {
			return;
		}
		StringBuilder left = new StringBuilder(word.substring(0, middle));
		StringBuilder right = new StringBuilder(word.substring(middle + 1));
		
		result.append(word.charAt(middle));
		Recursion(left, result);
		Recursion(right, result);
	}
}
