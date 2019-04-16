package codeCompletion;



/*
所谓孪生素数指的就是间隔为 2 的相邻素数，它们之间的距离已经近得不能再近了，就象孪生兄弟一样。

最小的孪生素数是 (3, 5)，在 100 以内的孪生素数还有 (5, 7), (11, 13), (17, 19), (29, 31), (41, 43), (59, 61) 和 (71, 73)，总计有 8 组。

但是随着数字的增大，孪生素数的分布变得越来越稀疏，寻找孪生素数也变得越来越困难。那么会不会在超过某个界限之后就再也不存在孪生素数了呢？

孪生素数有无穷多对！这个猜想被称为孪生素数猜想，至今没有被严格证明。但借助于计算机我们确实可以找到任意大数范围内的所有孪生素数对。

下面的代码求出了正整数n以内（不含n）的所有孪生素数对的个数。比如，当n=100的时候，该方法返回8。试补全缺少的代码。

把填空的答案（仅填空处的答案，不包括题面）存入考生文件夹下对应题号的“解答.txt”中即可。

public static boolean isPrime(int x)
{
for(int i=2; i<=x/2; i++)
{
if(x%i==0) _____________;
}
return true;
}

public static int twinPrimeNum(int n)
{
int sum = 0;
for(int i=2; i<n; i++)
{
if(isPrime(i) && ___________) sum++;
}

return sum;
}
*/
public class TwinPrime {
	public static void main(String[] args) {
		System.out.println(twinPrimeNum(100));
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) return false;
		}
		return true;
	}

	public static int twinPrimeNum(int n) {
		int sum = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i) && isPrime(i + 2) && i + 2 < n) sum++;
		}
		return sum;
	}
}
