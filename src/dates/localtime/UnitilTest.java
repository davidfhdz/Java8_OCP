package dates.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UnitilTest {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime earlierTime = LocalTime.of(8, 30).withMinute(now.getMinute());
		System.out.println(earlierTime);
		LocalTime laterTime = LocalTime.of(12, 30).withMinute(now.getMinute());
		System.out.println(laterTime);
		long timePassed = now.until(earlierTime, ChronoUnit.HOURS);
		long timeToPass = now.until(laterTime, ChronoUnit.HOURS);

		System.out.println(timePassed + " " + timeToPass);
	}

}
