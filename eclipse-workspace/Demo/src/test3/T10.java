package test3;

import java.util.Scanner;

public class T10 {
	static class Family {
		int di;
		int ti;
		
		public Family(int di, int ti) {
			this.di = di;
			this.ti = ti;
		}
		
		public Family() {
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		int L = sc.nextInt();
		Family[] data = new Family[n];
		for (int i = 0; i < n; i++) {
			data[i].di = sc.nextInt();
			data[i].ti = sc.nextInt();
		}
		
		sc.close();
	}
}
