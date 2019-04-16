package lanQiaoSixthA;

public class T1 {
	public static void main(String[] args) {
		int totalWalnuts = 1543;
		int lostWalnuts = 0;
		
		while (totalWalnuts != 0) {
			lostWalnuts = totalWalnuts % 2 == 0 ? lostWalnuts : lostWalnuts + 1;
			totalWalnuts = totalWalnuts % 2 == 0 ? totalWalnuts / 2 : (totalWalnuts - 1) / 2;
		}
		
		System.out.println(lostWalnuts);
	}
	
//	public static void main(String[] args) {
//		int totalWalnuts = 1543;
//		
//		f(totalWalnuts, 0);
//	}
//	
//	public static void f(int totalWalnuts, int lostWalnuts) {
//		if (totalWalnuts == 1) {
//			System.out.println(lostWalnuts + 1);
//			return;
//		}
//		
//		if (totalWalnuts % 2 == 0) {
//			int nextWalnuts = totalWalnuts / 2;
//			f(nextWalnuts, lostWalnuts);
//		} else {
//			int nextWalnuts = (totalWalnuts - 1) / 2;
//			f(nextWalnuts, lostWalnuts + 1);
//		}
//	}
}
