package demo;


/*
** ֽ�������� ** 2017��C�������

A,2,3,4,5,6,7,8,9 ��9��ֽ���ų�һ���������Σ�A��1���㣩��Ҫ��ÿ���ߵĺ���ȡ� 
��ͼ����һ���ŷ���
    A					1
   9 6				   2 3
  4   8				  4   5
 3 7 5 2			 6 7 8 9
�������ŷ����ܻ��кܶࡣ
���������ת���������ͬ����ͬһ�֣�һ���ж����ֲ�ͬ���ŷ��أ�

������㲢�ύ�����֡�
ע�⣺��Ҫ�ύ����һ����������Ҫ�ύ�κζ������ݡ�
*/
public class CardTriangle {
	
	static int[] card = new int[15];
	static boolean[] judge = new boolean[15];
	static int sum = 0;
	
	public static void Dfs(int step) {
		if (step == 10 && card[1] + card[2] + card[4] + card[6] == card[1] + card[3] + card[5] + card[9] &&
				card[1] + card[2] + card[4] + card[6] == card[6] + card[7] + card[8] + card[9]) {
			sum++;
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if (judge[i] == false) {
				judge[i] = true;
				card[step] = i;
				Dfs(step + 1);
				judge[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Dfs(1);
		System.out.println(sum / 3 / 2);
	}
}
