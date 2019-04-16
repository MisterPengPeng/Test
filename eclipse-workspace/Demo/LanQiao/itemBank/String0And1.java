package itemBank;

import java.math.BigInteger;

public class String0And1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 31; i++) {
			BigInteger temp = new BigInteger(i + "");
			String data = temp.toString(2);
			for (int j = 0; j < 5 - data.length(); j++) {
				System.out.print(0);
			}
			System.out.println(data);
		}
	}
}
