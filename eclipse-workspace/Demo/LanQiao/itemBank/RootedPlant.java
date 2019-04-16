package itemBank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RootedPlant {
	
	static int m;		//���ӵ�����
	static int n;		//���ӵ�����
	static int k;		//��������k������, ÿ��������a, b�������Ϊa�ĸ��Ӻͱ��Ϊb�ĸ������ֲ��ϸ���
	static int[] result;		//��֮��Ĺ�ϵ
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		m = in.nextInt();
		n = in.nextInt();
		k = in.nextInt();
		result = new int[m * n];
		for (int i = 0; i < m * n; i++) {
			result[i] = i;
		}
		
		int a;
		int b;
		for (int i = 0; i < k; i++) {
			a = in.nextInt() - 1;
			b = in.nextInt() - 1;
			u(a, b);
		}
		
		in.close();
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < m * n; i++) {
			set.add(f(i));
		}
		
		System.out.println(set.size());
	}

	private static int f(int i) {
		if (result[i] == i) {
			return i;
		}
		
		return result[i] = f(result[i]);
	}

	private static void u(int a, int b) {
		int tA = f(a);
		int tB = f(b);
		if (tA == tB) {
			return;
		}
		
		result[tA] = tB;
	}
}