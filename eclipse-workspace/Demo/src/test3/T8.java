package test3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T8 {
	
	static class Car {
		int x;
		int y;
		int state;
		int step;
		
		public Car(int x, int y, int state, int step) {
			this.x = x;
			this.y = y;
			this.state = state;
			this.step = step;
		}
		
		public Car() {
			
		}
	}
	
	static int n;
	static int[][] map;
	static boolean[][] book;
	
	//'A' = 8, 'B' = 9, '+' = 1, '-' = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];
		book = new boolean[n][n];
		int Ax = 0;
		int Ay = 0;
		int Bx = 0;
		int By = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				char temp = sc.next().charAt(0);
				if (temp == 'A') {
					Ax = i;
					Ay = j;
				} else if (temp == 'B') {
					Bx = i;
					By = j;
				}
				map[i][j] = temp == 'A' ? 8 : temp == 'B' ? 9 : temp == '+' ? 1 : 0;
			}
		}
		
		sc.close();
		
		Queue<Car> queue = new LinkedList<Car>();
		queue.add(new Car(Ax, Ay, -1, 0));
		
		while (!queue.isEmpty()) {
			Car currentCar = queue.remove();
			int x = currentCar.x;
			int y = currentCar.y;
			int state = currentCar.state;
			int step = currentCar.step;
			
			if (x == Bx && y == By) {
				System.out.println(step);
				return;
			}
			
			//up
			if (x - 1 >= 0 && !book[x - 1][y] && map[x - 1][y] != state) {
				book[x - 1][y] = true;
				queue.add(new Car(x - 1, y, map[x - 1][y], step + 1));
			}
			
			//down
			if (x + 1 < n && !book[x + 1][y] && map[x + 1][y] != state) {
				book[x + 1][y] = true;
				queue.add(new Car(x + 1, y, map[x + 1][y], step + 1));
			}
			
			//left
			if (y - 1 >= 0 && !book[x][y - 1] && map[x][y - 1] != state) {
				book[x][y - 1] = true;
				queue.add(new Car(x, y - 1, map[x][y - 1], step + 1));
			}
			
			//right
			if (y + 1 < n && !book[x][y + 1] && map[x][y + 1] != state) {
				book[x][y + 1] = true;
				queue.add(new Car(x, y + 1, map[x][y + 1], step + 1));
			}
		}
		
		System.out.println(-1);
	}
}
