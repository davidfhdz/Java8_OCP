package dates.simpledateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * d = day 
 * MMM = Month in 3 letters
 * yy = year in 2 digits
 * ' = scape char for regular expresions
 * @author r.paredes.bernal
 *
 */
public class TestEscapeCharacter {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("d MMM ''yy");
		System.out.println( dateFormat.format(new Date(0)));
	}
}
