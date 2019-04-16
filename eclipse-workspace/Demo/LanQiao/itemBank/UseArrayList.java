package itemBank;

import java.util.ArrayList;
import java.util.Scanner;

public class UseArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		sc.close();
		
		int sum = 0;
		int averageValue = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		averageValue = sum / list.size();
		
		System.out.println(sum + " " + averageValue);
	}
}
