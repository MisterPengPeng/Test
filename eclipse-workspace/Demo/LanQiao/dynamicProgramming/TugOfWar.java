package dynamicProgramming;

import java.util.Scanner;

/*
superwyh��ѧУҪ���аκӱ�����Ϊ������ǰ������ң���ʦ�����Ѱ��������˷�Ϊ���飬���аκӱ���,Ϊ�˱�������һ����ʵ����ǿ��ʦ���������������ֶ��飬
��������������������ز����٣���Ϊ��ʦ�Խ��û��Ȥ������ֻ������ʦ��С�����ز��Ƕ��پ����ˡ�����ܿ����۵�����ͽ���superwyh�ˣ���Ϊ������superwyh�ĺ󱳼��sjh�ֶ����ˣ�
����ֻ��superwyh����ȥ����ÿ���˵����أ����ǽ���֪��������Ȼ����ȷ��������η�����飬���λoier����superwyh�������⡣
�����ʽ��
��һ��Ϊ����(1<=n<=100)���ӵڶ��п�ʼ��ÿ���˵�����(0<=m<=100)��
�����ʽ��
��С���ز
�������룺
4
10
23
41
12
���������
4
*/
public class TugOfWar {
	static int[] weight = new int[101];
	static int[] f = new int[1001];
	static int totalWeight = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfPeople = scanner.nextInt();
		for (int i = 0; i < numOfPeople; i++) {
			weight[i] = scanner.nextInt();
			totalWeight += weight[i];
		}
		
		scanner.close();
		
		for (int i = 0; i < numOfPeople; i++) {
			for (int j = totalWeight/2; j >= weight[i]; j--) {
				if (f[j] <= f[j - weight[i]] + weight[i]) {
					f[j] = f[j - weight[i]] + weight[i];
				}
			}
		}
		System.out.println(totalWeight - f[totalWeight / 2] * 2);
	}
}
