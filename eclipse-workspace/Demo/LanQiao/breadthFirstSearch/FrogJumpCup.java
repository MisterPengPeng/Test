package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/*
** ����������  **

��������
����X��������г��������ܣ�һ����������ɫ����ɫ�ͺ�ɫ��
����X����ľ���ϲ�������Ƿ���һ�Ų豭��������Թ۲�����������ȥ��
��������ͼ����һ�ű��ӣ���ߵ�һ���ǿ��ŵģ��ұߵı��ӣ�ÿ�������һֻ���ܡ�
����*WWWBBB
�������У�W��ĸ��ʾ��ɫ���ܣ�B��ʾ��ɫ���ܣ�*��ʾ�ձ��ӡ�
����X�ǵ����ܺ���Щ�ã�����ֻ��3������֮һ��
����1. �������ڵĿձ����
����2. ����1ֻ���������ܣ����ʲô��ɫ�������ձ����
����3. ����2ֻ���������ܣ����ʲô��ɫ�������ձ����
����������ͼ�ľ��棬ֻҪ1�����Ϳ�������ͼ���棺
����WWW*BBB
������������������֪��ʼ���棬ѯ��������Ҫ����������������һ��Ŀ����档
��������Ϊ2�У�2��������ʾ��ʼ�����Ŀ����档
�������Ҫ��Ϊһ����������ʾ������Ҫ���ٲ�����������
	��������
 	*WWBB
	WWBB*
	�������
	2
	��������
	WWW*BBB
	BBB*WWW
	�������
	10
���ݹ�ģ��Լ��
��������Լ��������Ĵ��ĳ��Ȳ�����15
������ԴԼ����
������ֵ�ڴ����ģ���������� < 256M
����CPU���� < 1000ms
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
			
			//�ձ�����ߵ�����
			for (int i = Math.max(starPosition - 3, 0); i < starPosition; i++) {
				String nextStr = swap(newNode.str, starPosition, i);
				if (check.add(nextStr)) {
					queue.add(new Node(nextStr, newNode.step + 1));
				}
			}
			
			//�ձ����ұߵ�����
			for (int i = starPosition + 1; i <= Math.min(starPosition + 3, newNode.str.length() - 1); i++) {
				String nextStr = swap(newNode.str, starPosition, i);
				if (check.add(nextStr)) {
					queue.add(new Node(nextStr, newNode.step + 1));
				}
			}
		}
	}
	
	//Ѱ���Ǻŵ�λ��
	public static int findStarPosition(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '*') {
				return i;
			}
		}
		return -1;
	}
	
	//�����Ǻź͵�ǰ���ܵ�λ��
	public static String swap(String string, int starPosition, int frogPosition) {
		StringBuilder stringBuilder = new StringBuilder(string);
		
		stringBuilder.setCharAt(starPosition, stringBuilder.charAt(frogPosition));
		stringBuilder.setCharAt(frogPosition, '*');
		
		return stringBuilder.toString();
	}
	
}
