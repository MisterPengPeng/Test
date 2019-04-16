package demo;


/*
** ����⣺����ʽ **


     B      DEF
A + --- + ------- = 10
     C      GHI
   	 
	 
�����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�

���磺
6+8/3+952/714 ����һ�ֽⷨ��
5+3/1+972/486 ����һ�ֽⷨ��

�����ʽһ���ж����ֽⷨ��
*/
public class Formula {
	
	static int counter = 0;
	static int[] value = new int[9];
	static boolean[] judge = new boolean[9];
	
	public static void main(String[] args) {
		for (int i = 0 ; i < judge.length; i++) {
			judge[i] = false;
		}
		dfs(0);
		System.out.println(counter);
	}
	
	public static void dfs(int position) {
		for (int i = 1; i <= judge.length; i++) {
			if (judge[i - 1] == false) {
				value[position] = i;
				if (position < 8) {
					judge[i - 1] = true;
					dfs(position + 1);
					judge[i - 1] = false;
				} else {
					Check();
				}
			}
		}
	}
	
	public static void Check() {
		float temp = (float)value[0] + (float)value[1] / value[2] +
				(float)(value[3] * 100 + value[4] * 10 + value[5]) / (value[6] * 100 + value[7] * 10 + value[8]);
		if (Math.abs(10 - temp) < 1e-4) {
			counter++;
		}
	}
}