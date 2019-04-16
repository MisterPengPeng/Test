package itemBank;

import java.math.BigDecimal;
import java.util.Scanner;

public class P0505 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		BigDecimal result = new BigDecimal("1");
		for (int i = 2; i <= input; i++) {
			result = result.multiply(new BigDecimal(i + ""));
		}
		
		while (result.remainder(BigDecimal.TEN).equals(BigDecimal.ZERO)) {
			result = result.divide(BigDecimal.TEN);
		}
		System.out.println(result.remainder(BigDecimal.TEN));
	}
}
