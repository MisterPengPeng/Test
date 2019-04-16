package failed;


/*
		+----+----+----+----+
		|    |    |    |    |
		+----+----+----+----+
		|    |    |    |    |	1
		+----+----+----+----+
		|    |    |    |    |
		+----+----+----+----+
		
		+----+----+----+----+
		|    ||||||    |    |
		+----+----+----+----+
		|    |||||||||||    |	2
		+----+----+----+----+
		|    |    |||||||||||
		+----+----+----+----+
		
		+----+----+----+----+
		|    |    ||||||    |
		+----+----+----+----+
		||||||||||||||||    |	3
		+----+----+----+----+
		|    ||||||    |    |
		+----+----+----+----+
剪邮票
如【图1.jpg】, 有12张连在一起的12生肖的邮票。
现在你要从中剪下5张来，要求必须是连着的。
（仅仅连接一个角不算相连）
比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。
请你计算，一共有多少种不同的剪取方法。
请填写表示方案数目的整数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/
public class CutStampsB {

	static int[] stamp = new int[5];
	static int counter = 0;

	public static void main(String[] args) {
		for (stamp[0] = 0; stamp[0] < 12; stamp[0]++) {
			for (stamp[1] = stamp[0] + 1; stamp[1] < 12; stamp[1]++) {
				for (stamp[2] = stamp[1] + 1; stamp[2] < 12; stamp[2]++) {
					for (stamp[3] = stamp[2] + 1; stamp[3] < 12; stamp[3]++) {
						for (stamp[4] = stamp[3] + 1; stamp[4] < 12; stamp[4]++) {
							if (check()) {
								counter++;
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
	
	public static boolean check() {
		boolean[] book = new boolean[5];
		f(book, 0);
		return book[0] && book[1] && book[2] && book[3] && book[4];
	}

	public static void f(boolean[] book, int i) {
		book[i] = true;
		for (int j = 0; j < book.length; j++) {
			if (!book[j] && (stamp[i] / 4 == stamp[j] / 4) && (stamp[i] == stamp[j] + 1 || stamp[i] == stamp[j] - 1)) {
				f(book, j);
			}
			if (!book[j] && (stamp[i] == stamp[j] + 4 || stamp[i] == stamp[j] - 4)) {
				f(book, j);
			}
		}
	}
}
