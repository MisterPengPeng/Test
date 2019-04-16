package lanQiaoSixthB;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		in.close();
		
		f(n, n);
	}
	
	public static void f(int cap, int total) {
		if (cap < 3) {
			System.out.println(total);
			return;
		}
		
		int newSoda = cap / 3;
		cap %= 3;
		total += newSoda;
		cap += newSoda;
		f(cap, total);
	}
}
