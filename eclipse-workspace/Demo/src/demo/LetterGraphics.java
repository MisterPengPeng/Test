package demo;

//import java.util.ArrayList;
import java.util.Scanner;

/*
	��ĸͼ��
	
	��������
	������ĸ�������һЩ������ͼ�Σ����������һ������:
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	
	����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
	
	�����ʽ
	����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
	
	�����ʽ
	���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
	
	��������
	5 7
	
	�������
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	
	���ݹ�ģ��Լ��
	1 <= n, m <= 26��
*/
public class LetterGraphics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputLine = scanner.nextInt();
		int inputColumn = scanner.nextInt();
		scanner.close();
//		
//		ArrayList<Character> letter = new ArrayList<Character>();
//		for (int i = 65; i <= 90; i++) {
//			letter.add((char)i);
//		}
//		
//		for (int i = 0; i < inputLine; i++) {
//			for (int j = 1; j <= inputColumn; j++) {
//				System.out.print(letter.get(j - 1));
//			}
//			letter.set(i, (char)(letter.get(i) + i + 1));
//			for (int k = i + 1; k < letter.size(); k++) {
//				letter.set(k, (char)(letter.get(k) - 1));
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < inputLine; i++) {
			for (int j = 0; j < inputColumn; j++) {
//				char ch = (char)('A' + (i % 26));
				int abs = Math.abs(j - i);
				char ch = (char) ('A' + (abs % 26));
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}
