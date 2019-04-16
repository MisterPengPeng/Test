package lanQiaoFifthB;

public class T2 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; true; i++) {
			sum += 1.0 / i * 1.0;
			if (sum >= 15.0) {
				System.out.println(i);
				return;
			}
		}
	}
}
