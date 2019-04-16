package lanQiaoSixthFinalsB;

public class T1 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean check(int i) {
		String temp = i + "";
		int first = temp.charAt(0) - '0';
		int second = temp.charAt(1) - '0';
		int third = temp.charAt(2) - '0';
		if (first > second && second > third) {
			return true;
		}
		
		return false;
	}
}
