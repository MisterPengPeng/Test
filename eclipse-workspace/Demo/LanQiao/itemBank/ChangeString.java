package itemBank;

import java.util.Scanner;

public class ChangeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int parameter = sc.nextInt();
		String data = sc.next();

		sc.close();

		switch (parameter) {
		case 1:
			System.out.println(data.toUpperCase());
			break;

		case 2:
			System.out.println(data.toLowerCase());
			break;

		case 3:
			for (int i = data.length() - 1; i >= 0; i--) {
				System.out.print(data.charAt(i));
			}
			System.out.println();
			break;

		case 4:
			for (int i = 0; i < data.length(); i++) {
				System.out.print(data.charAt(i) < 'a' ? (char) (data.charAt(i) + 32) : (char) (data.charAt(i) - 32));
			}
			System.out.println();
			break;

		case 5:
			String temp = data.toLowerCase();
			for (int i = 0; i < temp.length(); i++) {
				int length = i;
				if (i != temp.length() - 1) {
					while ((char) (temp.charAt(length) + 1) == temp.charAt(length + 1)) {
						length++;
						if (length + 1 == temp.length()) {
							break;
						}
					}
					if (length - i > 1) {
						System.out.print(temp.charAt(i) + "-");
						i += (length - i);
					}
				}
				System.out.print(temp.charAt(i));
			}
		}
	}
}
