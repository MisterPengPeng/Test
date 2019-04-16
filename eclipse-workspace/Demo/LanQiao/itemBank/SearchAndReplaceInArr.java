package itemBank;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAndReplaceInArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int b = sc.nextInt();
		int[] data = new int[length];
		for (int i = 0; i < length; i++) {
			int input = sc.nextInt();
			if (input % b == 0) {
				i--;
				length--;
				continue;
			}
			data[i] = input;
		}
		
		sc.close();
		
		int[] newArr = Arrays.copyOf(data, length);
		Arrays.sort(newArr);
		
		for (int i = 0; i < length; i++) {
			if ('A' <= newArr[i] && newArr[i] <= 'Z') {
				System.out.print((char)newArr[i] + (i == length - 1 ? "" : " "));
			} else {
				System.out.print(newArr[i] + (i == length - 1 ? "" : " "));
			}
		}
	}
}
