package itemBank;

import java.util.Scanner;

public class TortoiceAndRabbit {
	
	static char winer = ' ';
	static int time = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int v1 = scanner.nextInt();		//兔子的速度
		int v2 = scanner.nextInt();		//乌龟的速度
		int t = scanner.nextInt();		//兔子触发休息需要领先t米
		int s = scanner.nextInt();		//触发休息会休息s秒
		int l = scanner.nextInt();		//赛道长度
		
		scanner.close();
		
		int rabbitLength = 0;
		int tortoiceLength = 0;
		for (int i = 1; i < l; i++) {
			rabbitLength += v1;
			tortoiceLength += v2;
			if (check(rabbitLength, tortoiceLength, l, i)) {
				return;
			}
			if (rabbitLength - tortoiceLength >= t) {
				for (int a = 0; a < s; a++) {
					i += 1;
					tortoiceLength += v2;
					if (check(rabbitLength, tortoiceLength, l, i)) {
						return;
					}
				}
			}
		}
	}
	
	public static boolean check(int rabbitLength, int tortoiceLength, int l, int currentTime) {
		if (rabbitLength == tortoiceLength && rabbitLength >= l) {
			winer = 'D';
			time = currentTime;
			System.out.println(winer);
			System.out.println(time);
			return true;
		} else if (rabbitLength >= l) {
			winer = 'R';
			time = currentTime;
			System.out.println(winer);
			System.out.println(time);
			return true;
		} else if (tortoiceLength >= l) {
			winer = 'T';
			time = currentTime;
			System.out.println(winer);
			System.out.println(time);
			return true;
		}
		
		return false;
	}
}
