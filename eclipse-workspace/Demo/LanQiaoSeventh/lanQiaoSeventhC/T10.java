package lanQiaoSeventhC;

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.next();
		
		in.close();
		
		String reverse = reverse(input);
		System.out.println(input.length() - findMaxSubSequence(input, reverse));
	}
	
	public static String reverse(String parameter) {
		String temp = "";
		for (int i = parameter.length() - 1; i >= 0; i--) {
			temp += parameter.charAt(i);
		}
		return temp;
	}
	
	public static int findMaxSubSequence(String a, String b) {
		if (a.length() == 0 || b.length() == 0) {
			return 0;
		}
		
		String newA = a.substring(1);
		String newB = b.substring(1);
		
		if (a.charAt(0) == b.charAt(0)) {
			return findMaxSubSequence(newA, newB) + 1;
		}
		
		return Math.max(findMaxSubSequence(newA, b), findMaxSubSequence(a, newB));
	}
}
