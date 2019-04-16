package test4;

public class T6 {
	static void move(char[] data, int from, int to) {
		data[to] = data[from];
		data[from] = '.';
	}

	static boolean valid(char[] data, int k) {
		if (k < 0 || k >= data.length)
			return false;
		return true;
	}

	static void f(char[] data) {
		while (true) {
			boolean tag = false;
			for (int i = 0; i < data.length; i++) {
				int dd = 0; // �ƶ�����
				if (data[i] == '.')
					continue;
				if (data[i] == 'A')
					dd = 1;
				if (data[i] == 'B')
					dd = -1;

				if (valid(data, i + dd) && valid(data, i + dd + dd) && data[i + dd] != data[i]
						&& data[i + dd + dd] == '.') {
					// �������...
					move(data, i, i + dd + dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}

			if (tag)
				continue;

			for (int i = 0; i < data.length; i++) {
				int dd = 0; // �ƶ�����
				if (data[i] == '.')
					continue;
				if (data[i] == 'A')
					dd = 1;
				if (data[i] == 'B')
					dd = -1;

				if (valid(data, i + dd) && data[i + dd] == '.') {
					// ������ƶ�...
					if (i + dd + dd + dd == 6 && data[i] != data[i + dd + dd])
						continue; // ���λ��
					move(data, i, i + dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}

			if (tag == false)
				break;
		}
	}

	public static void main(String[] args) {
		char[] data = "AAA.BBB".toCharArray();
		f(data);
	}
}
