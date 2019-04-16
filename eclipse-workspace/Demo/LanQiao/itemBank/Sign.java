package itemBank;

import java.util.Scanner;

public class Sign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double input = sc.nextDouble();
		
		sc.close();
		
		System.out.println(sign(input));
	}
	
	public static int sign(double x) {
		if (x > 0) {
			return 1;
		} else if (x == 0) {
			return 0;
		} else if (x <= 0) {
			return -1;
		}
		return 0;
	}
}
