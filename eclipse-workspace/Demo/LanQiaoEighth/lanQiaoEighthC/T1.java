package lanQiaoEighthC;

import java.math.BigDecimal;

public class T1 {
	
	static char[] week = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	
	public static void main(String[] args) {
		BigDecimal date = new BigDecimal("651764141421415346185");
		System.out.println(
			week[Integer.parseInt(date.remainder(new BigDecimal("9")).toString()) - 1]);
	}
}
