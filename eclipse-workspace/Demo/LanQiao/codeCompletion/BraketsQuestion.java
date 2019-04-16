package codeCompletion;

import java.util.Stack;

/*
下面的代码用于判断一个串中的括号是否匹配
�?谓匹配是指不同类型的括号必须左右呼应，可以相互包含，但不能交�?


例如�?
..(..[..]..)..  是允许的
..(...[...)....].... 是禁止的 
对于 main 方法中的测试用例，应该输出：
false
true
false
false


import java.util.*;
public class A22
{
public static boolean isGoodBracket(String s)
{
Stack<Character> a = new Stack<Character>();

for(int i=0; i<s.length(); i++)
{
char c = s.charAt(i);
if(c=='(') a.push(')');
if(c=='[') a.push(']');
if(c=='{') a.push('}');

if(c==')' || c==']' || c=='}')
{
if(____________________) return false;    // 填空
if(a.pop() != c) return false;
}
}

if(___________________) return false;  // 填空

return true;
}

public static void main(String[] args)
{
System.out.println( isGoodBracket("...(..[.)..].{.(..).}..."));
System.out.println( isGoodBracket("...(..[...].(.).){.(..).}..."));
System.out.println( isGoodBracket(".....[...].(.).){.(..).}..."));
System.out.println( isGoodBracket("...(..[...].(.).){.(..)...."));
}
}
请分析代码�?�辑，并推测划线处的代码�?
答案写在 “解�?.txt�? 文件�?
注意：只写划线处应该填的内容，划线前后的内容不要抄写�?
*/
public class BraketsQuestion {
	public static boolean isGoodBracket(String s) {
		Stack<Character> a = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') a.push(')');
			if (c == '[') a.push(']');
			if (c == '{') a.push('}');
			
			if (c == ')' || c==']' || c=='}') {
				if (a.empty()) return false;
				if (a.pop() != c) return false;
			}
		}
		
		if (!a.empty()) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isGoodBracket("...(..[.)..].{.(..).}..."));
		System.out.println(isGoodBracket("...(..[...].(.).){.(..).}..."));
		System.out.println(isGoodBracket(".....[...].(.).){.(..).}..."));
		System.out.println(isGoodBracket("...(..[...].(.).){.(..)...."));
	}
}
