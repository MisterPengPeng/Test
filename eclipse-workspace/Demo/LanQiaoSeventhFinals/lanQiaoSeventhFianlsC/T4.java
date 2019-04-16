package lanQiaoSeventhFianlsC;

import java.util.ArrayList;
import java.util.Scanner;

public class T4 {
	
	static int maxNumber = 0;
	static int maxGet = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			int input = in.nextInt();
			data[i] = input;
			maxNumber = input > maxNumber ? input : maxNumber;
		}
		
		in.close();
		
		for (int i = 0; i < N; i++) {
			int currentMaxGet = 0;
			ArrayList<Integer> queue = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				queue.add(data[j]);
			}
			for (int number = 1, tempI = i; number <= maxNumber; ) {
				if (queue.isEmpty()) {
					break;
				}
				tempI %= queue.size();
				if (number == queue.get(tempI)) {
					currentMaxGet += queue.get(tempI);
					queue.remove(tempI);
					number = 1;
				} else {
					number++;
					tempI++;
				}
			}
			maxGet = currentMaxGet > maxGet ? currentMaxGet : maxGet;
			currentMaxGet = 0;
		}
		
		System.out.println(maxGet);
	}
}
