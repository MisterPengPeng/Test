package lanQiaoFifthC;

public class T2 {
	public static void main(String[] args) {
		double result = 0d;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			result += (double)(1.0 / i);
			if (result >= 15d) {
				System.out.println(i);
				return;
			}
		}
	}
}
