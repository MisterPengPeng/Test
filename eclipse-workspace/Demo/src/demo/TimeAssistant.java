package demo;

import java.util.Scanner;

/*
** ��ʱ���� **
��Ŀ����
������ǰ��ʱ�䣬����Ӣ�ĵĶ��������������� 
ʱ����ʱh�ͷ�m��ʾ����Ӣ�ĵĶ����У���һ��ʱ��ķ����ǣ� 
���mΪ0����ʱ��������Ȼ����ϡ�o'clock������3:00������three o'clock���� 
���m��Ϊ0����ʱ��������Ȼ�󽫷ֶ���������5:30������five thirty���� 
ʱ�ͷֵĶ���ʹ�õ���Ӣ�����ֵĶ���������0~20������ 

0:zero,  1:  one,  2:two,  3:three,  4:four,  5:five,  6:six,  7:seven,  8:eight,  9:nine,  10:ten,  11:eleven,  12:twelve,
13:thirteen,  14:fourteen,  15:fifteen,  16:sixteen,  17:seventeen,  18:eighteen,  19:nineteen,  20:twenty�� 

30����thirty��40����forty��50����fifty�� 

���ڴ���20С��60�����֣����ȶ���ʮ������Ȼ���ټ��ϸ�λ������31���ȶ�30�ټ�1�Ķ�����������thirty  one���� 
������Ĺ���21:54������twenty  one  fifty  four����9:07������nine  seven����0:15������zero  fifteen���� 

����
������������Ǹ�����h��m����ʾʱ���ʱ�ͷ֡����������ǰû��ǰ��0��hС��24��mС��60�� 

���
���ʱ��ʱ�̵�Ӣ�ġ� 

��������
0 15 

�������
zero fifteen
*/
public class TimeAssistant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		scanner.close();
		
		String[] strHour = {"zero", "one", "two", "three", "four", "five", "six", "seven", 
				"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
				"sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
		
		String[] strMinute = {"zero", "one", "two", "three", "four", "five", "six", "seven", 
				"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
				"sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty"};
		
		if (hour <= 20) {
			System.out.print(strHour[hour] + " ");
		} else {
			int temp = hour % 20;
			System.out.print(strHour[strHour.length - 1] + " " + strHour[temp] + " ");
		}
		
		if (minute <= 20) {
			System.out.print(strMinute[minute]);
		} else if (minute == 30) {
			System.out.print(strMinute[strMinute.length - 3]);
		} else if (minute < 30) {
			int temp = minute % 20;
			System.out.print(strMinute[strMinute.length - 4] + " " + strMinute[temp]);
		} else if (minute == 40) {
			System.out.print(strMinute[strMinute.length - 2]);
		} else if (minute < 40) {
			int temp = minute % 30;
			System.out.print(strMinute[strMinute.length - 3] + " " + strMinute[temp]);
		} else if (minute == 50) {
			System.out.print(strMinute[strMinute.length - 1]);
		} else if (minute < 50) {
			int temp = minute % 40;
			System.out.print(strMinute[strMinute.length - 2] + " " + strMinute[temp]);
		} else if (minute < 60) {
			int temp = minute % 50;
			System.out.print(strMinute[strMinute.length - 1] + " " + strMinute[temp]);
		}
	}
}