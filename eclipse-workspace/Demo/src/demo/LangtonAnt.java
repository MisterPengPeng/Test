package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
** �������� **

��������

�������ϣ�����1986�꣬�ɿ���˹������������ģ�����ϸ���Զ�����һ�֡�

ƽ���ϵ������θ��ӱ����Ϻ�ɫ���ɫ��������һ������������һֻ�����ϡ���

���ϵ�ͷ������Ϊ��������������һ����

���ϵ��ƶ�����ʮ�ּ򵥣�
�������ںڸ���ת90�ȣ����ø��Ϊ�׸񣬲���ǰ��һ��
�������ڰ׸���ת90�ȣ����ø��Ϊ�ڸ񣬲���ǰ��һ��

������Ȼ�򵥣����ϵ���Ϊȴʮ�ָ��ӡ��ոտ�ʼʱ���µ�·�߶����нӽ��Գƣ����ǻ��ظ�����������ʼ״̬��Σ����Ͼ��������Ļ��һ�󣬻Ὺ�ٳ�һ������ġ����ٹ�·����
���ϵ�·���Ǻ�������Ԥ��ġ�
��������Ǹ��ݳ�ʼ״̬���ü����ģ�����������ڵ�n�����ߺ�������λ�á�


�����ʽ
�����������ݵĵ�һ���� m n ����������3 < m, n < 100������ʾ�����θ��ӵ�������������
������������ m �����ݡ�
����ÿ������Ϊ n �����ո�ֿ������֡�0 ��ʾ�׸�1 ��ʾ�ڸ�

������������һ�����ݣ�x y s k, ����x yΪ��������ʾ���������кź��кţ��кŴ��ϵ����������кŴ��������������Ǵ�0��ʼ��ţ���s ��һ����д��ĸ����ʾ����ͷ�ĳ�������Լ�����������ҷֱ��ã�UDLR��ʾ��k ��ʾ�����ߵĲ�����

�����ʽ
�����������Ϊ�����ո�ֿ������� p q, �ֱ��ʾ������k�����������ӵ��кź��кš�

��������
5 6
0 0 0 0 0 0
0 0 0 0 0 0
0 0 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
2 3 L 5

�������
1 3

��������
3 3
0 0 0
1 1 1
1 1 1
1 1 U 6

�������
0 0
*/
public class LangtonAnt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//����������������
		int inputLine = scanner.nextInt();
		int inputColumn = scanner.nextInt();
		
		//����0, 1����, 0��ʾ�׸�, 1��ʾ�ڸ�
		//�������ںڸ�,��ת90��,���ø��Ϊ�׸�,����ǰ��һ��
		//�������ڰ׸�,��ת90��,���ø��Ϊ�ڸ�,����ǰ��һ��
		ArrayList<StringBuilder> array = new ArrayList<StringBuilder>();
		for (int i = 0; i < inputLine; i++) {
			array.add(new StringBuilder());
		}
		
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < inputColumn; j++) {
				array.get(i).append(scanner.next());
			}
		}
		
		/* **************************************
		 * �����x, y�����к��к�, ������ϵ��x, y�պ��෴*
		 * �����x, y�����к��к�, ������ϵ��x, y�պ��෴*
		 * �����x, y�����к��к�, ������ϵ��x, y�պ��෴*
		 * **************************************
		 * */
		//����������ʼλ��, ��ʼ��������߲���
		int x = scanner.nextInt();		//��ʼλ��, �к�
		int y = scanner.nextInt();		//��ʼλ��, �к�
		String s = scanner.next();		//��ʼ����,�������ҷֱ��ã�UDLR��ʾ
		int k = scanner.nextInt();		//���߲���
		
		scanner.close();
		
		for (int i = 0; i < k; i++) {
			if (array.get(x).charAt(y) == '0') {
				if (s.equals("U")) {
					array.get(x).setCharAt(y, '1');
					y--;
					s = "L";
				} else if (s.equals("D")) {
					array.get(x).setCharAt(y, '1');
					y++;
					s = "R";
				} else if (s.equals("L")) {
					array.get(x).setCharAt(y, '1');
					x++;
					s = "D";
				} else if (s.equals("R")) {
					array.get(x).setCharAt(y, '1');
					x--;
					s = "U";
				}
			} else if (array.get(x).charAt(y) == '1') {
				if (s.equals("U")) {
					array.get(x).setCharAt(y, '0');
					y++;
					s = "R";
				} else if (s.equals("D")) {
					array.get(x).setCharAt(y, '0');
					y--;
					s = "L";
				} else if (s.equals("L")) {
					array.get(x).setCharAt(y, '0');
					x--;
					s = "U";
				} else if (s.equals("R")) {
					array.get(x).setCharAt(y, '0');
					x++;
					s = "D";
				}
			}
		}
		System.out.println(x + " " + y);
	}
}
