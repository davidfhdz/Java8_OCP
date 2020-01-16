package dates.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * ISO_DATE or default date must be yyyy-dd-dd
 * @author r.paredes.bernal
 *
 */
public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1970,1,1);
		
		LocalTime now = LocalTime.now();
		LocalDate d2 = LocalDate.parse("1970-1-1", DateTimeFormatter.ISO_DATE);
		LocalDate d3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(1970);
		System.out.println(d1.toString().equals(d2.toString()) && d2.toString().equals(d3.toString()));
		
	}

}
