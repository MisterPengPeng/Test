package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
	高斯日记（第4届B组C/C++预赛）
	
	大数学家高斯有个好习惯：无论如何都要记日记。
	他的日记有个与众不同的地方，他从不注明年月日，而是用一个整数代替，比如：4210。
	后来人们知道，那个整数就是日期，它表示那一天是高斯出生后的第几天。
	这或许也是个好习惯，它时时刻刻提醒着主人：日子又过去一天，还有多少时光可以用于浪费呢？高斯出生于：1777年4月30日。
	在高斯发现的一个重要定理的日记上标注着：5343，因此可算出那天是：1791年12月15日。
	
	高斯获得博士学位的那天日记上标着：8113。
	请你算出高斯获得博士学位的年月日。
	普通闰年:能被4整除但不能被100整除的年份为普通闰年。
	世纪闰年:能被400整除的为世纪闰年。
	
	    long timeStamp = 1495777335060;//直接是时间戳
		long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//这个是你要转成后的时间的格式
		String sd = sdf.format(new Date(timeStamp));   // 时间戳转换成时间
        System.out.println(sd);//打印出你要的时间
*/
public class GaussSDiary {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1777, 3, 29);
		c.add(Calendar.DAY_OF_MONTH, 8113);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(c.getTime()));
	}
}
