package demo;


/*
挑战练习：九数算式 （2017年省赛A组）

观察如下的算式： 
9213 x 85674 = 789314562 
左边的乘数和被乘数正好用到了1~9的所有数字，每个1次。 
而乘积恰好也是用到了1~9的所有数字，并且每个1次。 
请你借助计算机的强大计算能力，找出满足如上要求的9数算式一共有多少个？ 
注意： 
1. 总数目包含题目给出的那个示例。 
2. 乘数和被乘数交换后作为同一方案来看待。
*/
public class NineArray {
	static int[] paiFa = new int[10];
	static boolean[] used = new boolean[10];
	static int counter = 0;
	public static void main(String[] args) {
		paiShu(0);
		System.out.println(counter / 2);
	}
	
	public static void paiShu(int n) {
		for (int i = 0; i <= 9; i++) {
			if (used[i] == false) {
				paiFa[n] = i;
				if (n == 0) {
					if (paiFa[0] == 0) {
						continue;
					}
				} else if (n == 9) {
					if (paiFa[9] == 0) {
						continue;
					}
					check();
				}
				if (n < 9) {
					used[i] = true;
					paiShu(n + 1);
					used[i] = false;
				}
			}
		}
	}
	
	public static void check() {
		int x1 = 0;
		int x2 = 0;
		int i;
		for (i = 0; i < paiFa.length; i++) {
			if (paiFa[i] == 0) {
				break;
			}
			x1 = x1 * 10 + paiFa[i];
		}
		for (i = i + 1; i < paiFa.length; i++) {
			x2 = x2 * 10 + paiFa[i];
		}
		int result = x1 * x2;
		
		if (result >= 123456789 && result <= 987654321) {
			boolean[] resultUsed = new boolean[9];
			while (result > 0) {
				int x = result % 10;
				if (x == 0) { // resultUsed没有考虑0的情况；结果里也不能有0
					return;
				}
				if (resultUsed[x - 1] != true) {
					resultUsed[x - 1] = true;
				} else {
					return;
				}
				result /= 10;
			}
			counter++;
		}
	}

}
