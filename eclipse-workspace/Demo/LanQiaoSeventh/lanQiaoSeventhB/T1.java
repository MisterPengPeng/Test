package lanQiaoSeventhB;

public class T1 {
	public static void main(String[] args) {
		int result = 0;
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			counter += i;
			result += counter;
		}
		
		System.out.println(result);
	}
}
