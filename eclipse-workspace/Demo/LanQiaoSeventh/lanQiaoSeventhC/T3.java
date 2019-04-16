package lanQiaoSeventhC;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int input = in.nextInt();

		in.close();

		int[] book = new int[1000];
		int i = 0;
		int max = 1;
		while (input != 1) {
			int temp = input;
			int sum = 0;
			while (temp != 0) {
				sum += Math.pow(temp % 10, 2);
				temp /= 10;
			}
			if (check(book, sum) == -1) {
				book[i] = sum;
				input = sum;
			} else {
				for (int j = check(book, sum); j < book.length; j++) {
					max = book[j] > max ? book[j] : max;
				}
				break;
			}
			i++;
		}
		System.out.println(max);
	}

	public static int check(int[] data, int value) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
