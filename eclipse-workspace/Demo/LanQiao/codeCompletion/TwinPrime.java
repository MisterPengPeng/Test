package codeCompletion;



/*
��ν��������ָ�ľ��Ǽ��Ϊ 2 ����������������֮��ľ����Ѿ����ò����ٽ��ˣ����������ֵ�һ����

��С������������ (3, 5)���� 100 ���ڵ������������� (5, 7), (11, 13), (17, 19), (29, 31), (41, 43), (59, 61) �� (71, 73)���ܼ��� 8 �顣

�����������ֵ��������������ķֲ����Խ��Խϡ�裬Ѱ����������Ҳ���Խ��Խ���ѡ���ô�᲻���ڳ���ĳ������֮�����Ҳ�����������������أ�

���������������ԣ�������뱻��Ϊ�����������룬����û�б��ϸ�֤�����������ڼ��������ȷʵ�����ҵ����������Χ�ڵ��������������ԡ�

����Ĵ��������������n���ڣ�����n�����������������Եĸ��������磬��n=100��ʱ�򣬸÷�������8���Բ�ȫȱ�ٵĴ��롣

����յĴ𰸣�����մ��Ĵ𰸣����������棩���뿼���ļ����¶�Ӧ��ŵġ����.txt���м��ɡ�

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
