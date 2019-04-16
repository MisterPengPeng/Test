package codeCompletion;

import java.util.Vector;

/*
1.报数游戏


有n个孩子站成一圈，从第一个孩子开始顺时针方向报数，报到3的人出列，下一个人继续从1报数，直到最后剩下一个孩子为止。
问剩下第几个孩子。下面的程序以10个孩子为例，模拟了这个过程，请完善之（提示：报数的过程被与之逻辑等价的更容易操作的过程所代替）。


Vector a = new Vector();
for(int i=1; i<=10; i++)
{
a.add("第" + i + "个孩子");
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
			a.add("第" + i + "个孩子");
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
