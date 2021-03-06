package lanQiaoFifthA;

public class T3 {
	public static void main(String[] args) {
		double temp = 1e-7;
		double l = 2;
		double r = 3;
		double mid;
		while (l + temp < r) {
			mid = (l + r) / 2;
			if (Math.pow(mid, mid) < 10) {
				l = mid;
			} else {
				r = mid;
			}
		}
		System.out.printf("%.6f\n", l);
	}
}
