package lanQiaoSixthC;

public class T6 {
	public static void main(String[] args) {
		for (long i = 11l; i <= 100000; i++) {
			if (check(i)) {
				System.out.println(i);
				return;
			}
		}
	}
	
	public static boolean check(long i) {
		int[] book = new int[10];
		String square = i * i + "";
		String cube = i * i * i + "";
		String total = square + cube;
		for (int j = 0; j < total.length(); j++) {
			book[total.charAt(j) - '0']++;
		}
		for (int j = 0; j < total.length(); j++) {
			if (book[j] != 1) {
				return false;
			}
		}
		return true;
	}
}