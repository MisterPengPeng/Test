package itemBank;

public class PrimeSequence {
	public static void main(String[] args) {
		int totalLength = 10;
		for (int i = 2; i <= 4000; i++) {
			if (!isPrime(i)) {
				continue;
			}
			for (int j = 1; j <= 4000; j++) {
				int length = 1;
				int temp = i;
				while (true) {
					temp += j;
					if (isPrime(temp)) {
						length++;
						if (length >= totalLength) {
							System.out.println(j);
							return;
						}
					} else {
						break;
					}
				}
			}
		}
	}
	
	public static boolean isPrime(int parameter) {
		for (int i = 2; i <= parameter / 2; i++) {
			if (parameter % i == 0) {
				return false;
			}
		}
		return true;
	}
}
