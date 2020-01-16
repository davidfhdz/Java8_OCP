package dates.localdate;

import java.time.Duration;
import java.time.Period;

/**
 * Duration.ofDays convert days to hours
 * @author r.paredes.bernal
 *
 */
public class PeriodDurationTest {

	public static void main(String[] args) {
		Period period = Period.ofDays(30);
		Duration duration = Duration.ofDays(30);
		System.out.println(period + " " + duration);
	}

}
