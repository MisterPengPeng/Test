package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
	��˹�ռǣ���4��B��C/C++Ԥ����
	
	����ѧ�Ҹ�˹�и���ϰ�ߣ�������ζ�Ҫ���ռǡ�
	�����ռ��и����ڲ�ͬ�ĵط������Ӳ�ע�������գ�������һ���������棬���磺4210��
	��������֪�����Ǹ������������ڣ�����ʾ��һ���Ǹ�˹������ĵڼ��졣
	�����Ҳ�Ǹ���ϰ�ߣ���ʱʱ�̿����������ˣ������ֹ�ȥһ�죬���ж���ʱ����������˷��أ���˹�����ڣ�1777��4��30�ա�
	�ڸ�˹���ֵ�һ����Ҫ�������ռ��ϱ�ע�ţ�5343����˿���������ǣ�1791��12��15�ա�
	
	��˹��ò�ʿѧλ�������ռ��ϱ��ţ�8113��
	���������˹��ò�ʿѧλ�������ա�
	��ͨ����:�ܱ�4���������ܱ�100���������Ϊ��ͨ���ꡣ
	��������:�ܱ�400������Ϊ�������ꡣ
	
	    long timeStamp = 1495777335060;//ֱ����ʱ���
		long timeStamp = System.currentTimeMillis();  //��ȡ��ǰʱ���,Ҳ�����������Ѹ���һ������Ļ��Ǳ��˸����ʱ���(һ����long�͵�����)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������Ҫת�ɺ��ʱ��ĸ�ʽ
		String sd = sdf.format(new Date(timeStamp));   // ʱ���ת����ʱ��
        System.out.println(sd);//��ӡ����Ҫ��ʱ��
*/
public class GaussSDiary {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1777, 3, 29);
		c.add(Calendar.DAY_OF_MONTH, 8113);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(c.getTime()));
	}
}