package test3;

public class T1 {
	public static void main(String[] args) {
		for (int a = 1; a <= 100; a++) {
			for (int b = 1; b <= 100; b++) {
				for (int c = 1; c <= 100; c++) {
					if (a * 8 + b * 6 + c * 4 == 600
							&& a + b * 3 + c * 4 == 280
							&& a + b + c == 100) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
}
