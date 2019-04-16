package resultFillInTheBlanksExercise;



/*
����ʽ
     B      DEF
A + --- + ------- = 10
     C      GHI
�������ʾ�����⣬���Բμ���ͼ1.jpg����
�����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�
���磺
6+8/3+952/714 ����һ�ֽⷨ��
5+3/1+972/486 ����һ�ֽⷨ��
�����ʽһ���ж����ֽⷨ��
ע�⣺���ύӦ���Ǹ���������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class FormulaB {
	
	static int counter = 0;
	static boolean[] book = new boolean[10];
	static int[] answer = new int[9];
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(counter);
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
		double a = answer[0];
		double b = (answer[1] * 1.0) / (answer[2] * 1.0);
		double c = ((answer[3] * 100 + answer[4] * 10 + answer[5]) * 1.0) / ((answer[6] * 100 + answer[7] * 10 + answer[8]) * 1.0);
		if (a + b + c == 10) {
			return true;
		}
		return false;
	}
}
