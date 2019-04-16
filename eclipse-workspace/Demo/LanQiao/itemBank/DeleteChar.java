package itemBank;

import java.util.Scanner;

public class DeleteChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String source = sc.nextLine();
		if (source == "\n") {
			System.out.println("");
		}
		String needDelete = sc.nextLine();
		
		sc.close();
		
		String newStr = "";
		for (int i = 0; i < source.length(); i++) {
			if (source.charAt(i) == needDelete.charAt(0)) {
				continue;
			}
			newStr += source.charAt(i);
		}
		
		System.out.println(newStr);
	}
}
