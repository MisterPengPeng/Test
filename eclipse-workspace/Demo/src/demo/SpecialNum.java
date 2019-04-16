package demo;


/*
特殊的数字(水仙花数)
	问题描述
		153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。
		编程求所有满足这种条件的三位十进制数。
		输出格式按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
*/
public class SpecialNum {
	public static void main(String[] args) {
		for (int specialNum = 153; specialNum < 1000; specialNum++) {
			String strSpeNum = specialNum + "";
			int judgeSpeNum = (int)Math.pow(strSpeNum.charAt(0) - 48, 3) + (int)Math.pow(strSpeNum.charAt(1) - 48, 3) + (int)Math.pow(strSpeNum.charAt(2) - 48, 3);
			if (specialNum == judgeSpeNum) {
				System.out.println(specialNum);
			}
		}
	}
}