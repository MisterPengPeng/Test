package lanQiaoEighthFianlsB;

//166666716

public class T2 {

	static char[][] data = new char[20][38];
	static long times = 50l;

	public static void main(String[] args) {
		String zero = "......................................";
		String one = ".........................X............";
		String two = ".......................X.X............";
		String three = ".............XX......XX............XX.";
		String four = "............X...X....XX............XX.";
		String five = ".XX........X.....X...XX...............";
		String six = ".XX........X...X.XX....X.X............";
		String seven = "...........X.....X.......X............";
		String eight = "............X...X.....................";
		String nine = ".............XX.......................";
		String ten = "......................................";

		data[0] = zero.toCharArray();
		data[1] = one.toCharArray();
		data[2] = two.toCharArray();
		data[3] = three.toCharArray();
		data[4] = four.toCharArray();
		data[5] = five.toCharArray();
		data[6] = six.toCharArray();
		data[7] = seven.toCharArray();
		data[8] = eight.toCharArray();
		data[9] = nine.toCharArray();
		data[10] = ten.toCharArray();
		data[11] = ten.toCharArray();
		data[12] = ten.toCharArray();
		data[13] = ten.toCharArray();
		data[14] = ten.toCharArray();
		data[15] = ten.toCharArray();
		data[16] = ten.toCharArray();
		data[17] = ten.toCharArray();
		data[18] = ten.toCharArray();
		data[19] = ten.toCharArray();
		
		print(data);
		f(times);
	}

	public static void f(long step) {
		if (step <= 0) {
			return;
		}
		
		char[][] temp = copyCharArr(data);

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				if (temp[i][j] == '.') {
					changeDeath(temp, i, j);
				} else if (temp[i][j] == 'X') {
					changeAlive(temp, i, j);
				}
			}
		}
		
		System.out.println(times - step + 1 + ": ");
		print(data);
		f(step - 1);
	}

	private static void changeAlive(char[][] array, int i, int j) {
		int anotherCell = findCells(array, i, j);
		if (2 > anotherCell || anotherCell > 3) {
			data[i][j] = '.';
		}
	}

	private static void changeDeath(char[][] array, int i, int j) {
		int anotherCell = findCells(array, i, j);
		if (anotherCell == 3) {
			data[i][j] = 'X';
		}
	}

	private static int findCells(char[][] array, int i, int j) {
		int counter = 0;
		
		for (int temp = j - 1; temp <= j + 1; temp++) {
			if (i - 1 >= 0 
					&& temp >= 0 && temp < array[i].length 
					&& array[i - 1][temp] == 'X') {
				counter++;
			}
			
			if (temp >= 0 && temp < array[i].length 
					&& temp != j
					&& array[i][temp] == 'X') {
				counter++;
			}
			
			if (i + 1 < array.length
					&& temp >= 0 && temp < array[i].length 
					&& array[i + 1][temp] == 'X') {
				counter++;
			}
		}
		
		return counter;
	}

	private static char[][] copyCharArr(char[][] data) {
		char[][] temp = new char[data.length][];
		for (int i = 0; i < data.length; i++) {
			temp[i] = new char[data[i].length];
			for (int j = 0; j < data[i].length; j++) {
				temp[i][j] = data[i][j];
			}
		}
		return temp;
	}

	public static void print(char[][] data) {
		for (char[] a : data) {
			for (char b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
	}
}
