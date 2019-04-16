package resultFillInTheBlanksExercise;

import java.util.Scanner;

/*
平方怪圈

如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
对新产生的正整数再做同样的处理。

如此一来，你会发现，不管开始取的是什么数字，
最终如果不是落入1，就是落入同一个循环圈。

请写出这个循环圈中最大的那个数字。

请填写该最大数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/
public class SquareOddCircle {
	
	static int number;
	static int maxNumber = 0;
	static int times = 50;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		number = scanner.nextInt();
		
		scanner.close();
		number = function(number);
		dfs(number, times);
	}
	
	public static void dfs(int number, int times) {
		if (times == 0 || number == 1) {
			System.out.println(maxNumber);
			return;
		}
		number = function(number);
		if (number > maxNumber) {
			maxNumber = number;
		}
		dfs(number, times - 1);
	}
	
	public static int function(int number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10) * (number % 10);
			number /= 10;
		}
		return sum;
	}
}
