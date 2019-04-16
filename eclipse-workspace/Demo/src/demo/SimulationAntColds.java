package demo;

import java.util.ArrayList;
import java.util.Scanner;

//���ϸ�ðģ�ⷨ
public class SimulationAntColds {
	
	//����һ������
	static class Ant {
		public int x;		//���ϵ�λ��
		public boolean isSick;		//�ǲ��Ǹ�ð������
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//���ϵ�����
		
		ArrayList<Ant> ants = new ArrayList<Ant>();		//����һ��Ant�͵�ArrayList�����ÿһֻ���ϵ�λ��, �����״̬
		
		//Ϊ���ϵ�λ��, �����״̬��ֵ, ��λ�ó˶�, �ж��ǲ��ǵ�һֻ����, ����ǵ�һֻ���Ͼ��Ǹ�ð������
		for (int i = 0; i < n; i++) {
			int realX = sc.nextInt();
			Ant temp = new Ant();
			temp.x = realX * 2;
			temp.isSick = (i == 0) ? true : false;
			ants.add(temp);		//����ֵ��ɵ�������ӵ�ants��������
		}
		
		sc.close();
		
		int counter = 0;		//��¼�������ϵ�����
		while (!ants.isEmpty()) {		//��ѭ��, ֱ������Ϊ��
			
			//ģ��������ǰ��
			for (int i = 0; i < ants.size(); i++) {
				ants.get(i).x++;
			}
			
			//ģ�������ǲ����ߵ���ͷ, Ϊ�����±��쳣, ������ϱ�ɾ��, i��������
			for (int i = 0; i < ants.size(); ) {
				Ant a = ants.get(i);		//�ݴ浱ǰ����
				
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
