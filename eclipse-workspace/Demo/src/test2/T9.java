package test2;

public class T9 {
	public static void main(String[] args) {
		for (int i = 10000; i <= 99999; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (isPrime(i) && isFor(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int i) {
		for (int j = 3; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	//12345 51234 45123 34512 23451 12345
	public static boolean isFor(int i) {
		int a = i / 10000;
		int b = (i / 1000) % 10;
		int c = (i / 100) % 10;
		int d = (i / 10) % 10;
		int e = i % 10;
		if (isPrime(e * 10000 + a * 1000 + b * 100 + c * 10 + d)) {
			if (isPrime(d * 10000 + e * 1000 + a * 100 + b * 10 + c)) {
				if (isPrime(c * 10000 + d * 1000 + e * 100 + a * 10 + b)) {
					if (isPrime(b * 10000 + c * 1000 + d * 100 + e * 10 + a)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
