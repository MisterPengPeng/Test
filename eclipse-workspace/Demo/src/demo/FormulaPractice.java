package demo;


/*
3. ��ʽ900
С������ҵ�����е�˼���⣺���������ʽ��

  (��������-��������)*����=900

  ���е�С�������0~9�����֣���10������պð�����0~9�е��������֡�
  ע�⣺0������Ϊĳ�����ֵ���λ��

С�����������Ŭ�������������˴𰸣����£�
(5012-4987)*36=900
�ü���������󣬷��ֻ�������һ���⣬�����������ǣ���������������һ���⡣

*/
public class FormulaPractice {
	
	static int[] answer = new int[10];
	static int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static boolean[] book = new boolean[10];
	
	public static void main(String[] args) {
		Dfs(0);
	}
	
	public static void Dfs(int time) {
		if (time == 10 && answer[0] != 0 && answer[4] != 0 && answer[8] != 0) {
			int firstPart = answer[0] * 1000 + answer[1] * 100 + answer[2] * 10 + answer[3];
			int secondPart = answer[4] * 1000 + answer[5] * 100 + answer[6] * 10 + answer[7];
			int thirdPart = answer[8] * 10 + answer[9];
			
			if ((firstPart - secondPart) * thirdPart == 900) {
				System.out.println("(" + firstPart + "-" + secondPart + ")* " + thirdPart + "=900");
				return;
			}
		}
		
		for (int j = 0; j < num.length; j++) {
			if (!book[j]) {
				answer[time] = num[j];
				book[j] = true;
				Dfs(time + 1);
				book[j] = false;
			}
		}
	}
}
