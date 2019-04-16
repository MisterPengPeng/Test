package resultFillInTheBlanksExercise;



/*
���⣺ֽ��������
A,2,3,4,5,6,7,8,9 ��9��ֽ���ų�һ���������Σ�A��1���㣩��Ҫ��ÿ���ߵĺ���ȡ�
��ͼ����һ���ŷ������ж������⣬�ο�p1.png����
      A
     9 6
    4   8
   3 7 5 2
�������ŷ����ܻ��кܶࡣ
���������ת���������ͬ����ͬһ�֣�һ���ж����ֲ�ͬ���ŷ��أ�
������㲢�ύ�����֡�
ע�⣺��Ҫ�ύ����һ����������Ҫ�ύ�κζ������ݡ�
---------------------------
�����л�˵��
    �о����Ա����ƽ�Ŷ��
    �鷳���ǣ���ÿ���ŷ���Ҫ���������ת�������ŷ���������û�к���ʷ�ظ���
�����л�˵��
    �˼��ֲ�����������������ӡ������ֻ��Ҫ����������
    ����ÿ���������棬ͨ����ת����������������¾�����Ŀ���ǹ̶�����
*/
public class CardTriangle {
	static boolean[] book = new boolean[10];
	static int[] answer = new int[9];
	static int counter = 0;
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(counter / 6);
	}
	
	public static void dfs(int index) {
		if (index == 9) {
			if (check()) {
				counter++;
			}
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			if (!book[i]) {
				book[i] = true;
				answer[index] = i;
				dfs(index + 1);
				book[i] = false;
			}
		}
	}
	
	public static boolean check() {
		int a = answer[0] + answer[1] + answer[3] + answer[5];
		int b = answer[0] + answer[2] + answer[4] + answer[8];
		int c = answer[5] + answer[6] + answer[7] + answer[8];
		if (a == b && b == c) {
			return true;
		}
		return false;
	}
}
