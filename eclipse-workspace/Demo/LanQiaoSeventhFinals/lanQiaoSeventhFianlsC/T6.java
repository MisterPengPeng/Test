package lanQiaoSeventhFianlsC;

import java.util.Scanner;

public class T6 {
	
	static int n;
	static int m;
	static int k;
	static String[] DNA;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();		//n个物种
		m = in.nextInt();		//至少在m个生物中出现
		k = in.nextInt();		//长度为k的连续碱基序列
		DNA = new String[n];
		for (int i = 0; i < n; i++) {
			DNA[i] = in.next();
		}
		
		in.close();
	}
}
