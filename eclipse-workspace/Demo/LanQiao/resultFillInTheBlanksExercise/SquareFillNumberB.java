package resultFillInTheBlanksExercise;


/*
��������
���µ�10������
    +---+---+---+
    |   |   |   |
+---+---+---+---+
|   |   |   |   |
+---+---+---+---+
|   |   |   |
+---+---+---+
�������ʾ�����⣬Ҳ���Բο���ͼ1.jpg����
����0~9�����֡�Ҫ���������������ֲ������ڡ�
�����ҡ����¡��ԽǶ������ڣ�
һ���ж����ֿ��ܵ�����������
����д��ʾ������Ŀ��������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class SquareFillNumberB {
	
	static int counter = 0;
	static boolean[] book = new boolean[10];
	static int[][] answer = new int[3][4];
	
	public static void main(String[] args) {
		answer[0][0] = 233;
		answer[2][3] = 233;
		dfs(0, 1);
		System.out.println(counter);
	}
	
	public static void dfs(int line, int column) {
		if (line == 2 && column == 3) {
			counter++;
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (column == 3 && !book[i]) {
				answer[line][column] = i;
				if (check(line, column)) {
					book[i] = true;
					dfs(line + 1, 0);
					book[i] = false;
				}
			} else if (!book[i]) {
				answer[line][column] = i;
				if (check(line, column)) {
					book[i] = true;
					dfs(line, column + 1);
					book[i] = false;
				}
			}
		}
	}
	
	public static boolean check(int line, int column) {
		if ((line == 0 && column == 0) || (line == 2 && column == 3)) {
			return false;
		} else if (line == 0) {		//If line is zero, only check left.
			if (Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {
				return false;
			}
		} else if (column == 0) {	//If columln is zero, check up and up right.
			if (Math.abs(answer[line][column] - answer[line - 1][column]) == 1
					|| Math.abs(answer[line][column] - answer[line - 1][column + 1]) == 1) {
				return false;
			}
		} else if (column == 3 && line != 0) {	//If column is three and line isn't zero, check up left, up and left
			if (Math.abs(answer[line][column] - answer[line - 1][column - 1]) == 1			//up left
					|| Math.abs(answer[line][column] - answer[line - 1][column]) == 1		//up
					|| Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {	//left
				return false;
			}
		} else { 					//Else check four position, up left, up, up right and left
			if (Math.abs(answer[line][column] - answer[line - 1][column - 1]) == 1			//up left
					|| Math.abs(answer[line][column] - answer[line - 1][column]) == 1		//up
					|| Math.abs(answer[line][column] - answer[line - 1][column + 1]) == 1	//up right
					|| Math.abs(answer[line][column] - answer[line][column - 1]) == 1) {	//lift
				return false;
			}
		}
		
		return true;
	}
}
