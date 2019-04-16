package lanQiaoSeventhC;

public class T6 {
	
	static int[] data = new int[9];
	static boolean[] book = new boolean[10];
	static int counter = 0;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(counter);
	}
	
	public static void f(int index) {
		if (index == 9) {
			if (check()) {
				counter++;
			}
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
		int part1 = data[0];
		double part2 = (data[1] * 1.0) / (data[2] * 1.0);
		double part3 = (data[3] * 100 + data[4] * 10 + data[5]) * 1.0
				/ (data[6] * 100 + data[7] * 10 + data[8]) * 1.0;
		
		if (part1 + part2 + part3 == 10) {
			return true;
		}
		return false;
	}
}
