package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class TooLongOfPath {
	static class TreeNode {
		public String value;
		public ArrayList<TreeNode> kids;
		public TreeNode parent;
	}
	
	static int N;
	static TreeNode root;		//���ڵ�

	public static void create() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();			//·����󳤶�����
		int M = sc.nextInt();		//������Ҫ���������
		sc.nextLine();				//��ȡһ������

		String str = sc.nextLine();		//��ȡ��һ��, �̷�
		root = new TreeNode();			//���ڵ�Ϊ�̷�
		root.value = str;

		TreeNode cpRoot = root;			//��һ�����ڵ㸱��
		int cRDepth = 0;

		for (int i = 1; i <= M; i++) {
			String input = sc.nextLine();
			int pathStartIdx = 0;
			for (pathStartIdx = 0; pathStartIdx < input.length(); pathStartIdx++) {
				if (input.charAt(pathStartIdx) != '-') {
					break;
				}
			}
			int depth = pathStartIdx;
			String path = input.substring(depth);

			if (depth > cRDepth) {
				TreeNode temp = new TreeNode();
				temp.value = path;
				temp.parent = cpRoot;

				if (cpRoot.kids == null) {
					cpRoot.kids = new ArrayList<TreeNode>();
				}
				cpRoot.kids.add(temp);

				cpRoot = temp;
				cRDepth++;
			} else {
				int targetDepth = depth - 1;
				while (cRDepth != targetDepth) {
					cpRoot = cpRoot.parent;
					cRDepth--;
				}

				TreeNode temp = new TreeNode();
				temp.value = path;
				temp.parent = cpRoot;

				if (cpRoot.kids == null) {
					cpRoot.kids = new ArrayList<TreeNode>();
				}
				cpRoot.kids.add(temp);

				cpRoot = temp;
				cRDepth++;
			}
		}
		sc.close();
	}

	static void printPath(int depth, ArrayList<String> arr) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i <= depth; i++) {
			sBuilder.append(arr.get(i));
			if (i != depth) {
				sBuilder.append('\\');
			}
		}
		if (sBuilder.length() > N) {
			System.out.println(sBuilder);
		}
	}

	static void printNode(TreeNode node, int depth, ArrayList<String> arr) {
		arr.add(depth, node.value);
		if (node.kids == null || node.kids.isEmpty()) {
			printPath(depth, arr);
			return;
		}
		for (int i = 0; i < node.kids.size(); i++) {
			TreeNode next = node.kids.get(i);
			printNode(next, depth + 1, arr);
		}
	}

	public static void print() {
		ArrayList<String> arr = new ArrayList<String>();
		printNode(root, 0, arr);
	}

	public static void main(String[] args) {
		create();
		print();
		return;
	}
}
