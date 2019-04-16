package grokkingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
	
	static final int LENGTH = 128;
	
	public static void main(String[] args) {
		int[] data = new int[LENGTH];
		for (int i = 0; i < LENGTH; i++) {
//			data[i] = (int)(Math.random() * 100);
			data[i] = i;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.close();
		
		int mid = LENGTH / 2;
		int high = LENGTH - 1;
		int low = 0;
		int index = 0;
		int step = 0;
		while (data[mid] != input) {
			step++;
			if (index == LENGTH - 1) {
				break;
			}
			if (data[mid] < input) {
				low = mid;
				mid += ((high - low) / 2 + 1);
			} else if (data[mid] > input) {
				high = mid;
				mid -= ((high - low) / 2 + 1);
			}
			index++;
		}
		
		if (data[mid] == input) {
			System.out.println(mid);
			System.out.println(step);
		} else {
			System.out.println("Sorry, I didn't find it.");
			System.out.println(step);
		}
	}
}
