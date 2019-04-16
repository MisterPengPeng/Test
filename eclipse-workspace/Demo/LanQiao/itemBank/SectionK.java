package itemBank;

import java.util.Scanner;

public class SectionK {
	// 10
	// mod = 2
	/*	1 2 3 4 5
	 * sum[0] = 0;
	 * sum[1] = 1;		1 % 2 = 1;
	 * sum[2] = 3;		3 % 2 = 1;
	 * sum[3] = 6;		6 % 2 = 0;
	 * sum[4] = 10;		10 % 2 = 0;
	 * sum[5] = 15;		15 % 2 = 1;
	 * 	��ǰ1�����ĺ�ȡģ�� Ϊ1        ֮ǰ��0��ǰ׺��ȡģ��Ϊ1������+0
����		��ǰ2�����ĺ�ȡģ�� Ϊ1        ֮ǰ��1��ǰ׺��ȡģ��Ϊ1������+1
����		��ǰ3�����ĺ�ȡģ�� Ϊ0        ֮ǰ��0��ǰ׺��ȡģ��Ϊ0, ����+0
����		��ǰ4�����ĺ�ȡģ�� Ϊ0        ֮ǰ��1��ǰ׺��ȡģ��Ϊ0������+1
����		��Ǯ5�����ĺ�ȡģ�� Ϊ1        ֮ǰ��2��ǰ׺��ȡģ��Ϊ1������+2
	 */
	static int[] sum;
	static int[] num;
	static int[] count;
	static int N;
	static int K;
	static long answer = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();		//��������N����
		K = in.nextInt();		//��Kȡ��
		num = new int[100001];		//����
		sum = new int[100001];
		count = new int[100001];
		for (int i = 1; i <= N; i++) {
			num[i] = in.nextInt();
			sum[i] = (sum[i - 1] + num[i]) % K;
			answer += count[sum[i]];
			count[sum[i]]++;
		}

		in.close();
		
		System.out.println(answer + count[0]);
	}
}