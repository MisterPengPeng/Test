package demo;


/*
1. 猴子分香蕉
5只猴子是好朋友，在海边的椰子树上睡着了。这期间，有商船把一大堆香蕉忘记在沙滩上离去。
第1只猴子醒来，把香蕉均分成5堆，还剩下1个，就吃掉并把自己的一份藏起来继续睡觉。
第2只猴子醒来，重新把香蕉均分成5堆，还剩下2个，就吃掉并把自己的一份藏起来继续睡觉。
第3只猴子醒来，重新把香蕉均分成5堆，还剩下3个，就吃掉并把自己的一份藏起来继续睡觉。
第4只猴子醒来，重新把香蕉均分成5堆，还剩下4个，就吃掉并把自己的一份藏起来继续睡觉。
第5只猴子醒来，重新把香蕉均分成5堆，哈哈，正好不剩！
请计算一开始最少有多少个香蕉。
*/
public class MonkeyShareBanana {
	public static void main(String[] args) {
		int banana = 5;
		while (true) {
			if (banana % 5 == 1 && banana >= 5) {
				int first = banana - ((banana - 1) / 5) - 1;
				if (first % 5 == 2 && first >= 5) {
					int second = first - ((first - 2) / 5) - 2;
					if (second % 5 == 3 && second >= 5) {
						int third = second - ((second - 3) / 5) - 3;
						if (third % 5 == 4 && third >= 5) {
							int fourth = third - ((third - 4) / 5) - 4;
							if (fourth % 5 == 0 && fourth >= 5) {
								System.out.println(banana);
								break;
							}
						}
					}
				}
			}
			banana++;
		}
	}
}
