package demo;

/*
** ������ҵ ** 2016��C�������

����Сѧ����ѧ��ĿҲ������ô����ġ�
�������������ҵ��
   �� + �� = ��
   �� - �� = ��
   �� �� �� = ��
   �� �� �� = ��
ÿ���������1~13�е�ĳһ�����֣��������ظ������磺
 6  + 7 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5
�Լ��� 
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5
�������ֽⷨ�����ӷ����˷������ɺ��㲻ͬ�ķ����� ��һ���ҵ��˶����ַ�����
ע�����Ҫ�ܳ���
*/
public class WinterVacationHomework {
	
	static int[] paiFa = new int[12];
	static boolean[] used = new boolean[13];
	static int counter = 0;
	public static void main(String[] args) {
		paiShu(0);
		System.out.println(counter);
	}
	
	public static void paiShu(int n) {
		for (int i = 1; i <= 13; i++) {
			if (used[i - 1] == false) {
				paiFa[n] = i;
				if (n == 2) {
					// ��1�н��
					if (paiFa[0] + paiFa[1] != paiFa[2]) {
						continue;
					}
				} else if (n == 5) {
					// ��2�н��
					if (paiFa[3] - paiFa[4] != paiFa[5]) {
						continue;
					}
				} else if (n == 8) {
					// ��3�н��
					if (paiFa[6] * paiFa[7] != paiFa[8]) {
						continue;
					}
				} else if (n == 11) {
					// ��4�н��
					if ((paiFa[9] % paiFa[10] == 0) && 
							(paiFa[9] / paiFa[10] == paiFa[11])) {
						counter++;
						return;
					} else {
						continue;
					}
				}
				
				if (n < 11) {
					used[i - 1] = true;
					paiShu(n + 1);
					used[i - 1] = false;
				}
			}
		}
	}

}

