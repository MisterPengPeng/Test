package demo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * *********************
		区间k大数查询 
 * *********************
问题描述
给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。

输入格式
第一行包含一个数n，表示序列长度。

第二行包含n个正整数，表示给定的序列。

第三个包含一个正整数m，表示询问个数。

接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。

输出格式
总共输出m行，每行一个数，表示询问的答案。
样例输入
5
1 2 3 4 5
2
1 5 2
2 3 2
样例输出
4
2
数据规模与约定
对于30%的数据，n,m<=100；

对于100%的数据，n,m<=1000；

保证k<=(r-l+1)，序列中的数<=106。
*/
public class SearchK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();			//输入n, 表示序列长度
		int[] sequence = new int[n];		//n个正整数, 表示给定的序列
		
		//给sequence赋值
		for (int i = 0; i < n; i++) {
			sequence[i] = scanner.nextInt();
		}
		
		int m = scanner.nextInt();				//询问的个数
		int[][] pending = new int[m][3];		//m行, 每行三个数l, r, K, 表示询问序列从左往右第l个数到第r个数中, 从大往小第K大的数是哪个. 序列元素从一开始标号.
		
		//给pending赋值
		for (int l = 0; l < m; l++) {
			for (int c = 0; c < 3; c++) {
				pending[l][c] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		//循环m次
		for (int t = 0; t < m; t++) {
			int l = pending[t][0];		//左边界l
			int r = pending[t][1];		//右边界r
			int K = pending[t][2];		//查询第K大的数
			
			Arrays.sort(sequence);		//排序, 从小到大
			
			int[] tempArr = Arrays.copyOfRange(sequence, l - 1, r);		//把需要查的部分复制出来
			
			//排成从大到小
			for (int i = 0; i < (tempArr.length / 2); i++) {
				int temp = tempArr[i];
				tempArr[i] = tempArr[tempArr.length - 1 - i];
				tempArr[tempArr.length - 1 - i] = temp;
			}
			
			
			int result = tempArr[K - 1];		//最后结果
			System.out.println(result);
		}
	}
}
