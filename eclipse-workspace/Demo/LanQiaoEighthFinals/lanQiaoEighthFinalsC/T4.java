package lanQiaoEighthFinalsC;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();

		in.close();

		long sn = n;
		long sa = a % b; // ��ʱ��sa*10��bȡ���õ�С������һλ
		long count = 0;
		while (sn-- > 0) {
			if (sa == b) // ȡ��֮��������
				break;
			if (sa < b) {
				sa = sa * 10;
			} else {
				// ��������������
				sa = sa % b;
				sa = sa * 10;
				if (sa == 0)
					break; // ���涼������ֱ������ѭ��
 
			}
			count++;
			if (sa % b == a % b){ 
			// ����ѭ������
				sn = n % count;
			}
		}
		if (sa == 0) {
			System.out.println("000");
		} else {
			int i = 3;
			while (i-- > 0) {
				System.out.print(sa / b); // �����n����λ��ÿһλ
				sa = sa % b;
				sa = sa * 10;
			}
		}
	}
}
