package lanQiaoSeventhC;

import java.util.Scanner;

public class T9 {

	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		in.close();

		for (int a = 0; a < Math.sqrt(n); a++) {
			for (int b = a; b < Math.sqrt(n); b++) {
				for (int c = b; c < Math.sqrt(n); c++) {
					int d = (int) Math.sqrt(n - a * a - b * b - c * c);
					if (n == a * a + b * b + c * c + d * d) {
						if (c > d) {
							int temp = d;
							d = c;
							c = temp;
						}
						System.out.printf("%d %d %d %d\n", a, b, c, d);
						return;
					}
				}
			}
		}
	}
}
