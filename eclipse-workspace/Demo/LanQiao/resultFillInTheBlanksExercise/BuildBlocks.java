package resultFillInTheBlanksExercise;



/*
���ľ

С�����ϲ�������ֻ�ľ��
һ����10���ľ��ÿ����ľ����һ�����֣�0~9��

���ľ����
ÿ����ľ�ŵ�����������ľ�����棬����һ���������������ľ����С��
�����4��Ľ������Σ������������еĻ�ľ��

���������ֺϸ�Ĵ��

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4    

������������Ĵһ���ж����֣�

�����ʾ����Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class BuildBlocks {
	
	static int counter = 0;
	static boolean[] book = new boolean[10];
	static int[][] blocks = new int[4][];
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			blocks[i] = new int[i + 1];
		}
		dfs(0, 0);
		System.out.println(counter);
	}
	
	public static void dfs(int line, int column) {
		if (line == 4 && check()) {
			counter++;
			return;
		}
		
		for (int j = 0; j < 10; j++) {
			if (!book[j]) {
				if (column == blocks[line].length - 1) {
					book[j] = true;
					blocks[line][column] = j;
					dfs(line + 1, 0);
					book[j] = false;
				} else {
					book[j] = true;
					blocks[line][column] = j;
					dfs(line, column + 1);
					book[j] = false;
				}
			}
		}
	}
	
	public static boolean check() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				if (blocks[i][j] > blocks[i + 1][j] || blocks[i][j] > blocks[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
