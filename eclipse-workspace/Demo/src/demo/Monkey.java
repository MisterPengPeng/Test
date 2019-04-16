package demo;

public class Monkey {
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		int b = 6;
		while(true) {
			if (b % 5 == 1 && b >= 5) {
				int c = b - ((b - 1) / 5) - 1;
				if (c % 5 == 2 && c >= 5) {
					int d = c - ((c - 2) / 5) - 2;
					if (d % 5 == 3 && d >= 5) {
						int e = d - ((d - 3) / 5) - 3;
						if (e % 5 == 4 && e >= 5) {
							int f = e - ((e - 4) / 5) - 4;
							if (f % 5 == 0 && f >= 5) {
								System.out.println(b);
								break;
							}
						}
					}
				}
			}
			b++;
		}
		double endTime = System.currentTimeMillis();
		double time = endTime - startTime;
		System.out.println("开始时间: " + startTime + "\n结束时间: " + endTime + "\n程序用时: " + time);
	}
}
