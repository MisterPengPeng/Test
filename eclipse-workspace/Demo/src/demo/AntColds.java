package demo;

import java.util.Scanner;

/*
** ���ϸ�ð **

��������
������100���׵�ϸ��ֱ��������nֻ���ϡ����ǵ�ͷ�еĳ����еĳ��ҡ�
����ÿֻ���϶�ֻ�����Ÿ�����ǰ�����ٶ���1����/�롣
��������ֻ��������ʱ�����ǻ�ͬʱ��ͷ���෴�ķ������С�
������Щ�����У���1ֻ���ϸ�ð�ˡ������ں�������������ʱ����Ѹ�ð��Ⱦ�����������ϡ�
����������㣬���������϶��������ʱ���ж���ֻ���ϻ����˸�ð��

�����ʽ
������һ������һ������n (1 < n < 50), ��ʾ���ϵ�������
�������ŵ�һ����n���ÿո�ֿ������� Xi (-100 < Xi < 100), Xi�ľ���ֵ����ʾ�����뿪������߶˵�ľ��롣��ֵ��ʾͷ���ң���ֵ��ʾͷ���������в������0ֵ��Ҳ���������ֻ����ռ��ͬһλ�á����У���һ�����ݴ��������ϸ�ð�ˡ�

�����ʽ
����Ҫ�����1����������ʾ����ð���ϵ���Ŀ��
  
��������
3
5 -2 8
												.......8.-10.12.......-20....25...........................................................................
�������
1

��������
5
-10 8 -20 12 25

�������
3

*/
public class AntColds {
	public static void main(String args[]) {
		int L = 0;
		int	R = 0;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] kk = new int[n+1];
		for(int i = 1; i <= n; i++) {
			kk[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 2; i <= n; i++) {
			if (kk[1] > 0) {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0) {
					R++;
				}
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0) {
					L++;
				}
			} else {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0) {
					R++;
				}
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0) {
					L++;
				}
			}
		}
		if (L != 0 || R != 0) {
			System.out.println(R + L + 1);
		} else {
			System.out.println(1);
		}
	}	
}
	
