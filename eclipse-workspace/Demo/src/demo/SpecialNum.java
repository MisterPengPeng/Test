package demo;


/*
���������(ˮ�ɻ���)
	��������
		153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3��
		�������������������������λʮ��������
		�����ʽ����С�����˳�����������������λʮ��������ÿ����ռһ�С�
*/
public class SpecialNum {
	public static void main(String[] args) {
		for (int specialNum = 153; specialNum < 1000; specialNum++) {
			String strSpeNum = specialNum + "";
			int judgeSpeNum = (int)Math.pow(strSpeNum.charAt(0) - 48, 3) + (int)Math.pow(strSpeNum.charAt(1) - 48, 3) + (int)Math.pow(strSpeNum.charAt(2) - 48, 3);
			if (specialNum == judgeSpeNum) {
				System.out.println(specialNum);
			}
		}
	}
}