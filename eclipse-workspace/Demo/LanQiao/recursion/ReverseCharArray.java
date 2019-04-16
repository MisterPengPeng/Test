package recursion;

import java.util.Scanner;

/*
** 递归练习4：递归倒置字符数组 **
题目描述
完成一个递归程序，倒置字符数组。并打印实现过程 
递归逻辑为： 
当字符长度等于1时，直接返回 
否则，调换首尾两个字符，在递归地倒置字符数组的剩下部分 

输入
字符数组长度及该数组 

输出
在求解过程中，打印字符数组的变化情况。 
最后空一行，在程序结尾处打印倒置后该数组的各个元素。 

样例输入
5 abcde

样例输出
ebcda
edcba

edcba
*/
public class ReverseCharArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		StringBuilder array = new StringBuilder(scanner.next());
		
		scanner.close();
		
		System.out.println(Recursion(0, length - 1, array));
	}
	
	public static StringBuilder Reverse(int start, int end, StringBuilder array) {
		char temp = array.charAt(start);
		array.setCharAt(start, array.charAt(end));
		array.setCharAt(end, temp);
		System.out.println(array);
		
		return array;
	}
	
	public static StringBuilder Recursion(int start, int end, StringBuilder array) {
		if (end - start <= 0) {
			if (array.length() != 1) {
				System.out.println();
			}
			return array;
		} else {
			return Recursion(start + 1, end - 1, Reverse(start, end, array));
		}
		
//		return (end - start) <= 0 ? array : Recursion(start + 1, end - 1, Reverse(start, end, array));
	}
}
