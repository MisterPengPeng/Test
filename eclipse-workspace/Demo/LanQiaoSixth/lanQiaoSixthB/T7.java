package lanQiaoSixthB;


public class T7 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		f(0, 0);
		System.out.println(counter);
	}
	
	public static void f(int index, int count) {
		if (count == 13) {
			counter++;
			return;
		}
		if (index == 13) {
			return;
		}
		
		int num = Math.min(13 - count, 4);
		for (int i = 0; i <= num; i++) {
			f(index + 1, count + i);
		}
		return;
	}
}
