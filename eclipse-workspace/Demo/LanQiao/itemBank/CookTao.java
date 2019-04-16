package itemBank;

import java.util.Scanner;

public class CookTao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();		//¼¦µ°
		int b = sc.nextInt();		//Î÷ºìÊÁ
		int c = sc.nextInt();		//¼¦¶¡
		int d = sc.nextInt();		//À±½´
		
		sc.close();
		
		int counterA = 0;			//Î÷ºìÊÁ³´¼¦µ°
		int counterB = 0;			//ËáÀ±¼¦¶¡
		int counterC = 0;			//¹¬±£¼¦¶¡
		int counterD = 0;			//Ë®ÖóÎ÷ºìÊÁ
		int counterE = 0;			//¹ÖÎ¶µ°
		
		while (a >= 2 && b >= 1 && d >= 2) {
			a -= 2;
			b -= 1;
			d -= 2;
			counterA++;
		}
		
		while (a >= 1 && b >= 1 && c >= 1 && d >= 1) {
			a -= 1;
			b -= 1;
			c -= 1;
			d -= 1;
			counterB++;
		}
		
		while (c >= 2 && d >= 1) {
			c -= 2;
			d -= 1;
			counterC++;
		}
		
		while (b >= 3) {
			b -= 3;
			counterD++;
		}
		
		while (a >= 1 && d >= 1) {
			a -= 1;
			d -= 1;
			counterE++;
		}
		
		System.out.println(counterA + "\n" + counterB + "\n" + counterC + "\n" + counterD + "\n" + counterE);
	}
}
