package codeCompletion;



/*
���ǰѡ�cba����Ϊ��abc���ķ�ת����
��һ�����ķ�ת���ķ����ܶࡣ����������е�һ�ַ���������ʮ�ּ�ࣨ������Щ���أ������������ͨ��������һ�����������ȱ�ٵĴ��롣


����յĴ𰸣�����մ��Ĵ𰸣����������棩���뿼���ļ��¶�Ӧ��ŵġ����.txt���м��ɡ�


public static String reverseString(String x)
{
if(x==null || x.length()<2) return x;
return ____________________ + x.charAt(0);

}
*/
public class ReverseStr {
	public static void main(String[] args) {
		String string = "123456";
		System.out.println(reverseString(string));
	}
	
	public static String reverseString(String x) {
		if (x == null || x.length() < 2) return x;
		return reverseString(x.substring(1)) + x.charAt(0);
	}
}
