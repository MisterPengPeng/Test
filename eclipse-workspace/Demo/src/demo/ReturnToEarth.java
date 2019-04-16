package demo;

/*
	哪天返回
	
	小明被不明势力劫持。后莫名其妙被扔到x星站再无问津。小明得知每天都有飞船飞往地球，但需要108元的船票，而他却身无分文。
	他决定在x星战打工。好心的老板答应包食宿，第1天给他1元钱。
	并且，以后的每一天都比前一天多2元钱，直到他有足够的钱买票。
	
	请计算一下，小明在第几天就能凑够108元，返回地球。
*/
public class ReturnToEarth {
	public static void main(String[] args) {
		int wages = 1;
		int money = 0;
		for (int day = 1; ; day++) {
			money += wages;
			wages += 2;
			if (money >= 108) {
				System.out.println(day);
				break;
			}
		}
	}
}
