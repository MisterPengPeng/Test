package lanQiaoSixthB;

public class T3 {
	//ÏéÈğÉú»ÔÈıÑòÏ×Æø
	//0 1 2 3 4 5 6 7
	static int[] data = new int[8];
	static boolean[] book = new boolean[10];
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			data[i] = -1;
		}
		f(0);
	}
	
	public static void f(int index) {
		if (index == 8) {
			if (check()) {
				System.out.println(data[4] + "" + data[5] + "" + data[6] + "" + data[1]);
			}
			return;
		}
		
		for (int i = 0; i <= 9; i++) {
			if ((i == 0 && index == 0) || (i == 0 && index == 4)) {
				continue;
			}
			if (!book[i] && data[index] == -1) {
				book[i] = true;
				data[index] = i;
				f(index + 1);
				data[index] = -1;
				book[i] = false;
			}
		}
	}
	
	public static boolean check() {
		int a = data[3] + data[2] * 10 + data[1] * 100 + data[0] * 1000;
		int b = data[1] + data[6] * 10 + data[5] * 100 + data[4] * 1000;
		int c = data[7] + data[1] * 10 + data[2] * 100 + data[5] * 1000 + data[4] * 10000;
		if (a + b == c) {
			return true;
		}
		return false;
	}
}
