package itemBank;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		
		scanner.close();
		
		//建立一个row行的二维数组, 先不要管列
		int[][] data = new int[row][];
		
		//在这里进行列的初始化，类似于阶梯状
		//第0行有1列， 第1行有2列
		for (int i = 0; i < row; i++) {
			data[i] = new int[i + 1];
		}
		
		//将每一行的行首和行尾设置为1
		for (int i = 0; i < data.length; i++) {
			data[i][0] = 1;
			data[i][data[i].length - 1] = 1;
		}
		
		//为每一行行首和行尾之间赋值
		for (int i = 2; i < data.length; i++) {
			for (int j = 1; j < data[i].length - 1; j++) {
				data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
			}
		}
		
		//输出
		for (int[] is : data) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
}
