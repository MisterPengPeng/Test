package demo;

import java.util.Scanner;

/*
import java.util.Scanner;
public class �������� {
	static int result=0;//������
	static int a[];
	static int length;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		length=in.nextInt()+1;
		a=new int[length];
		int num=in.nextInt();//�������
		
		for(int i=0;i<num;i++){
			int temp=in.nextInt();
			if(temp<length-1)
			a[temp]=1;
		}
		
		dfs(1);
		System.out.println(result);
 	}

	private static void dfs(int i) {//i��ʾ��ǰλ��
		if (i==length-1) {
			result++;
		}
		if (i>=length) {
			return;
		}
		if (a[i]==1) {
			return;		//��ǰλ��Ϊ����
		}
		dfs(i+1);
		dfs(i+2);
	}
}
*/

/*
** �������� **

��Ŀ����
��Ҷ�֪��" ��������" ��һ����������Ծ��̽�ռң��������ֺ�Ϸ����Ծ������һ��ֻ����ǰ��һ����������
��һ�Σ���Ҫ����һ����Ϊn����С����С������m�����壬��Щ���嶼λ������λ�ã��ֱ���a1,a2,....am������������������ɡ�
��Ȼ��������������ŵ����壬���������������Ҳ������ȥ�ġ� 
���ڸ���С���ĳ���n������ĸ�����λ�á����������λ��1��ʼ���ж�������Ծ�����ܵ���ʤ���ı˰�������λ��n���� 

���ݹ�ģ��Լ�� 
40 >= n >= 3, m >= 1 
n > m; 
���岻��λ��1��n�� 

����
��һ��Ϊ��������n,m 
�ڶ���Ϊm����������ʾ�����λ�� 

���
һ����������ʾ��������n�ķ����� 

��������
4  1 
2 

�������
1
*/
public class SuperMarie {
	static int result = 0;
	static int a[];
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt() + 1;
		a = new int[n];
		int num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
			int temp = in.nextInt();
			if (temp < n - 1) {
				a[temp] = 1;
			}
		}
		in.close();
	}
}