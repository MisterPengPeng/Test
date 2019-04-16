package test4;

public class T1 {
	public static void main(String[] args) {
		double fenMu = 4 * 5 * 6 * 7 * 8 * 9;
		double a = 1 * 5 * 6 * 7 * 8 * 9;
		double b = 1 * 4 * 6 * 7 * 8 * 9;
		double c = 1 * 4 * 5 * 7 * 8 * 9;
		double d = 1 * 4 * 5 * 6 * 8 * 9;
		double e = 1 * 4 * 5 * 6 * 7 * 9;
		double f = 1 * 4 * 5 * 6 * 7 * 8;
		
		double sum = a + b + c + d + e + f;
		double moo = sum / fenMu;
		for (double i = 11; i <= Integer.MAX_VALUE; i++) {
			double result = i - i * moo;
			if (result == 11) {
				System.out.println(i);
				return;
			}
		}
	}
}
