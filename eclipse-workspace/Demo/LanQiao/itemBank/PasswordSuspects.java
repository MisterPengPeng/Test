package itemBank;

import java.util.Scanner;

public class PasswordSuspects {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int length = scanner.nextInt();
		int subStringNum = scanner.nextInt();
		String[] subString = new String[subStringNum];
		for (int i = 0; i < subStringNum; i++) {
			subString[i] = scanner.next();
		}
		
		scanner.close();
		
		
	}
}
