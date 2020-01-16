package dates.simpledateformat;

import java.text.DateFormat;
import java.util.Locale;

public class Constructortest {

	public static void main(String[] args) {
		DateFormat dateFormat = new DateFormat(Locale.US);
		DateFormat dateFormat1 = DateFormat.getDateInstance();
		DateFormat dateFormat2 = DateFormat.getDateInstance(1);
		DateFormat dateFormat3 = DateFormat.getDateInstance(1, Locale.US);
		
		DateFormat dateFormat4 = DateFormat.getDateInstance(Locale.US);
		DateFormat dateFormat5 = DateFormat.getDateInstance();
		dateFormat5.setLocale(); // don't exist
	}

}
