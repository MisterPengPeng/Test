package failed;


/*
		+----+----+----+----+
		|    |    |    |    |
		+----+----+----+----+
		|    |    |    |    |	1
		+----+----+----+----+
		|    |    |    |    |
		+----+----+----+----+
		
		+----+----+----+----+
		|    ||||||    |    |
		+----+----+----+----+
		|    |||||||||||    |	2
		+----+----+----+----+
		|    |    |||||||||||
		+----+----+----+----+
		
		+----+----+----+----+
		|    |    ||||||    |
		+----+----+----+----+
		||||||||||||||||    |	3
		+----+----+----+----+
		|    ||||||    |    |
		+----+----+----+----+
����Ʊ
�硾ͼ1.jpg��, ��12������һ���12��Ф����Ʊ��
������Ҫ���м���5������Ҫ����������ŵġ�
����������һ���ǲ���������
���磬��ͼ2.jpg������ͼ3.jpg���У��ۺ�ɫ��ʾ���־��Ǻϸ�ļ�ȡ��
������㣬һ���ж����ֲ�ͬ�ļ�ȡ������
����д��ʾ������Ŀ��������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class CutStampsB {

	static int[] stamp = new int[5];
	static int counter = 0;

	public static void main(String[] args) {
		for (stamp[0] = 0; stamp[0] < 12; stamp[0]++) {
			for (stamp[1] = stamp[0] + 1; stamp[1] < 12; stamp[1]++) {
				for (stamp[2] = stamp[1] + 1; stamp[2] < 12; stamp[2]++) {
					for (stamp[3] = stamp[2] + 1; stamp[3] < 12; stamp[3]++) {
						for (stamp[4] = stamp[3] + 1; stamp[4] < 12; stamp[4]++) {
							if (check()) {
								counter++;
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
	
	public static boolean check() {
		boolean[] book = new boolean[5];
		f(book, 0);
		return book[0] && book[1] && book[2] && book[3] && book[4];
	}

	public static void f(boolean[] book, int i) {
		book[i] = true;
		for (int j = 0; j < book.length; j++) {
			if (!book[j] && (stamp[i] / 4 == stamp[j] / 4) && (stamp[i] == stamp[j] + 1 || stamp[i] == stamp[j] - 1)) {
				f(book, j);
			}
			if (!book[j] && (stamp[i] == stamp[j] + 4 || stamp[i] == stamp[j] - 4)) {
				f(book, j);
			}
		}
	}
}
