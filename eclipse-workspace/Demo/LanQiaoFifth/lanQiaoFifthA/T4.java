package lanQiaoFifthA;

public class T4 {
	
	static int[] data = {0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0};
	
	public static void main(String[] args) {
		f(1);
	}
	
	public static void f(int num) {
		if (num == 4) {
			num++;
		}
		
		if (num == 7) {
			for (int i = 1; i <= 14; i++) {
				System.out.print(data[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i = 3; i <= 14; i++) {
			if (i + num + 1 <= 14 && data[i] == 0 && data[i + num + 1] == 0) {
				data[i] = num;
				data[i + num + 1] = num;
				f(num + 1);
				data[i] = 0;
				data[i + num + 1] = 0;
			}
		}
	}
}
