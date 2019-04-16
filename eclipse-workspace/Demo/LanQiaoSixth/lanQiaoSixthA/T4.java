package lanQiaoSixthA;

import java.util.Vector;

public class T4 {
	public static int f(int n, int m) {
		n = n % m;
		Vector<Integer> v = new Vector<Integer>();

		for (;;) {
			v.add(n);
			n *= 10;
			n = n % m;
			if (n == 0)
				return 0;
			if (v.indexOf(n) >= 0)
				return v.size() - v.indexOf(n); // МоїХ
		}
	}
	
	public static void main(String[] args) {
		System.out.println(f(11, 13));
	}
}
