package lanQiaoEighthFianlsB;

import java.util.Scanner;

public class T5 {

	static char[] lol = { 'L', 'O' };
	static int[] result = new int[3];		//result[0]存放平局, [1]存放胜局, [2]存放败局

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String input = in.next();

			f(input, 0, true);

			System.out.println(result[1] == 0 ? result[0] == 0 ? -1 : 0 : 1);
		}

		in.close();
	}

	private static void f(String input, int index, boolean isXiaoMing) {
		if (check(input) && !isXiaoMing) {
			result[1]++;
			return;
		} else if (check(input) && isXiaoMing) {
			result[2]++;
			return;
		} else if (index == input.length()) {
			result[0]++;
			return;
		}

		for (int i = 0; i < 2; i++) {
			if (input.charAt(index) == '*') {
				f(input.substring(0, index) + lol[i] + input.substring(index + 1), index + 1, !isXiaoMing);
			} else {
				f(input, index + 1, isXiaoMing);
			}
		}

		return;
	}

	private static boolean check(String input) {
		for (int i = 0; i + 2 < input.length(); i++) {
			String temp = input.substring(i, i + 3);
			if (temp.equals("LOL")) {
				return true;
			}
		}
		return false;
	}
}
