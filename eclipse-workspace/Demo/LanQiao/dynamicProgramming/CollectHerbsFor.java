package dynamicProgramming;

import java.util.Scanner;

public class CollectHerbsFor {
	public static void main(String[] args) {
		int[] weight = new int[101];
		int[] value = new int[101];
		int[] f = new int[1001];
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		int herbs = scanner.nextInt();
		for (int i = 0; i < herbs; i++) {
			weight[i] = scanner.nextInt();
			value[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < herbs; i++) {
			for (int j = times; j >= weight[i]; j--) {
				if (f[j] < f[j - weight[i]] + value[i]) {
					f[j] = f[j - weight[i]] + value[i];
				}
			}
		}
		
		System.out.println(f[times]);
	}
}
