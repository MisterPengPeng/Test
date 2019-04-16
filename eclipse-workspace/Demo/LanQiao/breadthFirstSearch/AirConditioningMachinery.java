package breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 			___________
 * 		   /_/_/_/_/_ /|
 * 		  /_/_/_/_/_ / |
 * 		 /_/_/_/_/_ /  |
 * 	→	 |_|_|_|_|_|   |
 * 	+x	 |_|_|_|_|_|  /
 *		 |_|_|_|_|_| /
 *		 |_|_|_|_|_|/
 *		↗
 *	  +z	  ↑
 * 			  +y
问题描述
	你是一个Air Conditioning Machinery公司（ACM）的技术人员（就是装空调的）。
	不幸的是，当你到一个客户那里去装空调管道的时候，你发现你的管道不够了。你只剩6条管道，他们都是同一型号的弯管。
	你必须在指定的空间内装一个管道。空间是一个长方体，所有的边的都是单位长度的整倍数，可以想象为一个空间堆满了单位正方体。
	每个弯管占用恰好4个单位的正方体，如下图1所示。两个弯管不能重合在同一个单位正方体上。每个弯管只有2个口，它们在图形1中以灰色显示。
	你可以把2个弯管接成一根长的管子，但是它们不得超过给定的空间。图2表示了其中一种对接方式。你的任务是接通入口和出口。
	入口和出口在给定空间的外表面上，和单位正方体对齐，如图3所示。为了减少开支，你必须用最少的弯管解决这个问题。

输入格式
	输入有多个case，每个case 1行包含11个用空格隔开的值。
	前3个是整数(xmax,ymax,zmax)表示给定长方体的长宽高。长方体内的每个单位正方体用坐标(x,y,z)表示，其中1≤x≤xmax, 1≤y≤ymax, 1≤z≤zmax。
	xmax,ymax,zmax均为正且不大于20。
	接下来3个整数，表示入口所在单位立方体的坐标。
	接下来是2个字符构成的字符串，表示进入的朝向。
	可能为以下的一种：+x,-x,+y,-y,+z,-z。举例来说，如果为+y，代表进入的方向为y轴正方向，所以入口面向y轴负方向。
	接下来3个整数，表示出口所在单位立方体的坐标。
	最后是2个字符构成的字符串，表示流出的朝向。
	可能为以下的一种：+x,-x,+y,-y,+z,-z。举例来说，如果为+y，代表出去的方向为y轴正方向，所以出口面向y轴正方向。(注意与上面的不同之处。)
	输入文件的最后一行有1个0，表示输入文件的结束。
输出格式
	对于每个case，输出case编号（从1开始），并输出接通管道，并且不超过指定空间，最少需要的弯管数。如果不可能用6个弯管完成，则输出Impossible。详见样例。
样例输入
5 4 3 3 1 1 +z 5 4 3 +x
5 4 3 3 1 1 +z 1 2 3 -x
0
样例输出
Case 1: 2
Case 2: Impossible
数据规模和约定
　　每组数据case数不超过10，其余见输入格式。*/
public class AirConditioningMachinery {
	
	//长方体
	static class Cuboid {
		int x;
		int y;
		int z;
		Entrance entrance;
		Exit exit;
		
		public Cuboid(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.entrance = new Entrance();
			this.exit = new Exit();
		}
		
		public Cuboid() {
			this.entrance = new Entrance();
			this.exit = new Exit();
		}
	}
	
	//入口
	static class Entrance {
		int x;
		int y;
		int z;
		String direction;
		
		public Entrance(int x, int y, int z, String direction) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.direction = direction;
		}
		
		public Entrance() {
			
		}
	}
	
	//出口
	static class Exit {
		int x;
		int y;
		int z;
		String direction;
		
		public Exit(int x, int y, int z, String direction) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.direction = direction;
		}
		
		public Exit() {
			
		}
	}
	
	static ArrayList<Cuboid> cuboids = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int check = scanner.nextInt();
			if (check == 0) {
				break;
			}
			Cuboid cuboid = new Cuboid();
			cuboid.x = check;
			cuboid.y = scanner.nextInt();
			cuboid.z = scanner.nextInt();
			cuboid.entrance.x = scanner.nextInt();
			cuboid.entrance.y = scanner.nextInt();
			cuboid.entrance.z = scanner.nextInt();
			cuboid.entrance.direction = scanner.next();
			cuboid.exit.x = scanner.nextInt();
			cuboid.exit.y = scanner.nextInt();
			cuboid.exit.z = scanner.nextInt();
			cuboid.exit.direction = scanner.next();
			cuboids.add(cuboid);
		}
		
		scanner.close();
		
		Queue<Cuboid> queue = new LinkedList<Cuboid>();
		queue.add(cuboids.remove(0));
		
		while (!queue.isEmpty()) {
			
		}
	}
}
