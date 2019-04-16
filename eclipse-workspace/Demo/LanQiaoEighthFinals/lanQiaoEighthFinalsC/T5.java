package lanQiaoEighthFinalsC;

import java.util.Scanner;

public class T5 {
	
	static boolean[][] know;		//�Ƿ���ʶ
	static int[][] examinationRoom;	//����
	static int min = Integer.MAX_VALUE;			//���ٿ���
	static int n;					//�μӿ��Ե�����
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int m = in.nextInt();
		know = new boolean[n + 1][n + 1];
		examinationRoom = new int[n][n + 1];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			know[a][b] = know[b][a] = true;
		}
		
		in.close();
		
		f(1, 0);
		System.out.println(min);
	}


	private static void f(int examineeID, int examinationRoomCount) {
		if (examinationRoomCount >= min) {
			return;
		}
		
		if (examineeID > n) {
			min = Math.min(examinationRoomCount, min);
			return;
		}
		
		A:for (int i = 0; i < examinationRoomCount; i++) {
			int examineeCount = examinationRoom[i][n];
			int j;
			for (j = 0; j < examineeCount; j++) {
				if (know[examinationRoom[i][j]][examineeID]) {
					continue A;
				}
			}
			
			if (j == examineeCount) {
				examinationRoom[i][examinationRoom[i][n]++] = examineeID;
				f(examineeID + 1, examinationRoomCount);
				examinationRoom[i][n]--;
			}
		}
		
		examinationRoom[examinationRoomCount][examinationRoom[examinationRoomCount][n]++] = examineeID;
		f(examineeID + 1, examinationRoomCount + 1);
		--examinationRoom[examinationRoomCount][n];
	}
}
