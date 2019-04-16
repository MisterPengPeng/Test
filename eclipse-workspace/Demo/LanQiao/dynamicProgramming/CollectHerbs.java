package dynamicProgramming;

import java.util.Scanner;

/*
1��	��ҩ(RQNOJ15)��
��Ŀ������
	�����Ǹ����ʴ�ӱ�ĺ��ӣ����������ǳ�Ϊ��������ΰ���ҽʦ��
	Ϊ�ˣ�����ݸ�������������ҽʦΪʦ��ҽʦΪ���ж��������ʣ���������һ�����⡣
	ҽʦ��������һ���������ǲ�ҩ��ɽ�������˵�������ӣ����ɽ������һЩ��ͬ�Ĳ�ҩ����ÿһ�궼��ҪһЩʱ�䣬ÿһ��Ҳ��������ļ�ֵ��
	�һ����һ��ʱ�䣬�����ʱ�������Բɵ�һЩ��ҩ���������һ�������ĺ��ӣ���Ӧ�ÿ����òɵ��Ĳ�ҩ���ܼ�ֵ��󡣡� 
	������ǳ���������������������
�����ʽ��
	����ĵ�һ������������T��1 <= T <= 1000����M��1 <= M <= 100������һ���ո������T�����ܹ��ܹ�������ҩ��ʱ�䣬M����ɽ����Ĳ�ҩ����Ŀ��
	��������M��ÿ�а���������1��100֮�䣨����1��100�����������ֱ��ʾ��ժĳ���ҩ��ʱ��������ҩ�ļ�ֵ��
�����ʽ��
�������һ�У���һ��ֻ����һ����������ʾ�ڹ涨��ʱ���ڣ����Բɵ��Ĳ�ҩ������ܼ�ֵ��
�������룺
70 3
71 100
69 1
1 2
���������
3
*/
public class CollectHerbs {
	
	static class Herb {
		int timeRequired;
		int value;
		
		public Herb(int timeRequired, int value) {
			this.timeRequired = timeRequired;
			this.value = value;
		}
		
		public Herb() {
			
		}
	}
	
	static int times;
	static int totalHerbs;
	static Herb[] herbs;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		times = scanner.nextInt();
		totalHerbs = scanner.nextInt();
		herbs = new Herb[totalHerbs];
		for (int i = 0; i < totalHerbs; i++) {
			herbs[i] = new Herb();
			herbs[i].timeRequired = scanner.nextInt();
			herbs[i].value = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(maxValue(times, totalHerbs - 1));
	}
	
	public static int maxValue(int timeLimit, int count) {
		if (count == 0) {
			return timeLimit >= herbs[count].timeRequired ? herbs[count].value : 0;
		}
		
		int valueIfNoTake = maxValue(timeLimit, count - 1);
		int valueIfTake = 0;
		if (timeLimit >= herbs[count].timeRequired) {
			valueIfTake = herbs[count].value + maxValue(timeLimit - herbs[count].timeRequired, count - 1);
		}
		
		return Math.max(valueIfNoTake, valueIfTake);
	}

}
