package itemBank;

import java.util.Scanner;

public class MaxTimesIntInArr {

	static int[] sort = new int[10000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sort[sc.nextInt()]++;
		}

		sc.close();

		if (n <= 0) {
			return;
		}

		int max = 0;
		for (int i = 0; i < 10000; i++) {
			if (sort[i] > sort[max]) {
				max = i;
			}
		}

		System.out.println(max);
	}
}
