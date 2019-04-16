package test4;

public class T3 {
	
	static int[] data = new int[9];
	static boolean[] book = new boolean[10];
	static int counter = 0;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(counter / 2 / 4);
	}
	
	public static void f(int index) {
		if (index == 9) {
			if (check()) {
				counter++;
			}
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if (!book[i] && data[index] == 0) {
				book[i] = true;
				data[index] = i;
				f(index + 1);
				data[index] = 0;
				book[i] = false;
			}
		}
	}
	
	public static boolean check() {
		int[] sum = new int[8];
		
		sum[0] = data[0] + data[1] + data[2];
		sum[1] = data[3] + data[4] + data[5];
		sum[2] = data[6] + data[7] + data[8];
		
		sum[3] = data[0] + data[3] + data[6];
		sum[4] = data[1] + data[4] + data[7];
		sum[5] = data[2] + data[5] + data[8];
		
		sum[6] = data[0] + data[4] + data[8];
		sum[7] = data[2] + data[4] + data[6];
		
		for (int i = 0; i <= 6; i++) {
			for (int j = i + 1; j <= 7; j++) {
				if (sum[i] == sum[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
