package test4;

public class T4 {
	static int length = 0;
	static int[] primeTable = new int[10000];
	static {
		for (int j = 2; j <= 10000; j++) {
			if (isPrime(j)) {
				primeTable[length] = j;
				length++;
			}
		}
	}
	public static void main(String[] args) {
		int min = 0;
		for (int i = 2; i < 10000; i += 2) {
			for (int j = 0; j < length; j++) {
				if (primeTable[j] > i) {
					break;
				}
				int temp = i - primeTable[j];
				if (isPrime(temp)) {
					min = Math.min(temp, primeTable[j]) > min ? Math.min(temp, primeTable[j]) : min;
					break;
				}
			}
		}
		System.out.println(min);
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
}
