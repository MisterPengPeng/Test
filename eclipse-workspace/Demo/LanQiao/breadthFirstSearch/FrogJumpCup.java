package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/*
** 青蛙跳杯子  **

问题描述
　　X星球的流行宠物是青蛙，一般有两种颜色：白色和黑色。
　　X星球的居民喜欢把它们放在一排茶杯里，这样可以观察它们跳来跳去。
　　如下图，有一排杯子，左边的一个是空着的，右边的杯子，每个里边有一只青蛙。
　　*WWWBBB
　　其中，W字母表示白色青蛙，B表示黑色青蛙，*表示空杯子。
　　X星的青蛙很有些癖好，它们只做3个动作之一：
　　1. 跳到相邻的空杯子里。
　　2. 隔着1只其它的青蛙（随便什么颜色）跳到空杯子里。
　　3. 隔着2只其它的青蛙（随便什么颜色）跳到空杯子里。
　　对于上图的局面，只要1步，就可跳成下图局面：
　　WWW*BBB
　　本题的任务就是已知初始局面，询问至少需要几步，才能跳成另一个目标局面。
　　输入为2行，2个串，表示初始局面和目标局面。
　　输出要求为一个整数，表示至少需要多少步的青蛙跳。
	样例输入
 	*WWBB
	WWBB*
	样例输出
	2
	样例输入
	WWW*BBB
	BBB*WWW
	样例输出
	10
数据规模和约定
　　我们约定，输入的串的长度不超过15
　　资源约定：
　　峰值内存消耗（含虚拟机） < 256M
　　CPU消耗 < 1000ms
*/
public class FrogJumpCup {
	
	static class Node {
		String str;
		int step;
		
		public Node(String str, int step) {
			this.str = str;
			this.step = step;
		}
	}
	
	static TreeSet<String> check = new TreeSet<String>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String startStr = scanner.next();
		String endStr = scanner.next();
		
		scanner.close();
		
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(startStr, 0));
		check.add(startStr);
		
		while (!queue.isEmpty()) {
			Node newNode = queue.remove();

			if (newNode.str.equals(endStr)) {
				System.out.println(newNode.step);
				return;
			}
			
			int starPosition = findStarPosition(newNode.str);
			
			//空杯子左边的青蛙
			for (int i = Math.max(starPosition - 3, 0); i < starPosition; i++) {
				String nextStr = swap(newNode.str, starPosition, i);
				if (check.add(nextStr)) {
					queue.add(new Node(nextStr, newNode.step + 1));
				}
			}
			
			//空杯子右边的青蛙
			for (int i = starPosition + 1; i <= Math.min(starPosition + 3, newNode.str.length() - 1); i++) {
				String nextStr = swap(newNode.str, starPosition, i);
				if (check.add(nextStr)) {
					queue.add(new Node(nextStr, newNode.step + 1));
				}
			}
		}
	}
	
	//寻找星号的位置
	public static int findStarPosition(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '*') {
				return i;
			}
		}
		return -1;
	}
	
	//交换星号和当前青蛙的位置
	public static String swap(String string, int starPosition, int frogPosition) {
		StringBuilder stringBuilder = new StringBuilder(string);
		
		stringBuilder.setCharAt(starPosition, stringBuilder.charAt(frogPosition));
		stringBuilder.setCharAt(frogPosition, '*');
		
		return stringBuilder.toString();
	}
	
}
