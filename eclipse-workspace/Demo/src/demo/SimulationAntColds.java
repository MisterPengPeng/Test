package demo;

import java.util.ArrayList;
import java.util.Scanner;

//蚂蚁感冒模拟法
public class SimulationAntColds {
	
	//定义一个蚂蚁
	static class Ant {
		public int x;		//蚂蚁的位置
		public boolean isSick;		//是不是感冒的蚂蚁
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//蚂蚁的数量
		
		ArrayList<Ant> ants = new ArrayList<Ant>();		//创建一个Ant型的ArrayList来存放每一只蚂蚁的位置, 方向和状态
		
		//为蚂蚁的位置, 方向和状态赋值, 将位置乘二, 判断是不是第一只蚂蚁, 如果是第一只蚂蚁就是感冒的蚂蚁
		for (int i = 0; i < n; i++) {
			int realX = sc.nextInt();
			Ant temp = new Ant();
			temp.x = realX * 2;
			temp.isSick = (i == 0) ? true : false;
			ants.add(temp);		//将赋值完成的蚂蚁添加到ants数组里面
		}
		
		sc.close();
		
		int counter = 0;		//记录生病蚂蚁的数量
		while (!ants.isEmpty()) {		//死循环, 直到数组为空
			
			//模拟蚂蚁向前走
			for (int i = 0; i < ants.size(); i++) {
				ants.get(i).x++;
			}
			
			//模拟蚂蚁是不是走到尽头, 为避免下标异常, 如果蚂蚁被删除, i不会自增
			for (int i = 0; i < ants.size(); ) {
				Ant a = ants.get(i);		//暂存当前蚂蚁
				
				if (a.x == 0 || a.x == 200) {
					if (a.isSick) {
						counter++;
					}
					ants.remove(i);
				} else {
					i++;
				}
			}
			
			for (int i = 0; i < ants.size(); i++) {
				Ant a = ants.get(i);
				for (int j = i + 1; j < ants.size(); j++) {
					Ant b = ants.get(j);
					if (Math.abs(a.x) == Math.abs(b.x)) {
						if (a.isSick || b.isSick) {
							a.isSick = true;
							b.isSick = true;
						}
						a.x = -a.x;
						b.x = -b.x;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
