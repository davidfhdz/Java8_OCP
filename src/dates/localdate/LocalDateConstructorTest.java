package dates.localdate;

import java.time.LocalDate;

public class LocalDateConstructorTest {

	public static void main(String[] args) {
		// The LocalDate constructor is private so this not possible 
		LocalDate date = new LocalDate(2017,1,1);
		
		// It's ofending the ISO Local Date Format yyyy-mm-dd 
		LocalDate date1 = LocalDate.parse("2017-1-1");
		
		LocalDate date2 = LocalDate.of(2017, 1, 1);
		
		// The month must be an enum Month.JANUARY
		LocalDate date3 = LocalDate.of(2017, "JANUARY", 1);

		// Day 1 of the year, so it's january
		LocalDate date4 = LocalDate.ofYearDay(2017, 1); 
		
	}

}
