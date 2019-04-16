package demo;


/*
** 填空题：牌型种数 **

小明被劫持到X赌城，被迫与其他3人玩牌。
一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
这时，小明脑子里突然冒出一个问题：

如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
*/
public class CardTypeNumber {
	static int counter = 0;
	
	public static void main(String[] args) {
		CatchingCard(1, 0);
		System.out.println(counter);
	}
	
	public static void CatchingCard(int cardNum, int total) {
		for (int i = 0; i <= 4; i++) {
			if (total + i == 13) {
				counter++;
				return;
			}
			
			if (cardNum < 13) {
				CatchingCard(cardNum + 1, total + i);
			}
		}
	}
}
