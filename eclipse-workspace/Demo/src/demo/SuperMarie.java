package demo;

import java.util.Scanner;

/*
import java.util.Scanner;
public class 超级玛丽 {
	static int result=0;//方案数
	static int a[];
	static int length;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		length=in.nextInt()+1;
		a=new int[length];
		int num=in.nextInt();//陷阱个数
		
		for(int i=0;i<num;i++){
			int temp=in.nextInt();
			if(temp<length-1)
			a[temp]=1;
		}
		
		dfs(1);
		System.out.println(result);
 	}

	private static void dfs(int i) {//i表示当前位置
		if (i==length-1) {
			result++;
		}
		if (i>=length) {
			return;
		}
		if (a[i]==1) {
			return;		//当前位置为陷阱
		}
		dfs(i+1);
		dfs(i+2);
	}
}
*/

/*
** 超级玛丽 **

题目描述
大家都知道" 超级玛丽" 是一个很善于跳跃的探险家，他的拿手好戏是跳跃，但它一次只能向前跳一步或两步。
有一次，他要经过一条长为n的羊肠小道，小道中有m个陷阱，这些陷阱都位于整数位置，分别是a1,a2,....am，陷入其中则必死无疑。
显然，如果有两个挨着的陷阱，则玛丽是无论如何也跳过不去的。 
现在给出小道的长度n，陷阱的个数及位置。求出玛丽从位置1开始，有多少种跳跃方法能到达胜利的彼岸（到达位置n）。 

数据规模和约定 
40 >= n >= 3, m >= 1 
n > m; 
陷阱不会位于1及n上 

输入
第一行为两个整数n,m 
第二行为m个整数，表示陷阱的位置 

输出
一个整数。表示玛丽跳到n的方案数 

样例输入
4  1 
2 

样例输出
1
*/
public class SuperMarie {
	static int result = 0;
	static int a[];
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt() + 1;
		a = new int[n];
		int num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
			int temp = in.nextInt();
			if (temp < n - 1) {
				a[temp] = 1;
			}
		}
		in.close();
	}
}
