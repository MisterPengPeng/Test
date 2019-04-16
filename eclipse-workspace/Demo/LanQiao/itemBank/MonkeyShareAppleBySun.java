package itemBank;

import java.util.Scanner;

public class MonkeyShareAppleBySun {
	public static void main(String[] args) {
		// 猴子偷苹果
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		for (long finalInHand = 0; true; finalInHand++) { // 第2天每个猴分到的苹果数
			long left = finalInHand * n + m; // 第1天每个猴子偷完苹果后，剩下的总数
			boolean isError = false;
			for (int i = n; i >= 1; i--) { // 尝试能不能推出第n个猴子偷完苹果之后，剩下了多少苹果
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
