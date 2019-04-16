package lanQiaoSixthFinalsB;

import java.util.Scanner;

//真尼玛的垃圾, 别人80行就写出来, 你他吗用了180行

public class T5 {

	static char[][][] table;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		table = new char[n][m][];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[i][j] = in.next().toCharArray();
			}
		}

		in.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (table[i][j].length >= 12) {
					String data = toString(table[i][j]);
					String function = "" + table[i][j][0] + table[i][j][1] + table[i][j][2];
					int x1 = findX1(data);
					int y1 = findY1(data);
					int x2 = findX2(data);
					int y2 = findY2(data);
					double value = function(function, x1, y1, x2, y2);
					table[i][j] = (value + "").toCharArray();
				}
			}
		}
		
		for (char[][] a : table) {
			for (char[] b : a) {
				String temp = toString(b);
				double tempDou = Double.parseDouble(temp);
				System.out.printf("%.2f ", tempDou);
			}
			System.out.println();
		}
	}

	private static double function(String function, int x1, int y1, int x2, int y2) {
		switch (function) {
		case "SUM" :
			return sum(x1, y1, x2, y2);
			
		case "AVG" :
			return avg(x1, y1, x2, y2);
			
		case "STD" :
			return std(x1, y1, x2, y2);
			
		default :
			return Double.MAX_VALUE;
		}
		
	}

	private static double sum(int x1, int y1, int x2, int y2) {
		double sum = 0;
		
		for (int i = x1 - 1; i < x2; i++) {
			for (int j = y1 - 1; j < y2; j++) {
				if (table[i][j].length >= 12) {
					String data = toString(table[i][j]);
					String function = "" + table[i][j][0] + table[i][j][1] + table[i][j][2];
					int nextX1 = findX1(data);
					int nextY1 = findY1(data);
					int nextX2 = findX2(data);
					int nextY2 = findY2(data);
					double value = function(function, nextX1, nextY1, nextX2, nextY2);
					table[i][j] = (value + "").toCharArray();
					sum += value;
				} else {
					double value = Double.parseDouble(toString(table[i][j]));
					sum += value;
				}
			}
		}
		
		return sum;
	}

	private static double avg(int x1, int y1, int x2, int y2) {
		int counter = 0;
		double sum = 0;
		
		for (int i = x1 - 1; i < x2; i++) {
			for (int j = y1 - 1; j < y2; j++) {
				counter++;
				if (table[i][j].length >= 12) {
					String data = toString(table[i][j]);
					String function = "" + table[i][j][0] + table[i][j][1] + table[i][j][2];
					int nextX1 = findX1(data);
					int nextY1 = findY1(data);
					int nextX2 = findX2(data);
					int nextY2 = findY2(data);
					double value = function(function, nextX1, nextY1, nextX2, nextY2);
					table[i][j] = (value + "").toCharArray();
					sum += value;
				} else {
					double value = Double.parseDouble(toString(table[i][j]));
					sum += value;
				}
			}
		}
		
		return sum / counter;
	}

	private static double std(int x1, int y1, int x2, int y2) {
		int counter = 0;
		double avg = avg(x1, y1, x2, y2);
		double sum = 0;
		
		for (int i = x1 - 1; i < x2; i++) {
			for (int j = y1 - 1; j < y2; j++) {
				counter++;
				if (table[i][j].length >= 12) {
					String data = toString(table[i][j]);
					String function = "" + table[i][j][0] + table[i][j][1] + table[i][j][2];
					int nextX1 = findX1(data);
					int nextY1 = findY1(data);
					int nextX2 = findX2(data);
					int nextY2 = findY2(data);
					double value = function(function, nextX1, nextY1, nextX2, nextY2);
					table[i][j] = (value + "").toCharArray();
					sum += Math.pow(value - avg, 2);
				} else {
					double value = Double.parseDouble(toString(table[i][j]));
					sum += Math.pow(value - avg, 2);
				}
			}
		}
		
		return Math.sqrt(sum / counter);
	}

	private static String toString(char[] cs) {
		String temp = "";
		for (int i = 0; i < cs.length; i++) {
			temp += cs[i];
		}
		return temp;
	}

	private static int findX1(String function) {
		int leftParenthesis = function.indexOf('(');
		int firstComma = function.indexOf(',');
		return Integer.parseInt(function.substring(leftParenthesis + 1, firstComma));
	}

	private static int findY1(String function) {
		int firstComma = function.indexOf(',');
		int colon = function.indexOf(':');
		return Integer.parseInt(function.substring(firstComma + 1, colon));
	}

	private static int findX2(String function) {
		int colon = function.indexOf(':');
		int secondComma = function.lastIndexOf(',');
		return Integer.parseInt(function.substring(colon + 1, secondComma));
	}

	private static int findY2(String function) {
		int secondComma = function.lastIndexOf(',');
		int rightParenthesis = function.indexOf(')');

		return Integer.parseInt(function.substring(secondComma + 1, rightParenthesis));
	}

}