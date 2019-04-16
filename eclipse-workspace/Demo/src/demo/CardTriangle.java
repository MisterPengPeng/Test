package demo;


/*
** 纸牌三角形 ** 2017年C组填空题

A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。 
下图就是一种排法。
    A					1
   9 6				   2 3
  4   8				  4   5
 3 7 5 2			 6 7 8 9
这样的排法可能会有很多。
如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。
注意：需要提交的是一个整数，不要提交任何多余内容。
*/
public class CardTriangle {
	
	static int[] card = new int[15];
	static boolean[] judge = new boolean[15];
	static int sum = 0;
	
	public static void Dfs(int step) {
		if (step == 10 && card[1] + card[2] + card[4] + card[6] == card[1] + card[3] + card[5] + card[9] &&
				card[1] + card[2] + card[4] + card[6] == card[6] + card[7] + card[8] + card[9]) {
			sum++;
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if (judge[i] == false) {
				judge[i] = true;
				card[step] = i;
				Dfs(step + 1);
				judge[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Dfs(1);
		System.out.println(sum / 3 / 2);
	}
}
