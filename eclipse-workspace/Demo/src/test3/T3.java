package test3;

public class T3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			int counter = 0;
			long temp = i;
			while (!isPalin(temp)) {
				if (counter > 30) {
					System.out.println(i);
					return;
				}
				String source = temp + "";
				String after = "";
				for (int j = source.length() - 1; j >= 0; j--) {
					after += source.charAt(j);
				}
				temp += Long.parseLong(after);
				counter++;
			}
		}
	}
	
	public static boolean isPalin(long parameter) {
		String temp = parameter + "";
		int length = temp.length();
		char[] charArr = new char[length / 2];
		int mid = length / 2 - 1;
		int top = 0;
		for (int i = 0; i <= mid; i++) {
			charArr[i] = temp.charAt(i);
			top++;
		}
		int next = 0;
		if (length % 2 == 0) {
			next = mid + 1;
		} else {
			next = mid + 2;
		}
		for (int i = next; i < length; i++) {
			if (temp.charAt(i) != charArr[--top]) {
				return false;
			}
		}
		
		if (top == 0) {
			return true;
		}
		return false;
	}
}
