package itemBank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		BigDecimal result = new BigDecimal("1");
		for (int i = 2; i <= input; i++) {
			result = result.multiply(new BigDecimal(i + ""));
		}
		
		System.out.println(result);
	}
}
