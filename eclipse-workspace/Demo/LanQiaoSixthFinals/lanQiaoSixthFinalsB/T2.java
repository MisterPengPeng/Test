package lanQiaoSixthFinalsB;

public class T2 {
	
	static int[] data = new int[10];
	static boolean[] book = new boolean[13];
	static int counter = 0;
	
	public static void main(String[] args) {
		book[7] = true;
		book[11] = true;
		f(0);
		System.out.println(counter / 2 / 5);
	}

	private static void f(int index) {
		if (index == 10) {
			if (check()) {
				counter++;
			}
			return;
		}
		
		for (int i = 1; i <= 12; i++) {
			if (data[index] == 0 && !book[i]) {
				data[index] = i;
				book[i] = true;
				f(index + 1);
				data[index] = 0;
				book[i] = false;
			}
		}
	}

	private static boolean check() {
		int a = data[1] + data[2] + data[3] + data[4];
		int b = data[4] + data[6] + data[7] + data[8];
		int c = data[8] + data[5] + data[2] + data[0];
		int d = data[0] + data[3] + data[6] + data[9];
		int e = data[9] + data[7] + data[5] + data[1];
		
		if (a == b && b == c && c == d && d == e) {
			return true;
		}
		return false;
	}
}
