package demo;

import java.util.Arrays;
import java.util.Scanner;

/*
** 数字黑洞 **

题目描述
任意一个四位数，只要它们各个位上的数字是不全相同的，就有这样的规律： 
1)将组成该四位数的四个数字由大到小排列，形成由这四个数字构成的最大的四位数； 
2)将组成该四位数的四个数字由小到大排列，形成由这四个数字构成的最小的四位数(如果四个数中含有0，则得到的数不足四位)； 
3)求两个数的差，得到一个新的四位数(高位零保留)。 
重复以上过程，最后一定会得到的结果是6174。 
比如：4312  3087  8352  6174，经过三次变换，得到6174 

输入
一个四位整数，输入保证四位数字不全相同 

输出
一个整数，表示这个数字经过多少次变换能得到6174 

样例输入
4312 

样例输出
3
*/
public class BlackHoleOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		scanner.close();
		
		char[] arr = input.toCharArray();
		int counter = 1;
		
		while (true) {
			char[] temp = Arrays.copyOf(arr, arr.length);
			Sort(temp);
			int sort = sum(temp);
			InversionSort(temp);
			int inversionSort = sum(temp);
			int difference = inversionSort - sort;
			if (difference == 6174) {
				break;
			} else {
				counter++;
				char ge = (char)(difference % 10 + 48);
				char shi = (char)((difference / 10) % 10 + 48);
				char bai = (char)((difference / 100) % 10 + 48);
				char qian = (char)(difference / 1000 + 48);
				arr[0] = qian;
				arr[1] = bai;
				arr[2] = shi;
				arr[3] = ge;
			}
		}
		
		System.out.println(counter);
	}

	public static int sum(char[] arr) {
		int sum = 0;
		sum += (arr[0] - 48) * 1000;
		sum += (arr[1] - 48) * 100;
		sum += (arr[2] - 48) * 10;
		sum += (arr[3] - 48);
		return sum;
	}
	
	//从小到大排序
	public static void Sort(char[] arr) {
		Arrays.sort(arr);
	}
	
	//从大到小排序
	public static void InversionSort(char[] arr) {
		Sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
