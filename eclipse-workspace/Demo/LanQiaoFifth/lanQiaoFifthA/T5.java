package lanQiaoFifthA;

import java.util.Scanner;
import java.util.TreeSet;

public class T5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		in.close();
		
		TreeSet<String> book = new TreeSet<String>();
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i * i + j * j == n * n 
						&& book.add(i < j ? i + "" + j + "" + n : j + "" + i + "" + n)) {}
			}
		}
		
		System.out.println(book.size());
	}
}
