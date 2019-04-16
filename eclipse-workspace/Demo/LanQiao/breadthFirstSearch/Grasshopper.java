package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

/*
 *	   4  5
 *   3     6
 *  2       7
 *   1     8
 *      ?
** 跳蚱蜢 ** 2016年蓝桥杯省赛A组C/C++ 第二题
如图所示： 有9只盘子，排成1个圆圈。 其中8只盘子内装着8只蚱蜢，有一个是空盘。 我们把这些蚱蜢顺时针编号为 1~8
每只蚱蜢都可以跳到相邻的空盘中， 也可以再用点力，越过一个相邻的蚱蜢跳到空盘中。
请你计算一下，如果要使得蚱蜢们的队形改为按照逆时针排列， 
并且保持空盘的位置不变（也就是1-8换位，2-7换位,…），至少要经过多少次跳跃？
注意：要求提交的是一个整数，请不要填写任何多余内容或说明文字。*/
public class Grasshopper {
	
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
		long startTime = System.currentTimeMillis();
		String string = "?12345678";
		String endStr = "?87654321";
		Node node = new Node(string, 0);
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		check.add(string);
		
		while (!queue.isEmpty()) {
			Node newNode = queue.remove();
			
			if (newNode.str.equals(endStr)) {
				System.out.println(newNode.step);
				long endTime = System.currentTimeMillis();
				long time = endTime - startTime;
				System.out.println(time);
				return;
			}
			
			int markPosition = findQuestionMark(newNode.str);
			
			//问号左边的数
			for (int i = markPosition - 2; i < markPosition; i++) {
				int temp = (9 + i) % 9;
				
				String nextString = swap(newNode.str, markPosition, temp);
				if (check.add(nextString)) {
					queue.add(new Node(nextString, newNode.step + 1));
				}
			}
			
			//问号右边的数
			for (int i = markPosition + 1; i <= markPosition + 2; i++) {
				int temp = i % 9;
				
				String nextString = swap(newNode.str, markPosition, temp);
				if (check.add(nextString)) {
					queue.add(new Node(nextString, newNode.step + 1));
				}
			}
		}
		
		System.out.println(-1);
	}
	
	//交换问号与蚱蜢的位置
	public static String swap(String string, int markPosition, int grasshopperPosition) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.setCharAt(markPosition, stringBuilder.charAt(grasshopperPosition));
		stringBuilder.setCharAt(grasshopperPosition, '?');
		return stringBuilder.toString();
	}
	
	//寻找问号的位置
	public static int findQuestionMark(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '?') {
				return i;
			}
		}
		
		return -1;
	}
}
