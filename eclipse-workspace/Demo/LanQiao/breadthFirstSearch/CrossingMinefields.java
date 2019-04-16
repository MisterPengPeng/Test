package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
** ��Խ���� ** �����������ű����⣩

��Ŀ����
X�ǵ�̹��ս������֣������뽻��ش�Խ�������������͸��������������ܱ���������ת�����򽫱��ϡ�
ĳ̹����Ҫ��A����B��ȥ��A��B�������ǰ�ȫ����û���������������������������߲���·����̣�

��֪�ĵ�ͼ��һ��������������ĸ�����A��B�������������������Ż򸺺ŷֱ��ʾ����������������
���磺
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

̹�˳�ֻ��ˮƽ��ֱ�������ƶ������ڵ�����

����
�����һ����һ������n����ʾ����Ĵ�С�� 4<=n<100
��������n�У�ÿ����n�����ݣ�������A��B��+��-�е�ĳһ�����м��ÿո�ֿ���
A��B��ֻ����һ�Ρ�

���
Ҫ�����һ����������ʾ̹�˴�A����B���������ƶ�������
���û�з����������-1

��������
5
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

�������
10
*/
public class CrossingMinefields {

	// ս��
	static class Position {
		int x; // ����x
		int y; // ����y
		int step; // �Ѿ��߹��Ĳ���

		// �յĹ��캯��
		public Position() {

		}

		// ���캯��
		public Position(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

	static int n; // ��ͼ��СΪn * n
	static char[][] map; // ��ͼ
	static int[][] check; // ��ͼ(����߹���·)

	public static void main(String[] args) {
		Position root = new Position(); // ��ʼλ��(���ڵ�)

		// ��ͼ��ʼ��
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new char[n][n];
		check = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = scanner.next().charAt(0);
				if (map[i][j] == 'A') {
					root = new Position(i, j, 0); // ��λ��ʼλ��
				}
			}
		}
		scanner.close();

		// ����
		Queue<Position> queue = new LinkedList<Position>();
		queue.add(root); // �������Ӹ��ڵ�

		// ��ʼ����BFS, ֻҪ���в�Ϊ��, ��һֱ����
		while (!queue.isEmpty()) {
			Position newPosition = queue.remove();
			int positionX;
			int positionY;

			// �ĸ���������
			// ��
			positionX = newPosition.x - 1;
			positionY = newPosition.y;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}

			// ��
			positionX = newPosition.x + 1;
			positionY = newPosition.y;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}

			// ��
			positionX = newPosition.x;
			positionY = newPosition.y - 1;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}
			// ��
			positionX = newPosition.x;
			positionY = newPosition.y + 1;
			if (check(queue, newPosition, positionX, positionY)) {
				return;
			}
		}

		System.out.println(-1); // ���ȫ���ڵ��������û���ҵ������յ�ķ���, ���-1
	}

	// ����Ƿ���������
	public static boolean check(Queue<Position> queue, Position newPosition, int positionX, int positionY) {

		// ����Ƿ�������������
		if (0 <= positionX && positionX < n && 0 <= positionY && positionY < n && check[positionX][positionY] == 0) {

			// ������������������Ƿ���
			if (map[newPosition.x][newPosition.y] != map[positionX][positionY]) {
				check[positionX][positionY] = 1; // ����߹���·
				if (map[positionX][positionY] == 'B') { // ����Ƿ񵽴��յ�
					System.out.println(newPosition.step + 1);
					return true;
				}

				// ���û�е����յ�, �����������ӽڵ�
				queue.add(new Position(positionX, positionY, newPosition.step + 1));
			}
		}

		return false;
	}
}
