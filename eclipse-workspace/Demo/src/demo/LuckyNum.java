package demo;

/*
	第几个幸运数
	
	到x星球旅行的游客都被发给一个整数，作为游客编号。
	x星的国王有个怪癖，他只喜欢数字3,5和7。
	国王规定，游客的编号如果只含有因子：3,5,7,就可以获得一份奖品。
	我们来看前10个幸运数字是：
	3 5 7 9 15 21 25 27 35 45
	因而第11个幸运数字是：49
	小明领到了一个幸运数字 59084709587505，他去领奖的时候，人家要求他准确地说出这是第几个幸运数字，否则领不到奖品。
	请你帮小明计算一下，59084709587505是第几个幸运数字。
	
	解题思路: 
		组装幸运数， 3 * 5 * 7
		如果a的x次方等于N（a>0，且a不等于1），那么数x叫做以a为底N的对数（logarithm）
		Math.pow(3, a) * Math.pow(5, b) * Math.pow(7, c);
*/
public class LuckyNum {
	public static void main(String[] args) { 
		int serialNum = 0;
		for (int a = 0; Math.pow(3, a) < 59084709587505l; a++) {
			for (int b = 0; Math.pow(5, b) < 59084709587505l; b++) {
				for (int c = 0; Math.pow(7, c) < 59084709587505l; c++) {
					double luckyNum = Math.pow(3, a) * Math.pow(5, b) * Math.pow(7, c);
					if (luckyNum < 59084709587505l) {
						serialNum++;
					}
				}
			}
		}
		System.out.println(serialNum);
	}
}
