package test4;

public class Test {
	static int length = 0;
	static int[] primeTable = new int[999999];
	static {
		for (int j = 100000; j <= 999999; j++) {
			if (isPrime(j)) {
				primeTable[length] = j;
				length++;
			}
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < length; i++) {
			System.out.println(primeTable[i]);
		}
		
		System.out.println(isPalin(121));
		System.out.println(Long.MAX_VALUE);
	}
	
	public static boolean isPrime(int i) {
		if (i % 2 == 0) {
			return false;
		}
		for (int j = 3; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPalin(int temp) {
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
