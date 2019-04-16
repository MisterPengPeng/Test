package lanQiaoEighthFianlsB;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String command;
		BigInteger res = null;
		boolean isStart = false;
		int ope = 0;
		int PN = 10;
		in.nextLine();
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(in.nextLine());
			command = stringTokenizer.nextToken();
			if (command.equals("CHANGE")) {
				String str = stringTokenizer.nextToken();
				PN = Integer.parseInt(str);
			} else if (command.equals("EQUAL")) {
				String string = res.toString(PN).toUpperCase();
				System.out.println(string);
			} else if (command.equals("NUM")) {
				String str = stringTokenizer.nextToken();
				String num = Long.valueOf(str, PN).toString();
				if (isStart == true) {
					res = new BigInteger(num);
					isStart = false;
				} else {
					switch (ope) {
					case 1:
						res = res.add(new BigInteger(num));
						break;
					case 2:
						res = res.subtract(new BigInteger(num));
						break;
					case 3:
						res = res.divide(new BigInteger(num));
						break;
					case 4:
						res = res.multiply(new BigInteger(num));
						break;
					case 5:
						res = res.mod(new BigInteger(num));
						break;
					default:
						break;
					}
				}
			} else if (command.equals("ADD")) {
				ope = 1;
			} else if (command.equals("SUB")) {
				ope = 2;
			} else if (command.equals("DIV")) {
				ope = 3;
			} else if (command.equals("MUL")) {
				ope = 4;
			} else if (command.equals("MOD")) {
				ope = 5;
			} else if (command.equals("CLEAR")) {
				res = new BigInteger("0");
				isStart = true;
			}
		}
	}

}