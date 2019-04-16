package dynamicProgramming;

import java.util.Scanner;

/*
superwyh的学校要举行拔河比赛，为了在赛前锻炼大家，老师决定把班里所有人分为两组，进行拔河比赛,为了避免其中一方的实力过强老师决定以体重来划分队伍，
尽量保持两个队伍的体重差最少，因为老师对结果没兴趣，所以只告诉老师最小的体重差是多少就行了。这个受苦受累的任务就交给superwyh了，因为这两天superwyh的后背间谍sjh闹肚子了，
所以只好superwyh亲自去调查每个人的体重，但是仅仅知道体重依然难以确定到底如何分配队伍，请各位oier帮助superwyh出出主意。
输入格式：
第一行为人数(1<=n<=100)，从第二行开始是每个人的体重(0<=m<=100)。
输出格式：
最小体重差。
样例输入：
4
10
23
41
12
样例输出：
4
*/
public class TugOfWar {
	static int[] weight = new int[101];
	static int[] f = new int[1001];
	static int totalWeight = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfPeople = scanner.nextInt();
		for (int i = 0; i < numOfPeople; i++) {
			weight[i] = scanner.nextInt();
			totalWeight += weight[i];
		}
		
		scanner.close();
		
		for (int i = 0; i < numOfPeople; i++) {
			for (int j = totalWeight/2; j >= weight[i]; j--) {
				if (f[j] <= f[j - weight[i]] + weight[i]) {
					f[j] = f[j - weight[i]] + weight[i];
				}
			}
		}
		System.out.println(totalWeight - f[totalWeight / 2] * 2);
	}
}
