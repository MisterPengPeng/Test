package demo;

import java.util.Calendar;
import java.util.Scanner;

/*
** ��ɫ������ **

��Ŀ����
��Щ�����˱Ƚ����ţ����ĳ���µ�13�������������壬���Ǿͻ���ò�̫�������ù��˵�˵�������ǡ����²��ˡ���
�����дһ������ͳ�Ƴ���ĳ���ض�������У������˶��ٴμ���13����������������Σ��԰�������������ѽ�����⡣ 
˵����
��1��һ����365�죬������366�죬��ν���꣬���ܱ�4�����Ҳ��ܱ�100��������ݣ����Ǽ��ܱ�100����Ҳ�ܱ�400��������ݣ�
��2����֪1998��1��1���������ģ��û��������ݿ϶����ڻ����1998�ꡣ 

����
����ֻ��һ�У���ĳ���ض�����ݣ����ڻ����1998�꣩�� 

���
���ֻ��һ�У�������һ���У������˶��ٴμ���13����������������Ρ� 

��������
1998 

�������
3
*/
public class BlackFriday {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		int sum = 0;
		Calendar calendar = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			calendar.set(year, i, 13);
			if (calendar.get(Calendar.DAY_OF_WEEK) == 6) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}