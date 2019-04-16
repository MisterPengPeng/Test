package lanQiaoSixthFinalsC;

import java.util.Scanner;

public class T5 {
	
	static String s;
	static int n;
	static String[] data;
	static int counter = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		s = in.next();
		n = in.nextInt();
		data = new String[n];
		for (int i = 0; i < n; i++) {
			data[i] = in.next();
		}
		
		in.close();
		
		for (int num = 0; num < n; num++) {
			for (int i = 0, j = 8; j <= s.length(); i++, j++) {
				String temp = s.substring(i, j);
				f(temp, data[num]);
			}
		}
		
		System.out.println(counter);
	}

	private static void f(String source, String crypto) {
		int[] sourceLetter = new int[26];
		int[] cryptoLetter = new int[26];
		
		for (int i = 0; i < 8; i++) {
			sourceLetter[source.charAt(i) - 'a']++;
			cryptoLetter[crypto.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (sourceLetter[i] != cryptoLetter[i]) {
				return;
			}
		}
		
		counter++;
		return;
	}
}
