package demo;

import java.util.Scanner;

/*
	��������
	��������
	�۲����֣�12321��123321 ����һ����ͬ�����������۴����Ҷ����Ǵ����������������ͬ�ġ����������ֽ������������֡�
	����Ҫ�����ҵ�һЩ5λ��6λ��ʮ�������֡���������Ҫ�󣺸����ֵĸ�����λ֮�͵��������������
	�����ʽ
	һ�������� n (10<n<100), ��ʾҪ���������λ�͡�
	�����ʽ
	�����У�ÿ�а���һ������Ҫ���5λ��6λ���������ְ���С�����˳�����С����û�����������ģ������-1
	��������
	44
	�������
	99899
	499994
	589985
	598895
	679976
	688886
	697796
	769967
	778877
	787787
	796697
	859958
	868868
	877778
	886688
	895598
	949949
	958859
	967769
	976679
	985589
	994499
	��������
	60
	�������
	-1
*/
public class PalindromeNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNum = input.nextInt();
		long startTime = System.currentTimeMillis();
		PrintNum(inputNum);
		input.close();
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("��ʱ: " + time);
	}
	
	public static void PrintNum(int num) {
		int havePalindrome = 0;
		for (int i = 10000; i <= 999999; i++) {
			int judgeNum = 0;
			String strI = i + "";
			for (int a = 0; a < strI.length(); a++) {
				judgeNum += strI.charAt(a) - 48;
			}
			int isPalindrome = 0;
			if (judgeNum == num) {
				for (int y = 0; y < strI.length() / 2; y++) {
					if (strI.charAt(y) != strI.charAt(strI.length() - y - 1)) {
						isPalindrome++;
						break;
					}
				}
				if (isPalindrome == 0) {
					System.out.println(i);
					havePalindrome++;
				}
			}
		}
		if (havePalindrome == 0) {
			System.out.println(-1);
		}
	}
}
