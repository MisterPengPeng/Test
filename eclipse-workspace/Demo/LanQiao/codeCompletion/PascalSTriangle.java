package codeCompletion;



/*
���⣺ �������
�������Ҳ����˹�����ǣ��ںܶ�������ϵ�п��Կ�����ʮ����Ҫ��
��0�У�           1
��1�У�          1 1
��2�У�         1 2 1
��3�У�        1 3 3 1
��4�У�       1 4 6 4 1
		1 5 10 10 5 1
		1 6 15 20 15 6 1
....
���ߵ�Ԫ�ض���1�� �м��Ԫ�������Ͻǵ�Ԫ�������Ͻǵ�Ԫ�غ͡�
����Լ�����кţ��кŶ���0������
���ԣ� ��6�еĵ�2��Ԫ����15����3��Ԫ����20
ֱ�۵ؿ�����Ҫ����һ����ά���飬��ʵһά����Ҳ����ʤ�Ρ�
���³��������һά���顰��Ų���Ľⷨ��
public class A
{
	// ��������εĵ�row�е�col��
	static long f(int row, int col){
		if(row<2) return 1;
		if(col==0) return 1;
		if(col==row) return 1;
		long[] a = new long[row+1];
		a[0]=1;
		a[1]=1;
		int p = 2;
		while(p<=row){
			a[p] = 1;
			for( __________________ ) a[q] = a[q] + a[q-1];
			p++;
		}
		return a[col];
	}
	public static void main(String[] args){
		System.out.println(f(6,2));
		System.out.println(f(6,3));		
	}
}
����ϸ����Դ�룬����ɻ��߲���ȱ�ٵĴ��롣
ע�⣺ֻ�ύȱ�ٵĴ��룬��Ҫ�ύ���еĴ���ͷ��š�Ҳ��Ҫ�ύ˵�������֡�
*/
public class PascalSTriangle {
	// ��������εĵ�row�е�col��
	static long f(int row, int col) {
			if (row < 2) return 1;
			if (col == 0) return 1;
			if (col == row) return 1;
			long[] a = new long[row + 1];
			a[0] = 1;
			a[1] = 1;
			int p = 2;
			while (p <= row) {
				a[p] = 1;
				for(int q = p - 1; q > 0; q--) a[q] = a[q] + a[q-1];
				p++;
			}
			return a[col];
		}

	public static void main(String[] args) {
		System.out.println(f(6, 2));
		System.out.println(f(6, 3));
	}
}