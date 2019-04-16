package codeCompletion;



/*
若干不同的数字，排列组合后能产生多少个平方数�?
下面的代码解决了这个问题�?
对于�?1,6,9
排列后，可产�?3个平方数�?
169
196
961

请阅读下面的代码，填写缺失的部分（下划线部分）�??

注意：请把填空的答案（仅填空处的答案，不包括题面）存入�?�生文件夹下对应题号的�?�解�?.txt”中即可�?
直接写在题面中不能得分�??

public class My
{
public static void f(int[] a, int n)
{
if(n==a.length-1)
{
int k = 0;
for(int i=0; i<a.length; i++) k = ____________ + a[i];   // 填空1
int m = (int)(Math.sqrt(k)+0.5);
if(m*m==k)
{
System.out.println(k);
}
return;
}

for(int i=n; i<a.length; i++)
{
int t = a[n];
a[n] = a[i];
a[i] = t;

f(a, _______________);        // 填空2

t = a[n];
a[n] = a[i];
a[i] = t;
}
}

public static void main(String[] args)
{
int[] a = {1,9,6};	
f(a, 0);
}

}
*/
public class PermutationSquareNumbers {
	public static void f(int[] a, int n) {
		if(n == a.length - 1) {
			int k = 0;
			for(int i = 0; i < a.length; i++) k = k * 10 + a[i];		// 填空1
			int m = (int)(Math.sqrt(k) + 0.5);
			if(m * m == k) {
				System.out.println(k);
			}
			return;
		}

		for(int i = n; i < a.length; i++) {
			int t = a[n];
			a[n] = a[i];
			a[i] = t;

			f(a, n + 1);			// 填空2

			t = a[n];
			a[n] = a[i];
			a[i] = t;
		}
	}

	public static void main(String[] args) {
		int[] a = {1,9,6};
		f(a, 0);
	}
}
