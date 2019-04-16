package lanQiaoFifthB;

public class T4 {
	
	static int[] data = {0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0};
	static boolean isOk = false;
	
	public static void main(String[] args) {
		f(1);
	}
	
	public static void f(int index) {
		if (index == 4) {
			index++;
		}
		if (index >= 7) {
			for (int i = 1; i < data.length; i++) {
				System.out.print(data[i]);
			}
			isOk = true;
			return;
		}
		
		for (int i = 3; i < 14; i++) {
			if ((i + index + 1) <= 14 && data[i] == 0 && data[i + index + 1] == 0) {
				data[i] = index;
				data[i + index + 1] = index;
				f(index + 1);
				if (isOk) {
					return;
				}
				data[i] = 0;
				data[i + index + 1] = 0;
			}
		}
	}
}
