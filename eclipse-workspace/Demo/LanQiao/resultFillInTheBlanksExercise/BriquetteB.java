package resultFillInTheBlanksExercise;



/*
ú����Ŀ

��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��

�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class BriquetteB {
	public static void main(String[] args) {
		int sum = 0;
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			result += sum;
		}
		System.out.println(result);
	}
}
