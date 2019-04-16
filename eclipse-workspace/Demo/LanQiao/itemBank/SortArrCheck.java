package itemBank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortArrCheck {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int[] data = new int[10];
		 TreeSet<Integer> book = new TreeSet<Integer>();
		 for (int i = 0; i < 10; i++) {
			 data[i] = sc.nextInt();
		 }
		 
		 sc.close();
		 
		 Arrays.sort(data);
		 for (int i = 0; i < 10; i++) {
			 if (book.add(data[i])) {
				 System.out.println(data[i]);
			 }
		 }
	}
}
