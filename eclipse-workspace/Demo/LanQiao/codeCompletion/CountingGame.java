package codeCompletion;

import java.util.Vector;

/*
1.������Ϸ


��n������վ��һȦ���ӵ�һ�����ӿ�ʼ˳ʱ�뷽����������3���˳��У���һ���˼�����1������ֱ�����ʣ��һ������Ϊֹ��
��ʣ�µڼ������ӡ�����ĳ�����10������Ϊ����ģ����������̣�������֮����ʾ�������Ĺ��̱���֮�߼��ȼ۵ĸ����ײ����Ĺ��������棩��


Vector a = new Vector();
for(int i=1; i<=10; i++)
{
a.add("��" + i + "������");
}
for(;;)
{
if(a.size()==1) break;
for(int k=0; k<2; k++)
________________;
a.remove(0);
}
System.out.println(a);
*/
public class CountingGame {
	public static void main(String[] args) {
		Vector<String> a = new Vector<String>();
		for (int i = 1; i <= 10; i++) {
			a.add("��" + i + "������");
		}
		for (;;) {
			if (a.size() == 1) {
				break;
			}
			for (int k = 0; k < 2; k++) {
				a.add(a.remove(0));
			}
			a.remove(0);
		}
		System.out.println(a);
	}
}
