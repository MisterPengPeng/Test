package resultFillInTheBlanksExercise;



/*
�н�����

С����ϲ�������
�������������μ���X����Ĳ��ջ��

ÿλѡ�ֿ�ʼ��ʱ�򶼱�����777�����ӱҡ�
�����ǣ��¶��ˣ�����ĵ��ӱ���Ŀ������
�´��ˣ��۳�555�����ӱ�, ����Ϊֹ��

С��һ������15�����
ս��Ϊ��vxvxvxvxvxvxvvx
����v��ʾ�¶��ˣ�x��ʾ�´��ˡ�

�������һ�£�С���������ĵ��ӱ���Ŀ�Ƕ��١�

����д��ʾ�����ӱ���Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class SurpriseGuessGame {
	public static void main(String[] args) {
		int coin = 777;
		
		String record = "vxvxvxvxvxvxvvx";
		
		for (int i = 0; i < record.length(); i++) {
			if (record.charAt(i) == 'v') {
				coin *= 2;
			} else {
				coin -= 555;
			}
		}
		
		System.out.println(coin);
	}
}
