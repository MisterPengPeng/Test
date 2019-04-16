package dynamicProgramming;

import java.util.Scanner;

/*
�������������������Ѱ��һ���Ӷ������ױߵ�·����ʹ��·����������������֮�����
·���ϵ�ÿһ����ֻ�������»� �����ߡ�ֻ��Ҫ���������ͼ��ɣ����ظ�������·���� 
�����ε���������1С�ڵ���100������Ϊ 0 - 99

�����ʽ��
//��һ�б�ʾ�����ε�����    ����������������
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

Ҫ���������
*/
public class SecondDPQuestion {
	
	static int line;
	static int[][] triangle;
	static int[][] calculatedValue;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		line = scanner.nextInt();
		triangle = new int[line][];
		calculatedValue = new int[line][];
		for (int i = 0; i < line; i++) {
			triangle[i] = new int[i + 1];
			calculatedValue[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				triangle[i][j] = scanner.nextInt();
				calculatedValue[i][j] = -1;
			}
		}
		
		scanner.close();
		
		System.out.println(maxNum(0, 0));
	}
	
	public static int maxNum(int line, int column) {
		if (calculatedValue[line][column] < 0) {
			if (line == SecondDPQuestion.line - 1) {
				calculatedValue[line][column] = triangle[line][column];
			} else {
				calculatedValue[line][column] = Math.max(maxNum(line + 1, column), maxNum(line + 1, column + 1)) + triangle[line][column];
			}
		}
		
		return calculatedValue[line][column];
	}
}
