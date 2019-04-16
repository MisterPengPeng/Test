package itemBank;

import java.util.Scanner;

public class S01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		sc.close();
		
		f("0", input);
	}
	
	public static void f(String data, int step) {
		if (step == 0) {
			System.out.println(data);
			return;
		}
		
		StringBuilder temp = new StringBuilder(data);
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == '0') {
				temp.setCharAt(i, '1');
			} else if (temp.charAt(i) == '1') {
				temp.insert(i, '0');
				i++;
			}
		}
		f(temp.toString(), step - 1);
	}
}
