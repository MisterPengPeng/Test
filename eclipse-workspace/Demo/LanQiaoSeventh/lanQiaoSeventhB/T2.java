package lanQiaoSeventhB;

public class T2 {
	public static void main(String[] args) {
		int blowed = 236;
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j <= 100; j++) {
				counter += j;
				if (counter == blowed) {
					System.out.println(i);
					return;
				}
			}
			counter = 0;
		}
	}
}
