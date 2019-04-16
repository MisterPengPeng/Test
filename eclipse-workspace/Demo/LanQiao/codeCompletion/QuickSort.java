package codeCompletion;



/*
��������

�����ڸ��ֳ��Ͼ������õ���
����������ʮ�ֳ��õĸ�Ч�ʵ��㷨��

��˼���ǣ���ѡһ������ߡ���
�������������й�һ��ɸ�ӣ�
�Ա�֤������ߵ�Ԫ�ض��������������ұߵ�Ԫ�ض���С������

��������������ͱ��ָ�Ϊ���������䡣
�ٷֱ������������Ϳ����ˡ�

����Ĵ�����һ��ʵ�֣����������д���߲���ȱ�ٵĴ��롣

public class Main {
	public static void main(String[] args) {
		int i;
		int a[] = {5,13,6,24,2,8,19,27,6,12,1,17};
		int N = 12;
		
		quicksort(a, 0, N-1);
		
		for(i=0; i<N; i++) System.out.println(a[i] + " ");
		System.out.println();
	}
	
	static void swap(int a[], int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	static int partition(int a[], int p, int r)
	{
	    int i = p;
	    int j = r + 1;
	    int x = a[p];
	    while(true){
	        while(i<r && a[++i]<x);
	        while(a[--j]>x);
	        if(i>=j) break;
	        swap(a,i,j);
	    }
		______________________;
	    return j;
	}

	static void quicksort(int a[], int p, int r)
	{
	    if(p<r){
	        int q = partition(a,p,r);
	        quicksort(a,p,q-1);
	        quicksort(a,q+1,r);
	    }
	}

}
*/
public class QuickSort {
	public static void main(String[] args) {
		int i;
		int a[] = {5, 13, 6, 24, 2, 8, 19, 27, 6, 12, 1, 17};
		int N = 12;
		
		quicksort(a, 0, N - 1);
		
		for(i = 0; i < N; i++) System.out.println(a[i] + " ");
		System.out.println();
	}
	
	static void swap(int a[], int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	static int partition(int a[], int p, int r) {
	    int i = p;
	    int j = r + 1;
	    int x = a[p];
	    while (true) {
	        while (i < r && a[++i] < x);
	        while (a[--j] > x);
	        if (i >= j) break;
	        swap(a, i, j);
	    }
		swap(a, p, j);
	    return j;
	}

	static void quicksort(int a[], int p, int r)
	{
	    if(p < r){
	        int q = partition(a, p, r);
	        quicksort(a, p, q-1);
	        quicksort(a, q+1, r);
	    }
	}
}