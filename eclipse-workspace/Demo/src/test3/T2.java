package test3;

public class T2 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 100; i <= 999; i++) {
			if (check(i)) {
				counter++;
				System.out.println(i);
			}
		}
		
		System.out.println(counter);
	}
	
	public static boolean check(int i) {
		int a = i / 100;
		int b = (i / 10) % 10;
		int c = i % 10;
		
		if (a > b && b > c && a != b && b != c && a != c) {
			return true;
		}
		return false;
	}
}
