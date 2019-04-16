package itemBank;

import java.util.Scanner;

public class TortoiceAndRabbit {
	
	static char winer = ' ';
	static int time = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int v1 = scanner.nextInt();		//���ӵ��ٶ�
		int v2 = scanner.nextInt();		//�ڹ���ٶ�
		int t = scanner.nextInt();		//���Ӵ�����Ϣ��Ҫ����t��
		int s = scanner.nextInt();		//������Ϣ����Ϣs��
		int l = scanner.nextInt();		//��������
		
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
