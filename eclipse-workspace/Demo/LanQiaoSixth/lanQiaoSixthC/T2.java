package lanQiaoSixthC;

public class T2 {
	public static void main(String[] args) {
		int counter = 0;
		for (long i = 1l; i <= 10000; i++) {
			if (check(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	private static boolean check(long i) {
		long sum = (long)(i * i * i);
		String source = i + "";
		String destination = sum + "";
		String result = destination.substring(destination.length() - source.length());
		if (source.equals(result)) {
			return true;
		}
		return false;
	}
}
