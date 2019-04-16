package breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AirConditioningMachineryTowDimensional {
	
	static class Map {
		int mapX;
		int mapY;
		int entranceX;
		int entranceY;
		int exitX;
		int exitY;
		String entranceDirection;
		String exitDirection;
	}
	
	static int[][] map;
	static ArrayList<Map> maps = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			Map map = new Map();
			int firstInt = scanner.nextInt();
			if (firstInt == 0) {
				break;
			}
			map.mapX = firstInt;
			map.mapY = scanner.nextInt();
			map.entranceX = scanner.nextInt();
			map.entranceY = scanner.nextInt();
			map.entranceDirection = scanner.next();
			map.exitX = scanner.nextInt();
			map.exitY = scanner.nextInt();
			map.exitDirection = scanner.next();
			maps.add(map);
		}
		
		scanner.close();
		
		Queue<Map> queue = new LinkedList<Map>();
		while (!maps.isEmpty()) {
			queue.add(maps.remove(0));
			map = new int[queue.peek().mapY][queue.peek().mapX];
			
			while (!queue.isEmpty()) {
				
			}
		}
	}
}
