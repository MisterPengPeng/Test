package recursion;

import java.util.Scanner;

/*
** 递归练习5：绝密信息 **
题目描述
Abhi是一位特工，他经常需要加密信息。他发明了如下加密方法，请编写一个程序协助他完成加密。
该方法以单词为单位进行加密。对于任意一个单词，将它中间的字母（若单词长度为偶数，则取中间左手边的字母）作为密文单词的第1个字母。
此时原单词就被分为了左右2部分，然后依次对这2个部分执行上面的步骤，以此类推直到原单词的所有字母都已经加入到密文单词里。可以在样例输入输出中发现规律

输入
1个单词，长度[1, 10000]

输出
加密后的单词

样例输入1
abcd

样例输出1
bacd

样例输入2
abcdefghijklmn

样例输出2
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
