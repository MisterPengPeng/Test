package program;

import java.util.Scanner;

/*
冰雹数
任意给定一个正整数N，
如果是偶数，执行： N / 2
如果是奇数，执行： N * 3 + 1
生成的新的数字再执行同样的动作，循环往复。
通过观察发现，这个数字会一会儿上升到很高，
一会儿又降落下来。
就这样起起落落的，但最终必会落到“1”
这有点像小冰雹粒子在冰雹云中翻滚增长的样子。
比如N=9
9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
可以看到，N=9的时候，这个“小冰雹”最高冲到了52这个高度。
输入格式：
一个正整数N（N<1000000）
输出格式：
一个正整数，表示不大于N的数字，经过冰雹数变换过程中，最高冲到了多少。
例如，输入：
10
程序应该输出：
52
再例如，输入：
100
程序应该输出：
9232
资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms
请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。*/
public class HailNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		scanner.close();
		
		int maxNum = 0;
		for (int i = 1; i <= N; i++) {
			int temp = i;
			while (temp != 1) {
				if (temp > maxNum) {
					maxNum = temp;
				}
				if (temp % 2 == 0) {
					temp /= 2;
				} else {
					temp = temp * 3 + 1;
				}
			}
		}
		
		System.out.println(maxNum);
	}
}
