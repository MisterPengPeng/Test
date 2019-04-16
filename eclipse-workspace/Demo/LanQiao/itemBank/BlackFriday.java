package itemBank;

import java.util.Calendar;
import java.util.Scanner;

public class BlackFriday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		sc.close();
		
		int counter = 0;
		Calendar date = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			date.set(year, i, 13);
			if (date.get(Calendar.DAY_OF_WEEK) == 6) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
