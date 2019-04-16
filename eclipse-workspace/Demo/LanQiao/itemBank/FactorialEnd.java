package itemBank;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int len = sc.nextInt();
		
		sc.close();
		
		BigDecimal result = BigDecimal.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(new BigDecimal(i + ""));
		}
		
		String resultStr = result.toPlainString();
		if (resultStr.length() < len) {
			String zero = repeat("0", len - resultStr.length());
			System.out.println(zero + resultStr);
		} else {
			System.out.println(resultStr.substring(resultStr.length() - len));
		}
	}
	
	public static String repeat(String data, int times) {
		String temp = data;
		for (int i = 0; i < times - 1; i++) {
			temp += data;
		}
		return temp;
	}
}
