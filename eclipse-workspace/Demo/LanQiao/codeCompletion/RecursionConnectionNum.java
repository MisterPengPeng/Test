package codeCompletion;



/*
���³����ӡ��0~9�����֣��벹��ȱ�ٵĴ��롣


public class MyTest
{
public static void f(int begin, int end)
{
__________________;
System.out.println(begin);
f(begin+1, end);	
}
public static void main(String[] args)
{
f(0,9);
}

}
*/
public class RecursionConnectionNum {
	public static void main(String[] args) {
		f(0, 9);
	}
	
	public static void f(int begin, int end) {
		if (begin > end) {
			return;
		}
		System.out.println(begin);
		f(begin + 1, end);
	}
}
