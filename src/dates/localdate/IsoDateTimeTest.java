package dates.localdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate Time must be in the format YYYY-MM-DDThh:mm:ss
 * @author r.paredes.bernal
 *
 */
public class IsoDateTimeTest {

	public static void main(String[] args) {
		//LocalDateTime dateTime = LocalDateTime.parse("2017-01-01");
		LocalDateTime dateTime = LocalDateTime.parse("2017-01-01T12:00:00");

		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
	}

}
