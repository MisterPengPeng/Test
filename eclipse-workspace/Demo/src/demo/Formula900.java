package demo;

/*
** 算式900 ** 2017年C组填空题

小明的作业本上有道思考题：看下面的算式：
 
  (□□□□-□□□□)*□□=900
 
  其中的小方块代表0~9的数字，这10个方块刚好包含了0~9中的所有数字。
  注意：0不能作为某个数字的首位。
 
小明经过几天的努力，终于做出了答案！如下：
(5012-4987)*36=900
 
用计算机搜索后，发现还有另外一个解，本题的任务就是：请你算出这另外的一个解。
 
注意：提交的格式需要与示例严格一致；
      括号及运算符号不要用中文输入法；
      整个算式中不能包含空格。
*/
public class Formula900 {
	static int[] answer = new int[10];
	static int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static boolean[] used = new boolean[10];

	public static void main(String[] args) {
		Dfs(0);
	}

	public static void Dfs(int temp) {
		if (temp == 10) {
			if (answer[0] != 0 && answer[4] != 0 && answer[8] != 0) {
				int a = answer[0] * 1000 + answer[1] * 100 + answer[2] * 10 + answer[3];
				int b = answer[4] * 1000 + answer[5] * 100 + answer[6] * 10 + answer[7];
				int c = answer[8] * 10 + answer[9];
				if ((a - b) * c == 900) {
					System.out.println("(" + a + "-" + b + ")" + "*" + c + "=" + 900);
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (used[i] == false) {
				answer[temp] = num[i];
				used[i] = true;
				Dfs(temp + 1);
				used[i] = false;
			}
		}
	}
}
