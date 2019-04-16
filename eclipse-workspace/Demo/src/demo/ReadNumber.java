package demo;

import java.util.Scanner;

/*
** ���Ķ��� **

��Ŀ����
Tom�������ڸ��о�������һ�Ź��ڻ���Ŀγ̣���һ������������Ϊͷ�ۣ�һ��Ⱦɫ�����г�ǧ���������ԣ����Ǵ�0��ʼ��ţ��������򣬼�ǧ���������ڡ� 
����˵���ڶ�ѧ�������1234567009��λ���ϵļ��ʱ���⿴�������Ǻ���׼ȷ��������ġ� 
���ԣ������е���Ҫһ��ϵͳ��Ȼ��������12  3456  7009ʱ���������Ӧ����� 
ʮ������ǧ�İ���ʮ������ǧ��� 
�ú���ƴ����ʾΪ 
shi  er  yi  san  qian  si  bai  wu  shi  liu  wan  qi  qian  ling  jiu 
������ֻ��Ҫ������Ϳ����ˡ� 
��������ǰ����������һ��ϵͳ������һ�����������ִ���������������Ķ�д�Ĺ淶תΪ����ƴ���ִ������ڵ�����������һ���ո���񿪡� 

ע������ϸ��չ淶������˵��10010��������yi  wan  ling  yi  shi�������ǡ�yi  wan  ling  shi������100000��������shi  wan�������ǡ�yi  shi  wan������2000��������er  qian�������ǡ�liang  qian���� 

����
��һ�����ִ�����ֵ��С������2,000,000,000��

���

��һ����СдӢ����ĸ�����źͿո���ɵ��ַ�������ʾ������Ӣ�Ķ����� 

��������
1234567009 

�������
shi er yi san qian si bai wu shi liu wan qi qian ling jiu
*/
public class ReadNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		scanner.close();
		
		int wan = input.length() - 5;
		int yi = wan - 4;
		
		if (yi >= 0) {
			duSiWeiShu(false, input.substring(0, yi + 1));
			print("yi");
		}
		
		boolean yaoDuLing = false;
		if (wan >= 0) {
			yaoDuLing = duSiWeiShu(false, input.substring(Math.max(0, yi + 1), wan + 1));
			if (!yaoDuLing) {
				print("wan");
			}
		}
		
		duSiWeiShu(yaoDuLing, input.substring(Math.max(0, wan + 1)));
	}
	
	public static boolean duSiWeiShu(boolean zero, String str) {
		if (str.equals("0000")) {
			return true;
		}
		
		int ge = str.length() - 1;
		int shi = ge - 1;
		int bai = shi - 1;
		int qian = bai - 1;
		
		boolean yaoDuLing = false;
		
		if (qian >= 0 && str.charAt(qian) == '0') {
			yaoDuLing = true;
		} else {
			duShu(zero, str.charAt(qian));
			print("qian");
			yaoDuLing = false;
		}
		
		if (bai >= 0 && str.charAt(bai) == '0') {
			yaoDuLing = true;
		} else {
			duShu(yaoDuLing, str.charAt(bai));
			print("bai");
			yaoDuLing = false;
		}
		
		if (shi >= 0 && str.charAt(shi) == '0') {
			yaoDuLing = true;
		} else {
			if (str.charAt(shi) == '1' && bai>= 0) {
				duShu(yaoDuLing, str.charAt(shi));
			} else {
				duShu(yaoDuLing, str.charAt(shi));
			}
			print("shi");
			yaoDuLing = false;
		}
		
		if (ge >= 0 && str.charAt(ge) != '0') {
			duShu(yaoDuLing, str.charAt(ge));
			yaoDuLing = false;
		}
		return false;
	}
	
	public static void duShu(boolean yaoDuLing, char c) {
		String[] pinYin = new String[] {
				"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"
		};
		if (yaoDuLing) {
			print(pinYin[0]);
		}
		int i = c - '0';
		print(pinYin[i]);
	}
	
	static boolean diYiCi = true;
	public static void print(String word) {
		if (diYiCi) {
			diYiCi = false;
			System.out.print(word);
		} else {
			System.out.print(' ');
			System.out.print(word);
		}
	}
}