package codeCompletion;



/*
���д������н��Ϊ��

12345
23456
89
23456789
����һ���������ֲ�������λ�öϿ���������֮��


String s = "12345234568923456789";
String t = "1";
for(int i=1; i<s.length(); i++)
{
if(s.charAt(i)==s.charAt(i-1)+1)
{
t += s.charAt(i);
}	
else
{
System.out.println(t);
_____________________________;
}	
}

System.out.println(t);

�����

12345
23456
89
23456789
*/
public class DisconnectionAtDiscontinuity {
	public static void main(String[] args) {
		String s = "12345234568923456789";
		String t = "1";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1) + 1) {
				t += s.charAt(i);
			} else {
				System.out.println(t);
				t = s.charAt(i) + "";
			}
		}
		
		System.out.println(t);
	}
}
