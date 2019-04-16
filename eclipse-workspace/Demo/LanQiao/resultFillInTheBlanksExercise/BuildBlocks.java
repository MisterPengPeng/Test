package resultFillInTheBlanksExercise;



/*
搭积木

小明最近喜欢搭数字积木，
一共有10块积木，每个积木上有一个数字，0~9。

搭积木规则：
每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。

下面是两种合格的搭法：

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4    

请你计算这样的搭法一共有多少种？

请填表示总数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/
public class BuildBlocks {
	
	static int counter = 0;
	static boolean[] book = new boolean[10];
	static int[][] blocks = new int[4][];
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			blocks[i] = new int[i + 1];
		}
		dfs(0, 0);
		System.out.println(counter);
	}
	
	public static void dfs(int line, int column) {
		if (line == 4 && check()) {
			counter++;
			return;
		}
		
		for (int j = 0; j < 10; j++) {
			if (!book[j]) {
				if (column == blocks[line].length - 1) {
					book[j] = true;
					blocks[line][column] = j;
					dfs(line + 1, 0);
					book[j] = false;
				} else {
					book[j] = true;
					blocks[line][column] = j;
					dfs(line, column + 1);
					book[j] = false;
				}
			}
		}
	}
	
	public static boolean check() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				if (blocks[i][j] > blocks[i + 1][j] || blocks[i][j] > blocks[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
