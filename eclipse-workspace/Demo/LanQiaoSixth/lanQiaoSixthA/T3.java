package lanQiaoSixthA;

import java.util.Iterator;
import java.util.TreeSet;

public class T3 {
									//A   B   C
	static int[] data = new int[9];	//012 345 678
	static boolean[] book = new boolean[10];
	static TreeSet<Integer> answer = new TreeSet<Integer>(); 
	
	public static void main(String[] args) {
		f(0);
		Iterator<Integer> it = answer.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
	
	public static void f(int index) {
		if (index == 9) {
			int A = data[0] * 100 + data[1] * 10 + data[2];
			if (check() && answer.add(A));
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if (!book[i]) {
				book[i] = true;
				data[index] = i;
				f(index + 1);
				data[index] = 0;
				book[i] = false;
			}
		}
	}

	private static boolean check() {
		int A = data[0] * 100 + data[1] * 10 + data[2];
		int B = data[3] * 100 + data[4] * 10 + data[5];
		int C = data[6] * 100 + data[7] * 10 + data[8];
		if (B == 2 * A && C == 3 * A) {
			return true;
		}
		return false;
	}
}
