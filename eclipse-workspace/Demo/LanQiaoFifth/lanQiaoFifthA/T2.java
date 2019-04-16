package lanQiaoFifthA;

public class T2 {
	public static void main(String[] args) {
		double sum = 0.0d;
		boolean change = true;
		for (double i = 1, counter = 1; counter <= 100; i += 2, counter++) {
			sum = change ? sum + 4.0 / i : sum - 4.0 / i;
			change = !change;
		}
		
		System.out.printf("%.2f\n", sum);
	}
}
