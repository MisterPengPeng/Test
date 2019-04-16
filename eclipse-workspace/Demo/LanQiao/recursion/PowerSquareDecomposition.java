package recursion;

import java.util.Scanner;

/*
** �ݷ��ֽ� **
��Ŀ����
�κ�һ����������������2���ݴη���ʾ�����磺 
137=2^7+2^3+2^0  
ͬʱԼ����������������ʾ����a^b�ɱ�ʾΪa(b)�� 
�ɴ˿�֪��137�ɱ�ʾΪ�� 
2(7)+2(3)+2(0) 
��һ����7=2^2+2+2^0  (2^1��2��ʾ) 
3=2+2^0  
�������137�ɱ�ʾΪ�� 
2(2(2)+2+2(0))+2(2+2(0))+2(0) 
���磺 
1315=2^10+2^8+2^5+2+2^0
����1315���ɱ�ʾΪ�� 
2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0) 

����
�������һ��������N(N<=20000)��ΪҪ��ֽ�������� 

���
�����������һ���ַ�����Ϊ����Լ����n��0��2��ʾ(�ڱ�ʾ�в����пո�) 

��������
1315

�������
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
