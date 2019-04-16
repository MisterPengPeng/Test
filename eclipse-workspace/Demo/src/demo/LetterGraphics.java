package demo;

//import java.util.ArrayList;
import java.util.Scanner;

/*
	字母图形
	
	问题描述
	利用字母可以组成一些美丽的图形，下面给出了一个例子:
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	
	这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
	
	输入格式
	输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
	
	输出格式
	输出n行，每个m个字符，为你的图形。
	
	样例输入
	5 7
	
	样例输出
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	
	数据规模与约定
	1 <= n, m <= 26。
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
