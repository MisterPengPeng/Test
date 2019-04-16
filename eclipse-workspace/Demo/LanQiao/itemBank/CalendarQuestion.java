package itemBank;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CalendarQuestion {
	static class Date implements Comparable<Date> {
		int year;
		int month;
		int day;

		public Date(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		@Override
		public int compareTo(Date o) {
			if (this.year != o.year) {
				return this.year - o.year;
			}
			if (this.month != o.month) {
				return this.month - o.month;
			}
			return this.day - o.day;
		}

	}

	static TreeSet<Date> list = new TreeSet<Date>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] inputs = sc.next().split("/");
		
		sc.close();
		
		int part0 = Integer.parseInt(inputs[0]);
		int part1 = Integer.parseInt(inputs[1]);
		int part2 = Integer.parseInt(inputs[2]);
		tryDate(part0, part1, part2);
		tryDate(part2, part0, part1);
		tryDate(part2, part1, part0);
		Iterator<Date> itr = list.iterator();
		while (itr.hasNext()) {
			Date d = itr.next();
			System.out.println(String.format("%d-%02d-%02d", d.year, d.month, d.day));
		}
	}
	
	public static boolean isLeapYear(int year) {
		return ((year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0));
	}
	
	public static void tryDate(int year, int month, int day) {
		if (0 < month && month < 13 && 0 < day) {
			year = year >= 60 ? (1900 + year) : (2000 + year);
			int[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (isLeapYear(year)) {
				dayOfMonth[2] = 29;
			}
			if (day <= dayOfMonth[month]) {
				list.add(new Date(year, month, day));
			}
		}
	}
}
