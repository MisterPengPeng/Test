package test3;

public class T4 {
	
	static int[] star = new int[10];
	static boolean[] book = new boolean[13];
	static int counter = 0;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(counter / 2 / 5);
	}
	
	public static void f(int n) {
		if (n == 10) {
			int a = star[1] + star[2] + star[3] + star[4];
			int b = star[4] + star[6] + star[7] + star[8];
			int c = star[8] + star[5] + star[2] + star[0];
			int d = star[0] + star[3] + star[6] + star[9];
			int e = star[9] + star[7] + star[5] + star[1];
			if (a == b && a == c & a == d & a == e
					&& b == c && b == d && b == e
					&& c == d && c == e
					&& d == e) {
				counter++;
			}
			return;
		}
		
		for (int i = 1; i <= 12; i++) {
			if (i == 7 || i == 11) {
				continue;
			}
			if (!book[i]) {
				book[i] = true;
				star[n] = i;
				f(n + 1);
				star[n] = 0;
				book[i] = false;
			}
		}
	}
}
