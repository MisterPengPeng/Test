package codeCompletion;

import java.util.Scanner;

/*
�ܶ��˶���������Ϸ�������������һ�����֣������¡�ÿ��һ�����֣��ױ���������ǲ´��ˣ���С�ˣ����Ǹպò����ˡ����еĴ���ģ����������̡�
�����û��䵱�׵Ľ�ɫ��������䵱�ҵĽ�ɫ��Ϊ���ܸ���ز��У������ʹ���˶��ַ���
�Ķ��������룬��дȱʧ�Ĳ��֡�


����յĴ𰸣�����մ��Ĵ𰸣����������棩���뿼���ļ����¶�Ӧ��ŵġ����.txt���м��ɡ�


System.out.println("�����������һ�����֣�1~100����������");
System.out.println("��ÿ��һ�����֣���Ҫ�������ǡ��´��ˡ�������С�ˡ������ǡ����С�");
Scanner scan = new Scanner(System.in);
int v1 = 1;
int v2 = 100;
for(;;)
{
int m = (v1 + v2)/2;
System.out.println("�Ҳ��ǣ�" + m);
System.out.println("1.�µ�̫����");
System.out.println("2.�µ�̫С��");
System.out.println("3.���У�");
System.out.print("��ѡ��");
int user = Integer.parseInt(scan.nextLine());
if(user==3) break;
if(user==1) _____________;
if(user==2) _____________;

}
*/
public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("�����������һ�����֣�1~100����������");
		System.out.println("��ÿ��һ�����֣���Ҫ�������ǡ��´��ˡ�������С�ˡ������ǡ����С�");
		Scanner scan = new Scanner(System.in);
		int v1 = 1;
		int v2 = 100;
		for (;;) {
			int m = (v1 + v2) / 2;
			System.out.println("�Ҳ��ǣ�" + m);
			System.out.println("1.�µ�̫����");
			System.out.println("2.�µ�̫С��");
			System.out.println("3.���У�");
			System.out.print("��ѡ��");
			int user = Integer.parseInt(scan.nextLine());
			if(user==3) break;
			if(user==1)	v2 = m - 1;
			if(user==2)	v1 = m + 1;
		}
		scan.close();
	}
}
