package lanQiaoEighthFinalsC;

import java.util.ArrayList;
import java.util.Iterator;

public class T2 {

	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<Integer> b = new ArrayList<>();
	static boolean[] book = new boolean[17];

	public static void main(String[] args) {
		for (int i = 1; i <= 16; i++) {
			f(8);
		}
	}
	
	public static void f(int length) {
		if (a.size() == length) {
			check();
			return;
		}
		
		for (int i = 1; i <= 16; i++) {
			if (!book[i]) {
				a.add(i);
				book[i] = true;
				f(length);
				book[i] = false;
				a.remove((Integer)i);
			}
		}
	}

	private static void check() {
		for (int i = 1; i <= 16; i++) {
			if (!a.contains(i)) {
				b.add(i);
			}
		}
		
		Iterator<Integer> it;
		int aSum = 0;
		int bSum = 0;
		int aSquare = 0;
		int bSquare = 0;
		int aCube = 0;
		int bCube = 0;
		
		it = a.iterator();
		while (it.hasNext()) {
			int temp = it.next();
			aSum += temp;
			aSquare += Math.pow(temp, 2);
			aCube += Math.pow(temp, 3);
		}
		
		it = b.iterator();
		while (it.hasNext()) {
			int temp = it.next();
			bSum += temp;
			bSquare += Math.pow(temp, 2);
			bCube += Math.pow(temp, 3);
		}
		
		if (aSum == bSum && aSquare == bSquare && aCube == bCube) {
			it = (a.contains(1) ? a.iterator() : b.iterator());
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}
		}
	}
}
