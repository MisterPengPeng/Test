package lanQiaoSixthA;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int w = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		in.close();

		int mX = -1;
		int mY = -1;
		int nX = -1;
		int nY = -1;
		int buildingNumber = 1;
		for (int i = 1; i <= (n > m ? n : m) / w + 1;) {
			for (int j = 1; j <= w;) {
				if (mX != -1 && mY != -1 && nX != -1 && nY != -1) {
					System.out.println(Math.abs(mX - nX + mY - nY));
					return;
				}
				
				if (buildingNumber == m) {
					mX = i - 1;
					mY = j - 1;
				} else if (buildingNumber == n) {
					nX = i - 1;
					nY = j - 1;
				}

				if (j == w && i % 2 != 0) {
					i++;
					buildingNumber++;
				} else if (j == 1 && i % 2 == 0){
					i++;
					buildingNumber++;
				}else if (i % 2 == 0) {
					j--;
					buildingNumber++;
				} else {
					j++;
					buildingNumber++;
				}
			}
		}
	}
}
