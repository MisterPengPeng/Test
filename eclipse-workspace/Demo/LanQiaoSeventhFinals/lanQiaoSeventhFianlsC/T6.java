package lanQiaoSeventhFianlsC;

import java.util.Scanner;

public class T6 {
	
	static int n;
	static int m;
	static int k;
	static String[] DNA;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();		//n������
		m = in.nextInt();		//������m�������г���
		k = in.nextInt();		//����Ϊk�������������
		DNA = new String[n];
		for (int i = 0; i < n; i++) {
			DNA[i] = in.next();
		}
		
		in.close();
	}
}
