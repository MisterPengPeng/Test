package lanQiaoSixthB;

public class T2 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 1; i <= 50; i++) {
			int result = i * i * i;
			int sum = 0;
			while (result != 0) {
				sum += result % 10;
				result /= 10;
			}
			if (sum == i) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
