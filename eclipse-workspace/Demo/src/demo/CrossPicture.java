package demo;

import java.util.ArrayList;
import java.util.Scanner;


/*
打印十字图

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


对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。
输入格式
一个正整数 n (n<30) 表示要求打印图形的层数。
输出格式
对应包围层数的该标志。
样例输入1
1
样例输出1
..$$$$$..
..$...$..
$$$.$.$$$
$...$...$
$.$$$$$.$
$...$...$
$$$.$.$$$
..$...$..
..$$$$$..

样例输入2
3
样例输出2
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

提示
请仔细观察样例，尤其要注意句点的数量和输出位置。
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
		//四角点变美元符
		StringBuilder s0 = dollarPicture.get(0);
		StringBuilder sLast = dollarPicture.get(dollarPicture.size() - 1);
		
		s0.setCharAt(0, '$');
		s0.setCharAt(s0.length() - 1, '$');
		sLast.setCharAt(0, '$');
		sLast.setCharAt(sLast.length() - 1, '$');
		//如果不创建s0 和 sLast 引用
//		dollarPicture.get(0).setCharAt(0, '$');
//		dollarPicture.get(0).setCharAt(dollarPicture.get(0).length() - 1, '$');
//		dollarPicture.get(dollarPicture.size() - 1).setCharAt(0, '$');
//		dollarPicture.get(dollarPicture.size() - 1).setCharAt(dollarPicture.get(dollarPicture.size() - 1).length() - 1, '$');
		
		//上下添加两行
		int count = dollarPicture.get(0).length() + 4;
		dollarPicture.add(0, new StringBuilder());
		dollarPicture.add(0, new StringBuilder());
		dollarPicture.add(new StringBuilder());
		dollarPicture.add(new StringBuilder());
		
		//填充上下两行添加的空行
		BianJie(dollarPicture.get(0), '$', count);
		BianJie(dollarPicture.get(1), '.', count);
		BianJie(dollarPicture.get(dollarPicture.size() - 1), '$', count);
		BianJie(dollarPicture.get(dollarPicture.size() - 2), '.', count);
		
		//四个角的填充
		JiaoLuo(dollarPicture.get(2));
		JiaoLuo(dollarPicture.get(dollarPicture.size() - 3));
		
		//主体部分填充
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
