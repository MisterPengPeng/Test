package itemBank;

import java.util.Scanner;

public class CookTao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();		//����
		int b = sc.nextInt();		//������
		int c = sc.nextInt();		//����
		int d = sc.nextInt();		//����
		
		sc.close();
		
		int counterA = 0;			//������������
		int counterB = 0;			//��������
		int counterC = 0;			//��������
		int counterD = 0;			//ˮ��������
		int counterE = 0;			//��ζ��
		
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
