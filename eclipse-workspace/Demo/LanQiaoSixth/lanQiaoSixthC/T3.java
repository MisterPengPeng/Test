package lanQiaoSixthC;

public class T3 {
	public static void main(String[] args) {
		System.out.printf("%.5f\n", f(1));
	}
	
	public static double f(double num) {
		if (num == 100) {
			return 1;
		}
		return num / (num + f(num + 1));
	}
}
