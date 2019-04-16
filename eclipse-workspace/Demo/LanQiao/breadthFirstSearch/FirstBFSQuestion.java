package breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
** ���������������**
������һ����Ϸ��
��ҳ�ʼ��10������ֵ��Ҫ����һ���Թ������Թ�Ϊ���ͣ������ɸ�������ɡ�
ÿ������ֻ��1����ڣ���n��n >=0 �������ڣ�ÿ�����ڶ�����һ���µķ��䡣
��ҽ��뷿��󣬽��ܵ������Ӱ�����ӻ��������ֵ��
�������ֵ<=0������������Ϸ���������ѡ��һ�����ڣ�������һ�����䡣�����߻�ͷ·��

���Թ���ͼ��ͼ��ʾ���Թ����Ϊ1�����ⷿ�䣬����Ӱ���������ֵ��
��������������ٽ��뼸�����䣨�������Թ���ڣ��ͻ���Ϸ������
*/
public class FirstBFSQuestion {
	static class TreeNode {
		int data;
		ArrayList<TreeNode> kids;
		public TreeNode(int data) {
			this.data = data;
			kids = new ArrayList<TreeNode>();
		}
	}
	
	static TreeNode root;
	
	static void create() {
		TreeNode t0_0 = new TreeNode(0);
		TreeNode t1_0 = new TreeNode(-9);
		TreeNode t1_1 = new TreeNode(-2);
		TreeNode t1_2 = new TreeNode(3);
		TreeNode t2_0 = new TreeNode(1);
		TreeNode t2_1 = new TreeNode(2);
		TreeNode t2_2 = new TreeNode(-3);
		TreeNode t2_3 = new TreeNode(-2);
		TreeNode t2_4 = new TreeNode(-14);
		TreeNode t2_5 = new TreeNode(3);
		TreeNode t3_0 = new TreeNode(-5);
		TreeNode t3_1 = new TreeNode(-2);
		TreeNode t3_2 = new TreeNode(-1);
		TreeNode t3_3 = new TreeNode(-1);
		TreeNode t3_4 = new TreeNode(-2);
		TreeNode t3_5 = new TreeNode(-10);
		TreeNode t3_6 = new TreeNode(20);
		TreeNode t3_7 = new TreeNode(-10);
		
		t0_0.kids.add(t1_0);
		t0_0.kids.add(t1_1);
		t0_0.kids.add(t1_2);
		t1_0.kids.add(t2_0);
		t1_0.kids.add(t2_1);
		t1_1.kids.add(t2_2);
		t1_1.kids.add(t2_3);
		t1_2.kids.add(t2_4);
		t1_2.kids.add(t2_5);
		t2_0.kids.add(t3_0);
		t2_0.kids.add(t3_1);
		t2_1.kids.add(t3_2);
		t2_2.kids.add(t3_3);
		t2_2.kids.add(t3_4);
		t2_4.kids.add(t3_5);
		t2_4.kids.add(t3_6);
		t2_5.kids.add(t3_7);
		
		root = t0_0;
	}
	
	static class BFSUnit {
		TreeNode node;
		int line;
		int HP;
		public BFSUnit(TreeNode node, int line, int HP) {
			this.node = node;
			this.line = line;
			this.HP = HP;
		}
	}
	
	static Queue<BFSUnit> queue = new LinkedList<BFSUnit>();
	static void print() {
		queue.add(new BFSUnit(root, 0, 10));
		while (!queue.isEmpty()) {
			BFSUnit bfsUnit = queue.remove();
			TreeNode node = bfsUnit.node;
			int HP = bfsUnit.HP + node.data;
			if (HP <= 0) {
				System.out.println(bfsUnit.line);
				return;
			}
			for (int i = 0; i < node.kids.size(); i++) {
				queue.add(new BFSUnit(node.kids.get(i), bfsUnit.line + 1, HP));
			}
		}
	}
	
	public static void main(String[] args) {
		create();
		print();
	}
}
