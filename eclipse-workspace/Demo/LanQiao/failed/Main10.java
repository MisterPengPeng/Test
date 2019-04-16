package failed;

import java.util.Scanner;

public class Main10 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//////////////////////
		System.out.println(n);//只是为了不让n报警告, 删掉就好
		//////////////////////
		int m = scanner.nextInt();
		
		int[][] arr = new int[m][2];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
	}
}
