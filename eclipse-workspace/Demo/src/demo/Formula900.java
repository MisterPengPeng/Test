package demo;

/*
** ��ʽ900 ** 2017��C�������

С������ҵ�����е�˼���⣺���������ʽ��
 
  (��������-��������)*����=900
 
  ���е�С�������0~9�����֣���10������պð�����0~9�е��������֡�
  ע�⣺0������Ϊĳ�����ֵ���λ��
 
С�����������Ŭ�������������˴𰸣����£�
(5012-4987)*36=900
 
�ü���������󣬷��ֻ�������һ���⣬�����������ǣ���������������һ���⡣
 
ע�⣺�ύ�ĸ�ʽ��Ҫ��ʾ���ϸ�һ�£�
      ���ż�������Ų�Ҫ���������뷨��
      ������ʽ�в��ܰ����ո�
*/
public class Formula900 {
	static int[] answer = new int[10];
	static int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static boolean[] used = new boolean[10];

	public static void main(String[] args) {
		Dfs(0);
	}

	public static void Dfs(int temp) {
		if (temp == 10) {
			if (answer[0] != 0 && answer[4] != 0 && answer[8] != 0) {
				int a = answer[0] * 1000 + answer[1] * 100 + answer[2] * 10 + answer[3];
				int b = answer[4] * 1000 + answer[5] * 100 + answer[6] * 10 + answer[7];
				int c = answer[8] * 10 + answer[9];
				if ((a - b) * c == 900) {
					System.out.println("(" + a + "-" + b + ")" + "*" + c + "=" + 900);
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (used[i] == false) {
				answer[temp] = num[i];
				used[i] = true;
				Dfs(temp + 1);
				used[i] = false;
			}
		}
	}
}
