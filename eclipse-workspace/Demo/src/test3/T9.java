package test3;

import java.util.Scanner;
import java.util.ArrayList;

public class T9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		sc.close();

		int max = 0;
		int counter = 0;
		for (int k = 0; k < N; k++) {
			@SuppressWarnings("unchecked")
			ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();
			counter = 0;
			for (int i = k, j = 1; i <= Integer.MAX_VALUE && j <= Integer.MAX_VALUE; i++, j++) {
				if (j >= N * 2 || temp.size() == 0) {
					break;
				}
				if (j == temp.get(i % temp.size())) {
					int size = temp.size();
					counter += temp.remove(i % size);
					if (temp.isEmpty()) {
						break;
					}
					i = i % size - 1;
					j = 0;
				}
			}
			if (counter > max) {
				max = counter;
			}
		}
		System.out.println(max);
	}
}
