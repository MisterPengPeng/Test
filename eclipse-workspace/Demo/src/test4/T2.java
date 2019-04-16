package test4;

public class T2 {
	public static void main(String[] args) {
		for (int i = 100000; i <= 999999; i++) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int i) {
		int[] counter = new int[10];
		String input = i + "";
		for (int j = 0; j < input.length(); j++) {
			counter[input.charAt(j) - '0']++;
		}
		for (int j = 2; j <= 6; j++) {
			int[] book = new int[10];
			String temp = i * j + "";
			for (int k = 0; k < temp.length(); k++) {
				book[temp.charAt(k) - '0']++;
			}
			for (int a = 0; a < 10; a++) {
				if (counter[a] != book[a]) {
					return false;
				}
			}
		}
		return true;
	}
}
