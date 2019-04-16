package demo;

import java.util.Scanner;

/*
** 奇怪的数列 **
题目描述
从X星截获一份电码，是一些数字，如下：
13
1113
3113
132113
1113122113
....
YY博士经彻夜研究，发现了规律：
第一行的数字随便是什么，以后每一行都是对上一行“读出来”
比如第2行，是对第1行的描述，意思是：1个1，1个3，所以是：1113
第3行，意思是：3个1,1个3，所以是：3113

请你编写一个程序，可以从初始数字开始，连续进行这样的变换。

输入
第一行输入一个数字组成的串，不超过100位
第二行，一个数字n，表示需要你连续变换多少次，n不超过20
输出一个串，表示最后一次变换完的结果。

输出
输出一个串，表示最后一次变换完的结果。

样例输入
5
7

样例输出
13211321322115
*/
public class StrangeSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.next();		//存放变换的数字串
		int times = scanner.nextInt();		//存放要变换的次数
		
		scanner.close();
		
		int counter = 1;		//记录数字连续出现的次数
		
		//主体部分
		for (int t = 0; t < times; t++) {		//循环times次
			
			String temp = "";		//新建一个临时字符串执行操作
			
			for (int i = 0; i < num.length(); i++) {
				
				//满足条件计数器自增并跳过之后的操作
				if (i + 1 < num.length() && num.charAt(i) == num.charAt(i + 1)) {
					counter++;
					continue;
				}
				
				temp += counter + "" + num.charAt(i);		//temp后面加上 数字出现的次数 + 数字		双引号是为了把数字转为字符串
				counter = 1;		//将计数器重置
			}
			num = temp;		//将temp赋给num
		}
		
		System.out.println(num);		//输出num
	}
}
