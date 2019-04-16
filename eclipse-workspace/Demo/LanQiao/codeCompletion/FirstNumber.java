package codeCompletion;



/*
以下的静态方法实现了：把串s中第�?个出现的数字的�?�返回�??
如果找不到数字，返回-1


例如�?
s = "abc24us43"  则返�?2
s = "82445adb5"  则返�?8
s = "ab"   则返�?-1   


public static int getFirstNum(String s)
{
if(s==null || s.length()==0) return -1;

char c = s.charAt(0);
if(c>='0' && c<='9') return _____________;  //填空

return ___________________;  //填空
}

请分析代码�?�辑，并推测划线处的代码�?

答案写在 “解�?.txt�? 文件�?

注意：只写划线处应该填的内容，划线前后的内容不要抄写
*/
public class FirstNumber {
	public static void main(String[] args) {
		String s = "abc24us43";
		String a = "82445adb5";
		String q = "ab";
		System.out.println(getFirstNum(s));
		System.out.println(getFirstNum(a));
		System.out.println(getFirstNum(q));
	}
	
	public static int getFirstNum(String s) {
		if (s == null || s.length() == 0) return -1;
		
		char c = s.charAt(0);
		if (c >= '0' && c <= '9') return c - '0';
		
		return getFirstNum(s.substring(1));
	}
}
