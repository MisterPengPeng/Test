package lanQiaoSeventhFianlsC;

import java.util.Scanner;

public class T5 {
	
	static int N;
	static int[] north;
	static int[] west;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		north = new int[N];
		west = new int[N];
		for (int i = 0; i < N; i++) {
			north[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			west[i] = in.nextInt();
		}
		
		in.close();
	}
}
