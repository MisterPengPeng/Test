package lanQiaoSixthFinalsC;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String data = in.next();
		int step = in.nextInt();
		
		in.close();
		
		f(data, step);
	}
	
	public static void f(String data, int step) {
		if (step == 0) {
			System.out.println(data);
			return;
		}
		
		StringBuilder temp = new StringBuilder(data);
		
		for (int i = 0; i < temp.length();) {
			int numLength = 1;
			while (i + numLength < temp.length()
					&& temp.charAt(i + numLength) == temp.charAt(i)) {
				numLength++;
			}
			if (i + 1 < temp.length() && numLength > 1) {
				temp.delete(i + 1 > i + numLength - 1 ? i : i + 1, i + numLength);
			}
			temp.insert(i, numLength + "");
			i += 2;
		}
		
		f(temp.toString(), step - 1);
		return;
	}
}
