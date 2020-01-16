package dates.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCorrectSDF2 {
	public static void main(String[] args) {
		
		String sDate1="31/Dec/2015";  
		Date date1;
		try {
			date1 = new SimpleDateFormat("dd/MMM/yyyy").parse(sDate1);
			// mm = minute
			System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(date1));
			// DD = Day of year
			System.out.println(new SimpleDateFormat("dd-MMM-uuuu").format(date1));
			// M = Month of year and d = day of month
			System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(date1));
			// Y = Week year
			System.out.println(new SimpleDateFormat("d-MMM-yyyy").format(date1));
			// MMMM = complete month
			System.out.println(new SimpleDateFormat("d-MMMM-yyyy").format(date1));
			System.out.println(new SimpleDateFormat("d-MMMMMM-yyyy").format(date1));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
