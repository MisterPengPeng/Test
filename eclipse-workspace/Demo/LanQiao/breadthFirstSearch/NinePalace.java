package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class NinePalace {
	static class Node {
		int data;
		int step;
		int dotPos;
		
		public Node(int data, int step, int dotPos) {
			super();
			this.data = data;
			this.step = step;
			this.dotPos = dotPos;
		}
	}
	
	static int[] devider = new int[9];
	static TreeSet<Integer> book = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		devider[8] = 1;
		for (int i = 7; i >= 0; i--) {
			devider[i] = devider[i + 1] * 10;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String sourceStr = scanner.next();
		String destinationStr = scanner.next();
		
		scanner.close();
		
		int sourceInt = 0;
		int destinationInt = 0;
		int firstDotPosition = 0;
		for (int i = 0; i < 9; i++) {
			char charOfSource = sourceStr.charAt(i);
			char charOfDestination = destinationStr.charAt(i);
			if (charOfSource == '.') {
				firstDotPosition = i;
			}
			sourceInt = sourceInt * 10 + changeToInt(charOfSource);
			destinationInt = destinationInt * 10 + changeToInt(charOfDestination);
		}
		
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(sourceInt, 0, firstDotPosition));
		book.add(sourceInt);
		
		while (!queue.isEmpty()) {
			Node currentNode = queue.remove();
			int currentDotI = currentNode.dotPos / 3;
			int currentIntJ = currentNode.dotPos % 3;
			
			if (currentNode.data == destinationInt) {
				System.out.println(currentNode.step);
				return;
			}
			
			int nextI = 0;
			int nextJ = 0;
			
			//ио
			nextI = currentDotI - 1;
			nextJ = currentIntJ;
			if (0 <= nextI && nextI < 3 && 0 <= nextJ && nextJ < 3) {
				int nextDotPos = nextI * 3 + nextJ;
				int nextData = swap(currentNode.data, currentNode.dotPos, nextDotPos);
				if (book.add(nextData)) {
					queue.add(new Node(nextData, currentNode.step + 1, nextDotPos));
				}
			}
			
			//об
			nextI = currentDotI + 1;
			nextJ = currentIntJ;
			if (0 <= nextI && nextI < 3 && 0 <= nextJ && nextJ < 3) {
				int nextDotPos = nextI * 3 + nextJ;
				int nextData = swap(currentNode.data, currentNode.dotPos, nextDotPos);
				if (book.add(nextData)) {
					queue.add(new Node(nextData, currentNode.step + 1, nextDotPos));
				}
			}
			
			//вС
			nextI = currentDotI;
			nextJ = currentIntJ - 1;
			if (0 <= nextI && nextI < 3 && 0 <= nextJ && nextJ < 3) {
				int nextDotPos = nextI * 3 + nextJ;
				int nextData = swap(currentNode.data, currentNode.dotPos, nextDotPos);
				if (book.add(nextData)) {
					queue.add(new Node(nextData, currentNode.step + 1, nextDotPos));
				}
			}
			
			//ср
			nextI = currentDotI;
			nextJ = currentIntJ + 1;
			if (0 <= nextI && nextI < 3 && 0 <= nextJ && nextJ < 3) {
				int nextDotPos = nextI * 3 + nextJ;
				int nextData = swap(currentNode.data, currentNode.dotPos, nextDotPos);
				if (book.add(nextData)) {
					queue.add(new Node(nextData, currentNode.step + 1, nextDotPos));
				}
			}
		}
		
		System.out.println(-1);
	}
	
	public static int changeToInt(char c) {
		if (c == '.') {
			return 9;
		} else {
			return c - '0';
		}
	}
	
	public static int swap(int data, int currentdotPos, int nextDotPos) {
		int currentfactor = (data / devider[currentdotPos]) % 10;
		int factorNext = (data / devider[nextDotPos]) % 10;
		data -= (currentfactor * devider[currentdotPos] + factorNext * devider[nextDotPos]);
		data += (currentfactor * devider[nextDotPos] + factorNext * devider[currentdotPos]);
		return data;
	}
}
