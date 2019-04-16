package lanQiaoSixthC;

public class T1 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 21; i <= 50; i++) {
			if (i % 2 != 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
