package demo;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
** ����Ʊ�� **

��������
ĳ���ܵ�λ�·���ĳ��Ʊ�ݣ���Ҫ������ȫ���ջء�
ÿ��Ʊ����Ψһ��ID�š�ȫ������Ʊ�ݵ�ID���������ģ���ID�Ŀ�ʼ���������ѡ���ġ�
��Ϊ������Ա�������¼��ID�ŵ�ʱ������һ�����������ĳ��ID�Ϻţ�����һ��ID�غš�
���������ͨ����̣��ҳ��Ϻŵ�ID���غŵ�ID��
����ϺŲ����ܷ�����������С�š�

�����ʽ
Ҫ�������������һ������N(N<100)��ʾ��������������
���Ŷ���N�����ݡ�
ÿ�����ݳ��Ȳ��ȣ����ÿո�ֿ������ɸ���������100������������������100000������ע�����ں���ĩ�����ж���Ŀո���ĳ�����Ҫ�ܴ�����Щ�ո�
ÿ����������һ��ID�š�

�����ʽ
Ҫ��������1�У�����������m n���ÿո�ָ���
���У�m��ʾ�Ϻ�ID��n��ʾ�غ�ID

��������1
2
5 6 8 11 9 
10 12 9
5 6 8 9 9 10 11 12
�������1
7 9

��������2
6
164 178 108 109 180 155 141 159 104 182 179 118 137 184 115 124 125 129 168 196
172 189 127 107 112 192 103 131 133 169 158 
128 102 110 148 139 157 140 195 197
185 152 135 106 123 173 122 136 174 191 145 116 151 143 175 120 161 134 162 190
149 138 142 146 199 126 165 156 153 193 144 166 170 121 171 132 101 194 187 188
113 130 176 154 177 120 117 150 114 183 186 181 100 163 160 167 147 198 111 119

�������2
105 120
*/
public class ErroneousBill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		String[] ID = new String[line];
		int[] intID = new int[10000];
		scanner.nextLine();
		
		for (int i = 0; i < ID.length; i++) {
			ID[i] = scanner.nextLine();
		}
		scanner.close();
		
		int intIDIndex = 0;
		for (int i = 0; i < ID.length; i++) {
			String[] strID = ID[i].split(" ");
			for (int j = 0; j < strID.length; j++) {
				if (!strID[j].equals(" ")) {
					intID[intIDIndex] = Integer.valueOf(strID[j]);
					intIDIndex++;
				}
			}
		}
		
		int[] subIntID = new int[intIDIndex];
		for (int i = 0; i < intIDIndex; i++) {
			subIntID[i] = intID[i];
		}
		
		Arrays.sort(subIntID);
		
//		m��ʾ�Ϻ�ID��n��ʾ�غ�ID
		int m = 0;
		int n = 0;
		for(int i = 0; i < subIntID.length - 1; i++) {
			if (subIntID[i] == subIntID[i + 1]) {
				n = subIntID[i];
			} else if (subIntID[i + 1] != subIntID[i] + 1 && subIntID[i] != subIntID[i + 1]) {
				m = subIntID[i] + 1;
			}
		}
		
		System.out.println(m + " " + n);
	}
}