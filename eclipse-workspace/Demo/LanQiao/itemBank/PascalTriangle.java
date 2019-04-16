package itemBank;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		
		scanner.close();
		
		//����һ��row�еĶ�ά����, �Ȳ�Ҫ����
		int[][] data = new int[row][];
		
		//����������еĳ�ʼ���������ڽ���״
		//��0����1�У� ��1����2��
		for (int i = 0; i < row; i++) {
			data[i] = new int[i + 1];
		}
		
		//��ÿһ�е����׺���β����Ϊ1
		for (int i = 0; i < data.length; i++) {
			data[i][0] = 1;
			data[i][data[i].length - 1] = 1;
		}
		
		//Ϊÿһ�����׺���β֮�丳ֵ
		for (int i = 2; i < data.length; i++) {
			for (int j = 1; j < data[i].length - 1; j++) {
				data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
			}
		}
		
		//���
		for (int[] is : data) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
}
