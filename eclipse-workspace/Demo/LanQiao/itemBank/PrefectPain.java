package itemBank;

import java.util.Scanner;

public class PrefectPain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());	//��ȡ�ַ�������, nextline����Ϊ�������һ���س�,˳�����.
		String str = scanner.nextLine();		//��ȡ�����ַ���
		char[] chs = str.toCharArray();			//�ַ���תΪ�ַ�����
		
		scanner.close();
		
		int[] count = new int[26];				//��¼��ĸ���ִ���, �ж��Ƿ���Թ��ɻ���
		char ch = '0';							//��������������������������ĸʱ
		int oddChar = 0;						//�����Թ��ɻ���
		
		for (int j = 0; j < chs.length; j++) {
			int index = chs[j] - 'a';			//����ĸת��Ϊindex
			count[index]++;						//����index����ĸ��¼
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] % 2 != 0) {			//�����ĸ���ִ���
				oddChar++;						//ÿ��һ�����������ε���ĸ, ��¼һ��
				ch = (char)(i + 'a');
			}
		}
		
		if (oddChar > 1) {						//������������ε���ĸ����һ��
			System.out.println("Impossible");	//�����ܹ��ɻ���
		} else {
			int result = exchange(chs, n, ch);
			System.out.println(result);
		}
	}
	
	public static int exchange(char[] chs, int n, char ch) {
		int count = 0;		//��¼����
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0; i < n / 2; i++) {
			if (chs[i] == ch) {
				for (j = i; j < n - i - 1; j++) {
					if (chs[j] == chs[n - i - 1]) {
						break;
					}
				}
				
				count += j - i;
				
				for (k = j; k > i; k--) {
					chs[k] = chs[k - 1];
				}
				chs[i] = chs[n - i - 1];
			} else {
				for (j = n - i - 1; j >= i; j--) {
					if (chs[j] == chs[i]) {
						break;
					}
				}
				
				count += n - i - 1 - j;
				
				for (k = j; k < n - i - 1; k++) {
					chs[k] = chs[k + 1];
				}
				chs[n - i - 1] = chs[i];
			}
		}
		return count;
	}
}
