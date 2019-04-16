package lanQiaoSixthA;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T2 {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2014, 10, 9);
		c.add(Calendar.DATE, 1000);
		Date date = c.getTime();
		System.out.println(dateFormat.format(date));
	}
}
