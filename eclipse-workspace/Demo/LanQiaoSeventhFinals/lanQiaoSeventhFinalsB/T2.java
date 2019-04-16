package lanQiaoSeventhFinalsB;

public class T2 {
	
	static int counter = 0;
	static int[] data = new int[9];
	static boolean[] book = new boolean[10];
	
	public static void main(String[] args) {
		f(0);
		System.out.println(counter / 2 / 4);
	}

	private static void f(int index) {
		if (index == 9) {
			if (check()) {
				counter++;
			}
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
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
		int[] check = new int[8];
		check[0] = data[0] + data[1] + data[2];
		check[1] = data[3] + data[4] + data[5];
		check[2] = data[6] + data[7] + data[8];
		check[3] = data[0] + data[3] + data[6];
		check[4] = data[1] + data[4] + data[7];
		check[5] = data[2] + data[5] + data[8];
		check[6] = data[0] + data[4] + data[8];
		check[7] = data[2] + data[4] + data[6];
		
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 8; j++) {
				if (check[i] == check[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
