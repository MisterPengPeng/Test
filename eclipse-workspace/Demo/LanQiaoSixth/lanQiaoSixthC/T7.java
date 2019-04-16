package lanQiaoSixthC;

public class T7 {
	public static void main(String[] args) {
		for (int i = 2; i <= 49; i++) {
			for (int j = 4; j <= 49 && Math.abs(i - j) != 1; j++) {
				int sum = 0;
				for (int k = 1; k <= 49; k++) {
					if (k + 1 == i || k + 1 == j) {
						sum += k * (k + 1);
						k++;
					} else {
						sum += k;
					}
				}
				if (sum == 2015) {
					System.out.println(Math.min(i, j) - 1);
				}
			}
		}
	}
}
