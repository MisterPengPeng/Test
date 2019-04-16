package itemBank;

import java.util.Scanner;

public class PrefectPain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());	//获取字符串长度, nextline是因为输入后有一个回车,顺便带走.
		String str = scanner.nextLine();		//获取输入字符串
		char[] chs = str.toCharArray();			//字符串转为字符数组
		
		scanner.close();
		
		int[] count = new int[26];				//记录字母出现次数, 判断是否可以构成回文
		char ch = '0';							//当有两个及两个以上奇数次字母时
		int oddChar = 0;						//不可以构成回文
		
		for (int j = 0; j < chs.length; j++) {
			int index = chs[j] - 'a';			//将字母转换为index
			count[index]++;						//将第index个字母记录
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] % 2 != 0) {			//检查字母出现次数
				oddChar++;						//每有一个出现奇数次的字母, 记录一次
				ch = (char)(i + 'a');
			}
		}
		
		if (oddChar > 1) {						//如果出现奇数次的字母大于一个
			System.out.println("Impossible");	//不可能构成回文
		} else {
			int result = exchange(chs, n, ch);
			System.out.println(result);
		}
	}
	
	public static int exchange(char[] chs, int n, char ch) {
		int count = 0;		//记录步数
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
