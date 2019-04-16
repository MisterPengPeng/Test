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
	 * 	对前1个数的和取模， 为1        之前有0个前缀和取模后为1，个数+0
　　		对前2个数的和取模， 为1        之前有1个前缀和取模后为1，个数+1
　　		对前3个数的和取模， 为0        之前有0个前缀和取模后为0, 个数+0
　　		对前4个数的和取模， 为0        之前有1个前缀和取模后为0，个数+1
　　		对钱5个数的和取模， 为1        之前有2个前缀和取模后为1，个数+2
	 */
	static int[] sum;
	static int[] num;
	static int[] count;
	static int N;
	static int K;
	static long answer = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();		//接下来有N个数
		K = in.nextInt();		//对K取余
		num = new int[100001];		//队列
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
