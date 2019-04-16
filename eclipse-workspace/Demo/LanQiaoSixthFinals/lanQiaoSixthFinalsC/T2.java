package lanQiaoSixthFinalsC;

public class T2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			long temp = i;
			int step = 0;
			while (!isPalin(temp)) {
				if (step > 30) {
					System.out.println(i);
					return;
				}
				temp = f(temp);
				step++;
			}
		}
	}

	private static long f(long temp) {
		String number = temp + "";
		String reverse = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			reverse += number.charAt(i);
		}
		long reverseNum = Long.parseLong(reverse);
		return temp + reverseNum;
	}

	private static boolean isPalin(long temp) {
		String num = temp + "";
		int length = num.length();
		int mid = length / 2;
		String firstHalfPart = num.substring(0, mid);
		int next = length % 2 == 0 ? mid : mid + 1;
		String secondHalfPart = num.substring(next);
		for (int i = 0; i < firstHalfPart.length(); i++) {
			if (firstHalfPart.charAt(i) != secondHalfPart.charAt(secondHalfPart.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
