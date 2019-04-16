package test2;

public class T2 {
	public static void main(String[] args) {
		double result = 0.0;
		for (double i = 1; i < Integer.MAX_VALUE; i++) {
			result += 1.0 / i;
			if (result >= 15.0) {
				System.out.println(i);
				return;
			}
		}
	}
}
