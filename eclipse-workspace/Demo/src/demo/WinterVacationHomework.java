package demo;

/*
** 寒假作业 ** 2016年C组填空题

现在小学的数学题目也不是那么好玩的。
看看这个寒假作业：
   □ + □ = □
   □ - □ = □
   □ × □ = □
   □ ÷ □ = □
每个方块代表1~13中的某一个数字，但不能重复。比如：
 6  + 7 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5
以及： 
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5
就算两种解法。（加法，乘法交换律后算不同的方案） 你一共找到了多少种方案？
注意÷需要能除尽
*/
public class WinterVacationHomework {
	
	static int[] paiFa = new int[12];
	static boolean[] used = new boolean[13];
	static int counter = 0;
	public static void main(String[] args) {
		paiShu(0);
		System.out.println(counter);
	}
	
	public static void paiShu(int n) {
		for (int i = 1; i <= 13; i++) {
			if (used[i - 1] == false) {
				paiFa[n] = i;
				if (n == 2) {
					// 第1行结果
					if (paiFa[0] + paiFa[1] != paiFa[2]) {
						continue;
					}
				} else if (n == 5) {
					// 第2行结果
					if (paiFa[3] - paiFa[4] != paiFa[5]) {
						continue;
					}
				} else if (n == 8) {
					// 第3行结果
					if (paiFa[6] * paiFa[7] != paiFa[8]) {
						continue;
					}
				} else if (n == 11) {
					// 第4行结果
					if ((paiFa[9] % paiFa[10] == 0) && 
							(paiFa[9] / paiFa[10] == paiFa[11])) {
						counter++;
						return;
					} else {
						continue;
					}
				}
				
				if (n < 11) {
					used[i - 1] = true;
					paiShu(n + 1);
					used[i - 1] = false;
				}
			}
		}
	}

}

