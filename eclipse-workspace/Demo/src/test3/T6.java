package test3;

public class T6 {
	static String pr(int m, int n) {
		String s = "";
		for (int i = 0; i < n; i++)
			s += " ";
		for (int i = 0; i < m; i++)
			s = "*" + s + "*";
		return s;
	}

	static void f(int n) {
		String s = pr(1, n * 2 - 1) + "\n";
		String s2 = s;

		for (int i = 1; i < n; i++) {
			s = "*" + s.substring(0, i) + s.substring(i + 1, s.length() - i - 2) + "*" + s.substring(s.length() - i - 1); // Ìî¿ÕÎ»ÖÃ
			s2 = s + s2 + s;
		}

		System.out.print(s2);
	}

	public static void main(String[] args) {
		f(6);
	}
}
