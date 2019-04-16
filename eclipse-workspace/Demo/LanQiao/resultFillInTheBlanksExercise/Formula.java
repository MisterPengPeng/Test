package resultFillInTheBlanksExercise;



/*
凑算式
     B      DEF
A + --- + ------- = 10
     C      GHI
     
（如果显示有问题，可以参见【图1.jpg】）
	 
	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？
注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
*/
public class Formula {
	
	static boolean[] num = new boolean[10];
	static int[] formula = new int[9];
	static int counter = 0;
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(counter);
	}
	
	public static void dfs(int index) {
		if (index == 9 && check()) {
			counter++;
		}
		
		for (int i = 1; i < 10; i++) {
			if (!num[i]) {
				formula[index] = i;
				num[i] = true;
				dfs(index + 1);
				num[i] = false;
			}
		}
	}
	
	
	public static boolean check() {
		double a = formula[0];
		double b = formula[1] * 1.0 / formula[2] * 1.0;
		double c = (formula[3] * 100 + formula[4] * 10 + formula[5]) * 1.0 / (formula[6] * 100 + formula[7] * 10 + formula[8]) * 1.0;
		if (a + b + c == 10) {
			return true;
		}
		
		return false;
	}
}
