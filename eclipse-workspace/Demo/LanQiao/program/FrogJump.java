package program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/*
���⣺����������
    X��������г��������ܣ�һ����������ɫ����ɫ�ͺ�ɫ��
    X����ľ���ϲ�������Ƿ���һ�Ų豭��������Թ۲�����������ȥ��
    ����ͼ����һ�ű��ӣ���ߵ�һ���ǿ��ŵģ��ұߵı��ӣ�ÿ�������һֻ���ܡ�
*WWWBBB
    ���У�W��ĸ��ʾ��ɫ���ܣ�B��ʾ��ɫ���ܣ�*��ʾ�ձ��ӡ�
    X�ǵ����ܺ���Щ�ã�����ֻ��3������֮һ��
    1. �������ڵĿձ����
    2. ����1ֻ���������ܣ����ʲô��ɫ�������ձ����
    3. ����2ֻ���������ܣ����ʲô��ɫ�������ձ����
    ������ͼ�ľ��棬ֻҪ1�����Ϳ�������ͼ���棺
WWW*BBB
��������������֪��ʼ���棬ѯ��������Ҫ����������������һ��Ŀ����档
����Ϊ2�У�2��������ʾ��ʼ�����Ŀ����档
���Ҫ��Ϊһ����������ʾ������Ҫ���ٲ�����������
���磺
���룺
*WWBB
WWBB*
�����Ӧ�������
2
�����磬
���룺
WWW*BBB
BBB*WWW
�����Ӧ�������
10
����Լ��������Ĵ��ĳ��Ȳ�����15
��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms
���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�
���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��
----------------------------
�����л�˵��
    ���μ��Լ���һ�ô�����
    ������Ծ��
    �Ҿͷ����µ�֦����
    ��������ǵ� 5 �����֦,
    Ŷ��������֦��Ҷï��
*/
public class FrogJump {
	static class Frog {
		String state;
		int step;

		public Frog(String state, int step) {
			this.state = state;
			this.step = step;
		}

		public Frog(String state) {
			this.state = state;
		}

		public Frog(int step) {
			this.step = step;
		}

		public Frog() {

		}
	}

	static Frog root = new Frog(0);
	TreeSet<String> book = new TreeSet<String>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		root.state = scanner.next();
//		String destination = scanner.next();
		
		scanner.close();
		
		Queue<Frog> queue = new LinkedList<Frog>();
		queue.add(root);
		while (!queue.isEmpty()) {
			
		}
	}
	
}
