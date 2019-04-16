package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/*
** ѧ�Ե��Թ� **

��������
����ѧ�������˴�ҵ���ҵ���೤Ϊ�˰�ͬѧ���һ���ҵ������ȥ��ѧ�Ծ�������ѧ��Ϊ�˲�Ҫ���˴��ţ�
ס��һ���Ǳ���Ǳ�������һ����ά�ĸ����Թ���Ҫ���Ǳ��������ͨ���Թ�����Ϊ�೤��������Ҫ�㣬ĥ�����󿳲񹦣�
��Ϊ�˽�Լʱ�䣬����������㵽���Թ��ĵ�ͼ��׼����ǰ������̵�·�ߡ������������������ӽ���������飬���Ǿ�ί���������һ����̵�·�ߡ�
�����ʽ
������һ����������n�� m��Ϊ�Թ��ĳ���
����������n�У�ÿ��m��������֮��û�м����Ϊ0��1�е�һ����0��ʾ������ӿ���ͨ����1��ʾ�����ԡ�
�����������Ѿ����Թ�����(1,1)�ĵط��������Ͻǣ��Թ��ĳ�����(n,m)��ÿ���ƶ�ʱֻ������������4�������ƶ�������һ������ͨ���ĸ����
ÿ���ƶ���һ�������ݱ�֤(1,1)��(n,m)����ͨ����
�����ʽ
������һ��һ����Ϊ��Ҫ�����ٲ���K��
�����ڶ���K���ַ���ÿ���ַ���{U,D,L,R},�ֱ��ʾ�������ҡ�����ж���������ͬ�����·����ѡ���ڴ˱�ʾ�������ֵ�����С��һ����
��������1
3 3
001
100
110
�������1
4
RDRD
��������2
3 3
000
000
000
�������2
4
DDRR
���ݹ�ģ��Լ��
������20%���������㣺1<=n,m<=10
������50%���������㣺1<=n,m<=50
������100%���������㣺1<=n,m<=500��
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
			
			//��
			nodeN = node.n - 1;
			nodeM = node.m;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "U"));
			}
			
			//��
			nodeN = node.n + 1;
			nodeM = node.m;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "D"));
			}
			
			//��
			nodeN = node.n;
			nodeM = node.m - 1;
			if (0 <= nodeN && nodeN < n 
					&& 0 <= nodeM && nodeM < m 
					&& !check[nodeN][nodeM] 
					&& map[nodeN][nodeM] - '0' == 0) {
				check[nodeN][nodeM] = true;
				queue.add(new Node(nodeN, nodeM, node.step + 1, node.state + "L"));
			}
			
			//��
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
