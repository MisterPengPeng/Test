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
 * 	��	 |_|_|_|_|_|   |
 * 	+x	 |_|_|_|_|_|  /
 *		 |_|_|_|_|_| /
 *		 |_|_|_|_|_|/
 *		�J
 *	  +z	  ��
 * 			  +y
��������
	����һ��Air Conditioning Machinery��˾��ACM���ļ�����Ա������װ�յ��ģ���
	���ҵ��ǣ����㵽һ���ͻ�����ȥװ�յ��ܵ���ʱ���㷢����Ĺܵ������ˡ���ֻʣ6���ܵ������Ƕ���ͬһ�ͺŵ���ܡ�
	�������ָ���Ŀռ���װһ���ܵ����ռ���һ�������壬���еıߵĶ��ǵ�λ���ȵ�����������������Ϊһ���ռ�����˵�λ�����塣
	ÿ�����ռ��ǡ��4����λ�������壬����ͼ1��ʾ��������ܲ����غ���ͬһ����λ�������ϡ�ÿ�����ֻ��2���ڣ�������ͼ��1���Ի�ɫ��ʾ��
	����԰�2����ܽӳ�һ�����Ĺ��ӣ��������ǲ��ó��������Ŀռ䡣ͼ2��ʾ������һ�ֶԽӷ�ʽ����������ǽ�ͨ��ںͳ��ڡ�
	��ںͳ����ڸ����ռ��������ϣ��͵�λ��������룬��ͼ3��ʾ��Ϊ�˼��ٿ�֧������������ٵ���ܽ��������⡣

�����ʽ
	�����ж��case��ÿ��case 1�а���11���ÿո������ֵ��
	ǰ3��������(xmax,ymax,zmax)��ʾ����������ĳ���ߡ��������ڵ�ÿ����λ������������(x,y,z)��ʾ������1��x��xmax, 1��y��ymax, 1��z��zmax��
	xmax,ymax,zmax��Ϊ���Ҳ�����20��
	������3����������ʾ������ڵ�λ����������ꡣ
	��������2���ַ����ɵ��ַ�������ʾ����ĳ���
	����Ϊ���µ�һ�֣�+x,-x,+y,-y,+z,-z��������˵�����Ϊ+y���������ķ���Ϊy�������������������y�Ḻ����
	������3����������ʾ�������ڵ�λ����������ꡣ
	�����2���ַ����ɵ��ַ�������ʾ�����ĳ���
	����Ϊ���µ�һ�֣�+x,-x,+y,-y,+z,-z��������˵�����Ϊ+y�������ȥ�ķ���Ϊy�����������Գ�������y��������(ע��������Ĳ�֮ͬ����)
	�����ļ������һ����1��0����ʾ�����ļ��Ľ�����
�����ʽ
	����ÿ��case�����case��ţ���1��ʼ�����������ͨ�ܵ������Ҳ�����ָ���ռ䣬������Ҫ��������������������6�������ɣ������Impossible�����������
��������
5 4 3 3 1 1 +z 5 4 3 +x
5 4 3 3 1 1 +z 1 2 3 -x
0
�������
Case 1: 2
Case 2: Impossible
���ݹ�ģ��Լ��
����ÿ������case��������10������������ʽ��*/
public class AirConditioningMachinery {
	
	//������
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
	
	//���
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
	
	//����
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
