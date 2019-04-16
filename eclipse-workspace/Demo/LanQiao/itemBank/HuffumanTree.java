package itemBank;

import java.util.ArrayList;
import java.util.Scanner;

public class HuffumanTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			data.add(scanner.nextInt());
		}
		
		scanner.close();
		
		int counter = 0;
		while (data.size() != 1) {
			int index1 = 0;
			int index2 = 0;
			for (int i = 1; i < data.size(); i++) {
				if (data.get(i) < data.get(index1)) {
					index1 = i;
				}
			}
			int value1 = data.remove(index1);
			for (int i = 1; i < data.size(); i++) {
				if (data.get(i) < data.get(index2)) {
					index2 = i;
				}
			}
			int value2 = data.remove(index2);
			data.add(value1 + value2);
			counter += value1 + value2;
		}
		System.out.println(counter);
	}
}
