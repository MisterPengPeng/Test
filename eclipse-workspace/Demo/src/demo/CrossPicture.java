package demo;

import java.util.ArrayList;
import java.util.Scanner;


/*
��ӡʮ��ͼ

..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..


�Է�ͬʱҲ��Ҫ�ڵ���dos���������ַ�����ʽ����ñ�־������������Ʋ�����
�����ʽ
һ�������� n (n<30) ��ʾҪ���ӡͼ�εĲ�����
�����ʽ
��Ӧ��Χ�����ĸñ�־��
��������1
1
�������1
..$$$$$..
..$...$..
$$$.$.$$$
$...$...$
$.$$$$$.$
$...$...$
$$$.$.$$$
..$...$..
..$$$$$..

��������2
3
�������2
..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..

��ʾ
����ϸ�۲�����������Ҫע��������������λ�á�
*/

public class CrossPicture {
	public static void main(String[] args) {
		ArrayList<StringBuilder> dollarPicture = new ArrayList<StringBuilder>();
		dollarPicture.add(new StringBuilder("..$.."));
		dollarPicture.add(new StringBuilder("..$.."));
		dollarPicture.add(new StringBuilder("$$$$$"));
		dollarPicture.add(new StringBuilder("..$.."));
		dollarPicture.add(new StringBuilder("..$.."));
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < input; i++) {
			increase(dollarPicture);
		}
		
		for (StringBuilder stringBuilder : dollarPicture) {
			System.out.println(stringBuilder);
		}
	}
	
	public static void increase(ArrayList<StringBuilder> dollarPicture) {
		//�Ľǵ����Ԫ��
		StringBuilder s0 = dollarPicture.get(0);
		StringBuilder sLast = dollarPicture.get(dollarPicture.size() - 1);
		
		s0.setCharAt(0, '$');
		s0.setCharAt(s0.length() - 1, '$');
		sLast.setCharAt(0, '$');
		sLast.setCharAt(sLast.length() - 1, '$');
		//���������s0 �� sLast ����
//		dollarPicture.get(0).setCharAt(0, '$');
//		dollarPicture.get(0).setCharAt(dollarPicture.get(0).length() - 1, '$');
//		dollarPicture.get(dollarPicture.size() - 1).setCharAt(0, '$');
//		dollarPicture.get(dollarPicture.size() - 1).setCharAt(dollarPicture.get(dollarPicture.size() - 1).length() - 1, '$');
		
		//�����������
		int count = dollarPicture.get(0).length() + 4;
		dollarPicture.add(0, new StringBuilder());
		dollarPicture.add(0, new StringBuilder());
		dollarPicture.add(new StringBuilder());
		dollarPicture.add(new StringBuilder());
		
		//�������������ӵĿ���
		BianJie(dollarPicture.get(0), '$', count);
		BianJie(dollarPicture.get(1), '.', count);
		BianJie(dollarPicture.get(dollarPicture.size() - 1), '$', count);
		BianJie(dollarPicture.get(dollarPicture.size() - 2), '.', count);
		
		//�ĸ��ǵ����
		JiaoLuo(dollarPicture.get(2));
		JiaoLuo(dollarPicture.get(dollarPicture.size() - 3));
		
		//���岿�����
		for (int i = 3; i < dollarPicture.size() - 3; i++) {
			ZhuTi(dollarPicture.get(i));
		}
	}
	
	public static void BianJie(StringBuilder s, char c, int count) {
		s.append("..$");
		for (int i = 0; i < count - 6; i++) {
			s.append(c);
		}
		s.append("$..");
	}
	
	public static void JiaoLuo(StringBuilder s) {
		s.insert(0, "$$");
		s.append("$$");
	}
	
	public static void ZhuTi(StringBuilder s) {
		s.insert(0, "$.");
		s.append(".$");
	}
}
