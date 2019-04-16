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
** ������ ** 2016�����ű�ʡ��A��C/C++ �ڶ���
��ͼ��ʾ�� ��9ֻ���ӣ��ų�1��ԲȦ�� ����8ֻ������װ��8ֻ���죬��һ���ǿ��̡� ���ǰ���Щ����˳ʱ����Ϊ 1~8
ÿֻ���춼�����������ڵĿ����У� Ҳ�������õ�����Խ��һ�����ڵ��������������С�
�������һ�£����Ҫʹ�������ǵĶ��θ�Ϊ������ʱ�����У� 
���ұ��ֿ��̵�λ�ò��䣨Ҳ����1-8��λ��2-7��λ,����������Ҫ�������ٴ���Ծ��
ע�⣺Ҫ���ύ����һ���������벻Ҫ��д�κζ������ݻ�˵�����֡�*/
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
			
			//�ʺ���ߵ���
			for (int i = markPosition - 2; i < markPosition; i++) {
				int temp = (9 + i) % 9;
				
				String nextString = swap(newNode.str, markPosition, temp);
				if (check.add(nextString)) {
					queue.add(new Node(nextString, newNode.step + 1));
				}
			}
			
			//�ʺ��ұߵ���
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
	
	//�����ʺ��������λ��
	public static String swap(String string, int markPosition, int grasshopperPosition) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.setCharAt(markPosition, stringBuilder.charAt(grasshopperPosition));
		stringBuilder.setCharAt(grasshopperPosition, '?');
		return stringBuilder.toString();
	}
	
	//Ѱ���ʺŵ�λ��
	public static int findQuestionMark(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '?') {
				return i;
			}
		}
		
		return -1;
	}
}
