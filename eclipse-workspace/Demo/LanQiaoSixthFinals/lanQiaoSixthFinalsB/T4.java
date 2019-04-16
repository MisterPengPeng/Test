package lanQiaoSixthFinalsB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T4 {
	
	static class Tank {
		int x;
		int y;
		int step;
		
		public Tank(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
		
		public Tank() {
			
		}
	}
	
	static int n;
	static int[][] map;
	static boolean[][] book;
	static int posAX;
	static int posAY;
	static int posBX;
	static int posBY;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		map = new int[n][n];
		book = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				char temp = in.next().charAt(0);
				if (temp == 'A') {
					posAX = i;
					posAY = j;
					book[i][j] = true;
				} else if (temp == 'B') {
					posBX = i;
					posBY = j;
				}
				map[i][j] = (temp == 'A' ? -1 : temp == 'B' ? -1 : temp == '+' ? 1 : 2);
			}
		}
		
		in.close();
		
		Queue<Tank> queue = new LinkedList<>();
		queue.add(new Tank(posAX, posAY, 0));
		
		while (!queue.isEmpty()) {
			Tank currentTank = queue.remove();
			int currentX = currentTank.x;
			int currentY = currentTank.y;
			
			if (currentX == posBX && currentY == posBY) {
				System.out.println(currentTank.step);
				return;
			}
			
			int nextX;
			int nextY;
			
			//up
			nextX = currentX - 1;
			nextY = currentY;
			if (nextX >= 0 && !book[nextX][nextY]
					&& map[currentX][currentY] != map[nextX][nextY]) {
				book[nextX][nextY] = true;
				queue.add(new Tank(nextX, nextY, currentTank.step + 1));
			}
			
			//down
			nextX = currentX + 1;
			nextY = currentY;
			if (nextX < n && !book[nextX][nextY]
					&& map[currentX][currentY] != map[nextX][nextY]) {
				book[nextX][nextY] = true;
				queue.add(new Tank(nextX, nextY, currentTank.step + 1));
			}
			
			//left
			nextX = currentX;
			nextY = currentY - 1;
			if (nextY >= 0 && !book[nextX][nextY]
					&& map[currentX][currentY] != map[nextX][nextY]) {
				book[nextX][nextY] = true;
				queue.add(new Tank(nextX, nextY, currentTank.step + 1));
			}
			
			//right
			nextX = currentX;
			nextY = currentY + 1;
			if (nextY < n && !book[nextX][nextY]
					&& map[currentX][currentY] != map[nextX][nextY]) {
				book[nextX][nextY] = true;
				queue.add(new Tank(nextX, nextY, currentTank.step + 1));
			}
		}
		
		
		System.out.println(-1);
	}
}
