package test2;

public class T4 {
	
	static int[] answer = new int[7];
	static int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static boolean[] book = new boolean[10];
	
	public static void main(String[] args) {
		f(0);
	}
	
	public static void f(int n) {
		if (n == 7) {
			if (check()) {
				for (int i : answer) {
					System.out.print(i);
				}
			}
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (!book[i]) {
				book[i] = true;
				answer[n] = number[i];
				f(n + 1);
				book[i] = false;
			}
		}
	}
	
	public static boolean check() {
		int a = answer[6];
		int b = answer[5] * 10 + answer[6];
		int c = answer[4] * 100 + answer[5] * 10 + answer[6];
		int d = answer[3] * 1000 + answer[4] * 100 + answer[5] * 10 + answer[6];
		int e = answer[2] * 10000 + answer[3] * 1000 + answer[4] * 100 + answer[5] * 10 + answer[6];
		int f = answer[1] * 100000 + answer[2] * 10000 + answer[3] * 1000 + answer[4] * 100 + answer[5] * 10 + answer[6];
		int g = answer[0] * 1000000 + answer[1] * 100000 + answer[2] * 10000 + answer[3] * 1000 + answer[4] * 100 + answer[5] * 10 + answer[6];
		int result = answer[3] * 1000000 + answer[3] * 100000 + answer[3] * 10000 + answer[3] * 1000 + answer[3] * 100 + answer[3] * 10 + answer[3];
		if (a + b + c + d + e + f + g == result) {
			return true;
		}
		return false;
	}
}
