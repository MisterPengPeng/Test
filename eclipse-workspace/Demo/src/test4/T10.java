package test4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class T10 {
	static class Node {
		String state;
		int step;
		int dotPos;

		public Node(String state, int step, int dotPos) {
			this.state = state;
			this.step = step;
			this.dotPos = dotPos;
		}

		public Node() {

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String source = in.next();
		String destination = in.next();

		in.close();

		int dotPos = 0;
		for (int i = 0; i < source.length(); i++) {
			if (source.charAt(i) == '.') {
				dotPos = i;
			}
		}

		TreeSet<String> book = new TreeSet<String>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(source, 0, dotPos));
		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			int currentDotPos = temp.dotPos;
			String currentState = temp.state;

			if (currentState.equals(destination)) {
				System.out.println(temp.step);
				return;
			}

			String nextState;
			if (0 <= currentDotPos && currentDotPos <= 2) {
				if (currentDotPos == 0) {
					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}

					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}
				} else if (currentDotPos == 2) {
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}
				} else {
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}
				}
			}
			
			if (3 <= currentDotPos && currentDotPos <= 5) {
				if (currentDotPos == 3) {
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}

					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}

					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}
				} else if (currentDotPos == 5) {
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}

					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
				} else {
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}

					nextState = swap(currentState, currentDotPos, currentDotPos + 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 3));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}
				}
				
			}
			
			if (6 <= currentDotPos && currentDotPos <= 8) {
				if (currentDotPos == 6) {
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}
				} else if (currentDotPos == 8) {
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
				} else {
					nextState = swap(currentState, currentDotPos, currentDotPos + 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos + 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos - 1);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 1));
					}
					
					nextState = swap(currentState, currentDotPos, currentDotPos - 3);
					if (book.add(nextState)) {
						queue.add(new Node(nextState, temp.step + 1, currentDotPos - 3));
					}
				}
			}
		}
		System.out.println(-1);
	}

	public static String swap(String parameter, int index1, int index2) {
		StringBuilder temp = new StringBuilder(parameter);
		temp.setCharAt(index1, parameter.charAt(index2));
		temp.setCharAt(index2, parameter.charAt(index1));
		return temp.toString();
	}
}
