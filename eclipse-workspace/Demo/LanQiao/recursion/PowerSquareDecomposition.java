package recursion;

import java.util.Scanner;

/*
** 幂方分解 **
题目描述
任何一个正整数都可以用2的幂次方表示。例如： 
137=2^7+2^3+2^0  
同时约定方次用括号来表示，即a^b可表示为a(b)。 
由此可知，137可表示为： 
2(7)+2(3)+2(0) 
进一步：7=2^2+2+2^0  (2^1用2表示) 
3=2+2^0  
所以最后137可表示为： 
2(2(2)+2+2(0))+2(2+2(0))+2(0) 
又如： 
1315=2^10+2^8+2^5+2+2^0
所以1315最后可表示为： 
2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0) 

输入
输入包含一个正整数N(N<=20000)，为要求分解的整数。 

输出
程序输出包含一行字符串，为符合约定的n的0，2表示(在表示中不能有空格) 

样例输入
1315

样例输出
2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0)
*/
public class PowerSquareDecomposition {
	
	static int[] powerSquare = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		Recursion(n);
	}
	
	public static void Recursion(int n) {
		int index = 14;
		int temp = n;
		
		if (n == 0) {
			System.out.print("0");
			return;
		} else if (n == 1) {
			System.out.print("2(0)");
			return;
		} else if (n == 2) {
			System.out.print("2");
			return;
		}
		
		while(index >= 1) {
			if(temp - powerSquare[index] >= 0) {
				
				System.out.print("2");
				
				if(index > 1) {
					System.out.print("(");
					Recursion(index);
					System.out.print(")");
				}
				
				temp = temp - powerSquare[index];
				if(temp != 0) {
					System.out.print("+");
				}
				
				Recursion(temp);
				return;
				
			}
			index--;
		}
	}
}
