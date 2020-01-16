package dates.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCorrectSDF {
	public static void main(String[] args) {
		// mm = minute
		System.out.println(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
		// DD = Day of year
		System.out.println(new SimpleDateFormat("yyyy-mm-DD").format(new Date()));
		// M = Month of year and d = day of month
		System.out.println(new SimpleDateFormat("YY-MM-dd").format(new Date()));
		// Y = Week year
		System.out.println(new SimpleDateFormat("YY-MM-DD").format(new Date()));

	}
}
