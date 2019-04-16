package test4;

import java.util.LinkedList;
import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		LinkedList<char[][]> data = new LinkedList<char[][]>();
		while (true) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (n == 0 && m == 0) {
				in.close();
				break;
			}
			char[][] temp = new char[n][m];
			for (int i = 0; i < n; i++) {
				temp[i] = in.next().toCharArray();
			}
			data.add(temp);
		}
		
		int number = 1;
		while (!data.isEmpty()) {
			char[][] temp = data.remove();
			for (int i = 0; i < temp.length; i++) {
				for (int j = 0; j < temp[i].length; j++) {
					if (temp[i][j] == '.') {
						findBoom(temp, i, j);
					}
				}
			}
			System.out.println("Field #" + number + ":");
			for (char[] a : temp) {
				for (char b : a) {
					System.out.print(b);
				}
				System.out.println();
			}
			System.out.println();
			number++;
		}
	}

	public static void findBoom(char[][] temp, int i, int j) {
		if (0 < i && i < temp.length - 1 && 0 < j && j < temp[i].length - 1) {
			char counter = '0';
			if (temp[i - 1][j] == '*') {
				counter++;
			}
			if (temp[i - 1][j - 1] == '*') {
				counter++;
			}
			if (temp[i - 1][j + 1] == '*') {
				counter++;
			}
			if (temp[i][j + 1] == '*') {
				counter++;
			}
			if (temp[i][j - 1] == '*') {
				counter++;
			}
			if (temp[i + 1][j] == '*') {
				counter++;
			}
			if (temp[i + 1][j - 1] == '*') {
				counter++;
			}
			if (temp[i + 1][j + 1] == '*') {
				counter++;
			}
			temp[i][j] = counter;
			return;
		}
		if (i == 0) {
			char counter = '0';
			if (j == 0) {
				if (temp[i][j + 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j + 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j] == '*') {
					counter++;
				}
			} else if (j == temp[i].length - 1) {
				if (temp[i][j - 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j - 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j] == '*') {
					counter++;
				}
			} else {
				if (temp[i][j + 1] == '*') {
					counter++;
				}
				if (temp[i][j - 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j] == '*') {
					counter++;
				}
				if (temp[i + 1][j - 1] == '*') {
					counter++;
				}
				if (temp[i + 1][j + 1] == '*') {
					counter++;
				}
			}
			temp[i][j] = counter;
			return;
		}
		if (i == temp.length - 1) {
			char counter = '0';
			if (j == 0) {
				if (temp[i - 1][j] == '*') {
					counter++;
				}
				if (temp[i - 1][j + 1] == '*') {
					counter++;
				}
				if (temp[i][j + 1] == '*') {
					counter++;
				}
			} else if (j == temp[i].length - 1) {
				if (temp[i - 1][j] == '*') {
					counter++;
				}
				if (temp[i - 1][j - 1] == '*') {
					counter++;
				}
				if (temp[i][j - 1] == '*') {
					counter++;
				}
			} else {
				if (temp[i][j + 1] == '*') {
					counter++;
				}
				if (temp[i][j - 1] == '*') {
					counter++;
				}
				if (temp[i - 1][j] == '*') {
					counter++;
				}
				if (temp[i - 1][j - 1] == '*') {
					counter++;
				}
				if (temp[i - 1][j + 1] == '*') {
					counter++;
				}
			}
			temp[i][j] = counter;
			return;
		}
		if (j == 0) {
			char counter = '0';
			if (temp[i - 1][j] == '*') {
				counter++;
			}
			if (temp[i + 1][j] == '*') {
				counter++;
			}
			if (temp[i - 1][j + 1] == '*') {
				counter++;
			}
			if (temp[i + 1][j + 1] == '*') {
				counter++;
			}
			if (temp[i][j + 1] == '*') {
				counter++;
			}
			temp[i][j] = counter;
			return;
		}
		if (j == temp[i].length - 1) {
			char counter = '0';
			if (temp[i - 1][j] == '*') {
				counter++;
			}
			if (temp[i + 1][j] == '*') {
				counter++;
			}
			if (temp[i - 1][j - 1] == '*') {
				counter++;
			}
			if (temp[i + 1][j - 1] == '*') {
				counter++;
			}
			if (temp[i][j - 1] == '*') {
				counter++;
			}
			temp[i][j] = counter;
			return;
		}
	}
	
	/*
	 * Field #1:
01*102*200
011214*300
1113*6*300
*12****200
222*432111
*22332101*
23*2**1011
1*33232100
23*101*100
1*21011100

Field #2:
1*3**201*1
24*5*20222
1**41112*2
13*2001*3*
0222001121
01*1000122
12110002**
*1000002*3
1101110233
0001*101**

Field #3:
111*11122*
*21112*3*3
*42212*32*
*4**112221
2*44323*42
112**2****
0124332443
01*3*313*2
0113*3*5*3
0001122**2

Field #4:
1**20001*2
24*310023*
*22*2102*4
1113*423**
0113***23*
13*3232111
1**2001121
1344322*2*
02****4342
02***4**2*

Field #5:
123**101*1
1**4333321
24*32***10
1*3*223210
1232100000
01*1000000
2321011211
**1113*3*1
*543*5*411
2***3**200

Field #6:
**10001110
2210002*20
0011114*30
012*34**30
01*3****20
0112234431
1212111**1
*4*3*22221
2**43*2111
1222*3*11*

Field #7:
001*100000
0011111100
122212*100
2**2*21100
2*44431111
223***11*1
1*34*31111
12*2121111
011101*33*
0000012**2

Field #8:
*312*11*21
*4*211112*
*422012232
24*201**3*
*3*201223*
2321000122
1*221101*1
12*2*10122
121222102*
*1001*102*

Field #9:
0001*3*3**
000113*433
00011224*2
1101*22**3
*2012*223*
*200234221
33101***10
**10246420
22212***21
001*2233*1

Field #10:
1*21122100
23*12**210
*2112*5*10
110023*321
11112*22*1
*23*422343
2*3**11***
223233335*
1*101**35*
1110123***
*/
}
