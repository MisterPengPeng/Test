package demo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * *********************
		����k������ѯ 
 * *********************
��������
����һ�����У�ÿ��ѯ�������е�l��������r�����е�K��������ĸ���

�����ʽ
��һ�а���һ����n����ʾ���г��ȡ�

�ڶ��а���n������������ʾ���������С�

����������һ��������m����ʾѯ�ʸ�����

������m�У�ÿ��������l,r,K����ʾѯ�����д������ҵ�l��������r�����У��Ӵ���С��K��������ĸ�������Ԫ�ش�1��ʼ��š�

�����ʽ
�ܹ����m�У�ÿ��һ��������ʾѯ�ʵĴ𰸡�
��������
5
1 2 3 4 5
2
1 5 2
2 3 2
�������
4
2
���ݹ�ģ��Լ��
����30%�����ݣ�n,m<=100��

����100%�����ݣ�n,m<=1000��

��֤k<=(r-l+1)�������е���<=106��
*/
public class SearchK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();			//����n, ��ʾ���г���
		int[] sequence = new int[n];		//n��������, ��ʾ����������
		
		//��sequence��ֵ
		for (int i = 0; i < n; i++) {
			sequence[i] = scanner.nextInt();
		}
		
		int m = scanner.nextInt();				//ѯ�ʵĸ���
		int[][] pending = new int[m][3];		//m��, ÿ��������l, r, K, ��ʾѯ�����д������ҵ�l��������r������, �Ӵ���С��K��������ĸ�. ����Ԫ�ش�һ��ʼ���.
		
		//��pending��ֵ
		for (int l = 0; l < m; l++) {
			for (int c = 0; c < 3; c++) {
				pending[l][c] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		//ѭ��m��
		for (int t = 0; t < m; t++) {
			int l = pending[t][0];		//��߽�l
			int r = pending[t][1];		//�ұ߽�r
			int K = pending[t][2];		//��ѯ��K�����
			
			Arrays.sort(sequence);		//����, ��С����
			
			int[] tempArr = Arrays.copyOfRange(sequence, l - 1, r);		//����Ҫ��Ĳ��ָ��Ƴ���
			
			//�ųɴӴ�С
			for (int i = 0; i < (tempArr.length / 2); i++) {
				int temp = tempArr[i];
				tempArr[i] = tempArr[tempArr.length - 1 - i];
				tempArr[tempArr.length - 1 - i] = temp;
			}
			
			
			int result = tempArr[K - 1];		//�����
			System.out.println(result);
		}
	}
}
