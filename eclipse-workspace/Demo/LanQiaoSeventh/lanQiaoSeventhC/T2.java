package lanQiaoSeventhC;

public class T2 {
	public static void main(String[] args) {
		int counter = 0;
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			counter += i;
			result += counter;
		}
		System.out.println(result);
	}
}
