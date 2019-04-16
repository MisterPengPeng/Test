package demo;

import java.util.Arrays;
import java.util.Scanner;

/*
** 次数差 ** 2018年C/C++ C组。评分系统暂未收录

x星球有26只球队，分别用a~z的26个字母代表。他们总是不停地比赛。

在某一赛段，哪个球队获胜了，就记录下代表它的字母，这样就形成一个长长的串。
国王总是询问：获胜次数最多的和获胜次数最少的有多大差距？（当然，他不关心那些一次也没获胜的，认为他们在怠工罢了）

输入，一个串，表示球队获胜情况（保证串的长度<1000）

要求输出一个数字，表示出现次数最多的字母比出现次数最少的字母多了多少次。

比如：
输入：
abaabcaa

则程序应该输出：
4

解释：a出现5次，最多；c出现1次，最少。5-1=4

再比如：
输入：
bbccccddaaaacccc

程序应该输出：
6

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms

请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
*/
public class FrequencyDifference {
	public static void main(String[] args) {
		int[] frequency = new int[26];
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		for (int i = 0; i < input.length(); i++) {
			frequency[input.charAt(i) - 97]++;
		}
		
		Arrays.sort(frequency);
		int max = frequency.length - 1;
		int min = frequency.length - 1;
		for (int i = frequency.length - 1; i >= 0; i--) {
			if (frequency[i - 1] == 0) {
				break;
			} else {
				min--;
			}
		}
		
		int result = frequency[max] - frequency[min];
		System.out.println(result);
	}
}
