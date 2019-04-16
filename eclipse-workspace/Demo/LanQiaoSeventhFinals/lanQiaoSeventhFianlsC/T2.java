package lanQiaoSeventhFianlsC;

public class T2 {
	
	static int[] data = new int[14];
	static boolean[] book = new boolean[15];
	static boolean finded = false;
	
	public static void main(String[] args) {
		book[6] = true;
		book[11] = true;
		book[14] = true;
		data[0] = 6;
		data[3] = 11;
		data[13] = 14;
		f(0);
	}
	
	public static void f(int index) {
		if (index == 14) {
			check();
			return;
		}
		
		for (int i = 1; i <= 14; i++) {
			if (finded) {
				return;
			}
			
			if (data[index] != 0) {
				f(index + 1);
			} else if (data[index] == 0 && !book[i]) {
				book[i] = true;
				data[index] = i;
				f(index + 1);
				data[index] = 0;
				book[i] = false;
			}
		}
	}

	private static void check() {
		int a = data[0] + data[1] + data[2] + data[3];
		int b = data[3] + data[4] + data[5] + data[6];
		int c = data[6] + data[7] + data[8] + data[9];
		int d = data[9] + data[10] + data[1] + data[11];
		int e = data[11] + data[2] + data[4] + data[12];
		int f = data[12] + data[5] + data[7] + data[13];
		int g = data[13] + data[8] + data[10] + data[0];
		if (a == b && b == c && c == d && d == e && e == f && f == g) {
			System.out.println(data[9] + " " + data[10]+ " " + data[1] + " " + data[11]);
			finded = true;
		}
	}
}
