package codeCompletion;

import java.math.BigInteger;

/*
为什�?1小时�?60分钟，�?�不�?100分钟呢？这是历史上的习惯导致�?
但也并非纯粹的偶然：60是个优秀的数字，它的因子比较多�??
事实上，它是1�?6的每个数字的倍数。即1,2,3,4,5,6都是可以除尽60�?


我们希望寻找到能除尽1至n的的每个数字的最小整数�??


不要小看这个数字，它可能十分大，比如n=100, 则该数为�?
69720375229712477164533808935312303556800


为此，有必要使用BigInteger来记录这样的大数�?


请阅读下面的代码，填写缺失的部分（下划线部分）�??


注意：请把填空的答案（仅填空处的答案，不包括题面）存入�?�生文件夹下对应题号的�?�解�?.txt”中即可�?
直接写在题面中不能得分�??

import java.math.BigInteger;
public class My1
{
// 求能除尽1~n 每个数字的最小整�?
public static BigInteger f(int n)
{
int[] x = new int[n+1];

for(int i=1; i<=n; i++) x[i] = i;

for(int i=2; i<n; i++)
{
for(int j=i+1; j<=n; j++)
{
if(x[j] % x[i]==0) _______________;   // 填空1
}
}

BigInteger m = BigInteger.ONE;
for(int i=2; i<=n; i++)
{
m = m.multiply(__________________));   // 填空2
}

return m;

}

public static void main(String[] args)
{
System.out.println(f(30));	
}

}
*/
public class CommonMultiple {
	public static BigInteger f(int n) {
		int[] x = new int[n + 1];
		
		for (int i = 1; i <= n; i++) x[i] = i;
		
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (x[j] % x[i] == 0) x[j] /= x[i];
			}
		}
		
		BigInteger m = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			m = m.multiply(BigInteger.valueOf(x[i]));
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		System.out.println(f(100));
	}
}
