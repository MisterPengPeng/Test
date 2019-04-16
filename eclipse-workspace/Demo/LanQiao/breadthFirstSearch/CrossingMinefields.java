package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
** 穿越雷区 ** （第六届蓝桥杯真题）

题目描述
X星的坦克战车很奇怪，它必须交替地穿越正能量辐射区和负能量辐射区才能保持正常运转，否则将报废。
某坦克需要从A区到B区去（A，B区本身是安全区，没有正能量或负能量特征），怎样走才能路径最短？

已知的地图是一个方阵，上面用字母标出了A，B区，其它区都标了正号或负号分别表示正负能量辐射区。
例如：
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

坦克车只能水平或垂直方向上移动到相邻的区。

输入
输入第一行是一个整数n，表示方阵的大小， 4<=n<100
接下来是n行，每行有n个数据，可能是A，B，+，-中的某一个，中间用空格分开。
A，B都只出现一次。

输出
要求输出一个整数，表示坦克从A区到B区的最少移动步数。
如果没有方案，则输出-1

样例输入
5
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

样例输出
10
*/
public class CrossingMinefields {

	// 战车
	static class Position {
		int x; // 坐标x
		int y; // 坐标y
		int step; // 已经走过的步数

		// 空的构造函数
		public Position() {

		}

		// 构造函数
		public Position(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

	static int n; // 地图大小为n * n
	static char[][] map; // 地图
	static int[][] check; // 地图(标记走过的路)

	public static void main(String[] args) {
		Position root = new Position(); // 开始位置(根节点)

		// 地图初始化
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new char[n][n];
		check = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = scanner.next().charAt(0);
				if (map[i][j] == 'A') {
					root = new Position(i, j, 0); // 定位开始位置
				}
			}
		}
		scanner.close();

		// 队列
		Queue<Position> queue = new LinkedList<Position>();
		queue.add(root); // 向队列添加根节点

		// 开始进行BFS, 只要队列不为空, 就一直进行
		while (!queue.isEmpty()) {
			Position newPosition = queue.remove();
			int positionX;
			int positionY;

			// 四个方向行走
			// 上
			positionX = newPosition.x - 1;
			positionY = newPosition.y;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}

			// 下
			positionX = newPosition.x + 1;
			positionY = newPosition.y;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}

			// 左
			positionX = newPosition.x;
			positionY = newPosition.y - 1;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}
			// 右
			positionX = newPosition.x;
			positionY = newPosition.y + 1;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}
		}

		System.out.println(-1); // 如果全部节点检查完毕且没有找到到达终点的方案, 输出-1
	}

	// 检查是否满足条件
	public static boolean check(Queue<Position> queue, Position newPosition, int positionX, int positionY) {

		// 检查是否满足行走条件
		if (0 <= positionX && positionX < n && 0 <= positionY && positionY < n && check[positionX][positionY] == 0) {

			// 检查正负能量辐射区是否交替
			if (map[newPosition.x][newPosition.y] != map[positionX][positionY]) {
				check[positionX][positionY] = 1; // 标记走过的路
				if (map[positionX][positionY] == 'B') { // 检查是否到达终点
					System.out.println(newPosition.step + 1);
					return true;
				}

				// 如果没有到达终点, 向队列中添加子节点
				queue.add(new Position(positionX, positionY, newPosition.step + 1));
			}
		}

		return false;
	}
}
