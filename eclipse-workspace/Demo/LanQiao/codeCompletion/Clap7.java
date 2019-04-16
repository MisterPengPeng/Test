package codeCompletion;



/*
许多人都曾经玩过“拍七”游戏。规则是：大家依次从1开始顺序数数，数到含有7或7的倍数的要拍手或其它规定的方式表示越过（比如：7,14,17等都不能数出），
下一人继续数下面的数字。违反规则者受罚。下面的程序模拟这个过程，拍7的情况输出“*”，请完善之。


for(int i=1; i<100; i++)
{
if(i % 7 == 0)
printf("*\n");
else if(___________________)
printf("*\n");	
else
printf("%d\n", i);

}
*/
public class Clap7 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0)
				System.out.println("*");
			else if (i % 10 == 7 || (i / 10) % 10 == 7)
				System.out.println("*");	
			else
				System.out.println(i);
		}
	}
}
