package demo;

//import java.util.ArrayList;
import java.util.Scanner;


/*
** DNA **

��Ŀ����
Сǿ��С��ϲ��������ѧ�������Ǻ��滨�����޴��������ġ����ڣ� Сǿ����ѧ�ˣ��Ӵ�������ʥ������--DNA.����һ��˫�����Ľṹ������һ�����Сǿץ��ͷƤ����Ҫ���ܻ������ͺ��ˡ� Сǿ���������ھ�����������ɡ�
����Ϊ3��DNA���Ի���
X X
 X 
X X
����Ϊ7��DNA����Ի���
X     X
 X   X
  X X
   X
  X X
 X   X
X     X

����
�����������������ݡ���һ������N��N<=15��,N��ʾ������ÿ�����ݰ�����������a,b��a��ʾһ����λ��DNA����������aΪ������ 3<=a<=39��b��ʾ�ظ���(1<=b<=20)��

���
���DNA����״��ÿ���������һ���С�

��������
2
3 1
5 4

�������
X X
 X
X X

X   X
 X X
  X
 X X
X   X
 X X
  X
 X X
X   X
 X X
  X
 X X
X   X
 X X
  X
 X X
X   X
*/
public class DNA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();  //��ʾ����
		
		
		//a��ʾһ����λ��DNA��������, aΪ������ 3<=a<=39. b��ʾ�ظ���(1<=b<=20)
		int[] inputA = new int[n];	//���a
		int[] inputB = new int[n];	//���b
		
		for (int i = 0; i < n; i++) {
			inputA[i] = scanner.nextInt();
			inputB[i] = scanner.nextInt();
		}
		scanner.close();

	}
	
	public static void PrintLine(int length) {
		//length��ʾ����, �����������ʵ�ִ�ӡ��.
		
	}
}
		
		
		
		
/**
 * �����Լ�д���ô���!!!
 * �����Լ�д���ô���!!!
 * �����Լ�д���ô���!!!
 * �����Լ�д���ô���!!!
 * �����Լ�д���ô���!!!
 * */
//		for (int i = 0; i < inputA.length; i++) {
//			//��һ��
//			char[] arrayOne = new char[inputA[i]];
//			for (int j = 0; j < arrayOne.length; j++) {	
//				if (j == 0) {
//					arrayOne[j] = 'X';
//				} else if (j == arrayOne.length - 1) {
//					arrayOne[arrayOne.length - 1] = 'X';
//				} else {
//					arrayOne[j] = ' ';
//				}
//			}
//			
//			//���岿��
//			ArrayList<StringBuilder> array = new ArrayList<>();
//			for (int j = 0; j < inputA[i] - 1; j++) {
//				array.add(new StringBuilder());
//			}
//			
//			//h���к�
//			for (int h = 1; h < array.size(); h++) {
//				if (h < inputA[i] / 2) {
//					//���ӵ�һ�οո�
//					int space = 0;	//���˼����ո�
//					for (int q = 0; q < h; q++) {
//						array.get(h).append(" ");
//						space++;
//					}
//					
//					//���ӵ�һ��X
//					array.get(h).append("X");
//					
//					//���ӵڶ��οո�
//					for (int k = 0; k < inputA[i] - 2 - space - h; k++) {
//						array.get(h).append(" ");
//					}
//					
//					//���ӵڶ���X
//					array.get(h).append("X");
//				} else if (h > inputA[i] / 2) {
//					//���ӵ�һ�οո�
//					int space = 0;	//���˼����ո�
//					for (int q = 0; q < array.size() - h; q++) {
//						array.get(h).append(" ");
//						space++;
//					}
//					
//					//���ӵ�һ��X
//					array.get(h).append("X");
//					
//					//���ӵڶ��οո�
//					for (int k = 0; k < inputA[i] - 2 - space - 1; k++) {
//						array.get(h).append(" ");
//					}
//					
//					//���ӵڶ���X
//					array.get(h).append("X");
//				} else if (h == inputA[i] / 2) {
//					//���ӵ�һ�οո�
//					for (int k = 0; k < h; k++) {
//						array.get(h).append(" ");
//					}
//					
//					array.get(h).append("X");
//				}
//			}
//			
//			for (char c : arrayOne) {
//				System.out.print(c);
//			}
//
//			for (StringBuilder stringBuilder : array) {
//				System.out.println(stringBuilder);
//			}
//			System.out.println();
//		}
//		
//		
//		for (int p = 0; p < n; p++) {
//			PrintDNA(inputA[p], inputB[p]);
//			System.out.println();
//		}
//	}
//	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	public static void PrintDNA(int a, int b) {
//		
//		ArrayList<StringBuilder> array = new ArrayList<>();
//		
//		for (int i = 0; i < a; i++) {
//			array.add(new StringBuilder());
//		}
//		
//		//�ظ�
//		for (int i = 1; i < b; i++) {
//			for (int k = 0; k < a - 1; k++) {
//				array.add(new StringBuilder());
//			}
//		}
//		
//		//���ո�
//		for (int i = 0; i < array.size(); i++) {
//			for (int j = 0; j < a; j++) {
//				array.get(i).append(' ');
//			}
//		}
//		
//		//��ӡDNA
//		int j = 0;
//		for (int i = 0; i < array.size(); i++) {
//			array.get(i).setCharAt(j, 'X');
//			array.get(i).setCharAt(array.get(i).length() - j - 1, 'X');
//			j++;
//			for (int z = 1; z <= 20; z++) {
//				if (i == a * z - 1) {
//					j = 0;
//				}
//			}
//		}
//		
//		for (StringBuilder stringBuilder : array) {
//			System.out.println(stringBuilder);
//		}
//	}
//}