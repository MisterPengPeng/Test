package resultFillInTheBlanksExercise;


/*
方格填数
如下的10个格子
    +---+---+---+
    |   |   |   |
+---+---+---+---+
|   |   |   |   |
+---+---+---+---+
|   |   |   |
+---+---+---+
（如果显示有问题，也可以参看【图1.jpg】）
填入0~9的数字。要求：连续的两个数字不能相邻。
（左右、上下、对角都算相邻）
一共有多少种可能的填数方案？
请填写表示方案数目的整数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/
public class SquareFillNumberB {
	
	static int counter = 0;
	static boolean[] book = new boolean[10];
	static int[][] answer = new int[3][4];
	
	public static void main(String[] args) {
		answer[0][0] = 233;
		answer[2][3] = 233;
		dfs(0, 1);
		System.out.println(counter);
	}
	
	public static void dfs(int line, int column) {
		if (line == 2 && column == 3) {
			counter++;
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (column == 3 && !book[i]) {
				answer[line][column] = i;
				if (check(line, column)) {
					book[i] = true;
					dfs(line + 1, 0);
					book[i] = false;
				}
			} else if (!book[i]) {
				answer[line][column] = i;
				if (check(line, column)) {
					book[i] = true;
					dfs(line, column + 1);
					book[i] = false;
				}
			}
		}
	}
	
	public static boolean check(int line, int column) {
		if ((line == 0 && column == 0) || (line == 2 && column == 3)) {
			return false;
		} else if (line == 0) {		//If line is zero, only check left.
			if (Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {
				return false;
			}
		} else if (column == 0) {	//If columln is zero, check up and up right.
			if (Math.abs(answer[line][column] - answer[line - 1][column]) == 1
					|| Math.abs(answer[line][column] - answer[line - 1][column + 1]) == 1) {
				return false;
			}
		} else if (column == 3 && line != 0) {	//If column is three and line isn't zero, check up left, up and left
			if (Math.abs(answer[line][column] - answer[line - 1][column - 1]) == 1			//up left
					|| Math.abs(answer[line][column] - answer[line - 1][column]) == 1		//up
					|| Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {	//left
				return false;
			}
		} else { 					//Else check four position, up left, up, up right and left
			if (Math.abs(answer[line][column] - answer[line - 1][column - 1]) == 1			//up left
					|| Math.abs(answer[line][column] - answer[line - 1][column]) == 1		//up
					|| Math.abs(answer[line][column] - answer[line - 1][column + 1]) == 1	//up right
					|| Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {	//lift
				return false;
			}
		}
		
		return true;
	}
}
