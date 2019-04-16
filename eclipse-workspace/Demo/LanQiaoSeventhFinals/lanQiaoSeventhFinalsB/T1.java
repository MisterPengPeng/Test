package lanQiaoSeventhFinalsB;

public class T1 {

	static int counter = 0;

	public static void main(String[] args) {
		double length = 1000;
		int count = 0;
		while (length > 1) {
			length -= length / 3;
			count++;
		}
		System.out.println(count / 2);
	}
}
