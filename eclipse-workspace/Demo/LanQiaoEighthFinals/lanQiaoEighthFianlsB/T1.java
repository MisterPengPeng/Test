package lanQiaoEighthFianlsB;

public class T1 {
	public static void main(String[] args) {
		long max = 0;
		
		for (long i = 32043; i <= 99999; i++) {
			long square = i * i;
			if (check(square) && square > max) {
				max = square;
			}
		}
		
		System.out.println(max);
	}

	private static boolean check(long square) {
		boolean[] book = new boolean[10];
		long temp = square;
		while (temp != 0) {
			int mod = (int)(temp % 10);
			if (book[mod]) {
				return false;
			}
			book[mod] = true;
			temp /= 10;
		}
		
		return true;
	}
}
