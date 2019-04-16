package itemBank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigDecimal a = new BigDecimal(scanner.next());
		BigDecimal b = new BigDecimal(scanner.next());
		
		scanner.close();
		
		System.out.println(a.add(b));
	}
}
