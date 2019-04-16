package lanQiaoSeventhFianlsC;

import java.util.Iterator;
import java.util.TreeSet;

public class T1 {
	
	static TreeSet<String> book = new TreeSet<String>();
	
	public static void main(String[] args) {
		for (int i = 4; i <= 100; i++) {
			String temp = "";
			int pow = i * i;
			temp += (pow / 10) % 10;
			temp += pow % 10;
			book.add(temp);
		}
		System.out.println(book.size());
		Iterator<String> it = book.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
