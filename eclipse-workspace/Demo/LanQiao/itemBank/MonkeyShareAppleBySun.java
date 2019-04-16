package itemBank;

import java.util.Scanner;

public class MonkeyShareAppleBySun {
	public static void main(String[] args) {
		// ����͵ƻ��
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		for (long finalInHand = 0; true; finalInHand++) { // ��2��ÿ����ֵ���ƻ����
			long left = finalInHand * n + m; // ��1��ÿ������͵��ƻ����ʣ�µ�����
			boolean isError = false;
			for (int i = n; i >= 1; i--) { // �����ܲ����Ƴ���n������͵��ƻ��֮��ʣ���˶���ƻ��
				if (left % (n - 1) == 0) {
					left = left / (n - 1) * n + m;
				} else {
					isError = true;
					break;
				}
			}
			if (!isError) {
				System.out.println(left);
				return;
			}
		}
	}
}
