package codeCompletion;



/*
����˶�������������ߡ���Ϸ�������ǣ�������δ�1��ʼ˳����������������7��7�ı�����Ҫ���ֻ������涨�ķ�ʽ��ʾԽ�������磺7,14,17�ȶ�������������
��һ�˼�������������֡�Υ���������ܷ�������ĳ���ģ��������̣���7����������*����������֮��


for(int i=1; i<100; i++)
{
if(i % 7 == 0)
printf("*\n");
else if(___________________)
printf("*\n");	
else
printf("%d\n", i);

}
*/
public class Clap7 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0)
				System.out.println("*");
			else if (i % 10 == 7 || (i / 10) % 10 == 7)
				System.out.println("*");	
			else
				System.out.println(i);
		}
	}
}
