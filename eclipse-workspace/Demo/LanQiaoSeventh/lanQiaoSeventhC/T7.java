package lanQiaoSeventhC;

public class T7 {
	
	static int[] data = new int[10];
	static boolean[] book = new boolean[10];
	static int counter = 0;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(counter);
	}
	
	public static void f(int index) {
		if (index == 10) {
			if (check()) {
				counter++;
			}
			return;
		}
		
		for (int i = 0; i < 10; i++) {
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
		boolean three = data[3] < data[6]
				&& data[3] < data[7]
				&& data[4] < data[7]
				&& data[4] < data[8]
				&& data[5] < data[8]
				&& data[5] < data[9];
		boolean two = data[1] < data[3]
				&& data[1] < data[4]
				&& data[2] < data[4]
				&& data[2] < data[5];
		boolean one = data[0] < data[1]
				&& data[0] < data[2];
		
		if (one && two && three) {
			return true;
		}
		return false;
	}
}
