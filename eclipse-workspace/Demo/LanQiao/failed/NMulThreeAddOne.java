package failed;

import java.util.ArrayList;
import java.util.Scanner;

public class NMulThreeAddOne {
	
	static ArrayList<int[]> data = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.nextLine() != null) {
			int[] temp = new int[2];
			for (int i = 0; i < 2; i++) {
				temp[i] = scanner.nextInt();
			}
			data.add(temp);
		}
		scanner.close();
	}
}
