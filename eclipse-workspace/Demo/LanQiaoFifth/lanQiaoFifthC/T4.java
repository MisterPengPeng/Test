package lanQiaoFifthC;

public class T4 {
	
	static int[] data = new int[7];
	static boolean[] book = new boolean[10];
	
	public static void main(String[] args) {
		f(0);
	}
	
	public static void f(int n) {
		if (n == 7) {
			if (data[6]
			+ data[5] * 10 + data[6]
			+ data[4] * 100 + data[5] * 10 + data[6]
			+ data[3] * 1000 + data[4] * 100 + data[5] * 10 + data[6]
			+ data[2] * 10000 + data[3] * 1000 + data[4] * 100 + data[5] * 10 + data[6]
			+ data[1] * 100000 + data[2] * 10000 + data[3] * 1000 + data[4] * 100 + data[5] * 10 + data[6]
			+ data[0] * 1000000 + data[1] * 100000 + data[2] * 10000 + data[3] * 1000 + data[4] * 100 + data[5] * 10 + data[6]
			== data[3] * 1000000 + data[3] * 100000 + data[3] * 10000 + data[3] * 1000 + data[3] * 100 + data[3] * 10 + data[3]) {
				for (int i : data) {
					System.out.print(i);
				}
				System.out.println();
			}
			return;
		}
		
		for (int i = 0; i <= 9; i++) {
			if (!book[i]) {
				book[i] = true;
				data[n] = i;
				f(n + 1);
				book[i] = false;
			}
		}
	}
}
