package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/*
** 学霸的迷宫 **

问题描述
　　学霸抢走了大家的作业，班长为了帮同学们找回作业，决定去找学霸决斗。但学霸为了不要别人打扰，
住在一个城堡里，城堡外面是一个二维的格子迷宫，要进城堡必须得先通过迷宫。因为班长还有妹子要陪，磨刀不误砍柴功，
他为了节约时间，从线人那里搞到了迷宫的地图，准备提前计算最短的路线。可是他现在正向妹子解释这件事情，于是就委托你帮他找一条最短的路线。
输入格式
　　第一行两个整数n， m，为迷宫的长宽。
　　接下来n行，每行m个数，数之间没有间隔，为0或1中的一个。0表示这个格子可以通过，1表示不可以。
假设你现在已经在迷宫坐标(1,1)的地方，即左上角，迷宫的出口在(n,m)。每次移动时只能向上下左右4个方向移动到另外一个可以通过的格子里，
每次移动算一步。数据保证(1,1)，(n,m)可以通过。
输出格式
　　第一行一个数为需要的最少步数K。
　　第二行K个字符，每个字符∈{U,D,L,R},分别表示上下左右。如果有多条长度相同的最短路径，选择在此表示方法下字典序最小的一个。
样例输入1
3 3
001
100
110
样例输出1
4
RDRD
样例输入2
3 3
000
000
000
样例输出2
4
DDRR
数据规模和约定
　　有20%的数据满足：1<=n,m<=10
　　有50%的数据满足：1<=n,m<=50
　　有100%的数据满足：1<=n,m<=500。
*/
public class SuperScholar {
	
	static class Node implements Comparable<Node>{
		int n;
		int m;
		int step;
		String state;
		
		public Node(int n, int m, int step, String state) {
			this.n = n;
			this.m = m;
			this.step = step;
			this.state = state;
		}

		@Override
		public int compareTo(Node o) {
			return this.state.compareTo(o.state);
		}
	}
	
	static TreeSet<Node> answerSort = new TreeSet<Node>();
	static char[][] map;
	static boolean[][] check;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int n = scanner.nextInt();
		final int m = scanner.nextInt();
		map = new char[n][m];
		check = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			map[i] = scanner.next().substring(0, m).toCharArray();
		}
		
		scanner.close();
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(0, 0, 0, ""));
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			int nodeN;
			int nodeM;
			
			if (node.n == n - 1 && node.m == m - 1) {
				answerSort.add(node);
			}
			
			//上
			nodeN = node.n - 1;
			nodeM = node.m;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "U"));
			}
			
			//下
			nodeN = node.n + 1;
			nodeM = node.m;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "D"));
			}
			
			//左
			nodeN = node.n;
			nodeM = node.m - 1;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "L"));
			}
			
			//右
			nodeN = node.n;
			nodeM = node.m + 1;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state += "R"));
			}
		}
		
		int step = answerSort.first().step;
		String state = answerSort.first().state;
		System.out.println(step);
		System.out.println(state);
	}
}
