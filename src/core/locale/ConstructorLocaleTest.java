package core.locale;

import java.util.Locale;

public class ConstructorLocaleTest {
	public static void main(String[] args) {
		Locale CAN = new Locale.Builder().setLanguage("en").setRegion("CA").build();
		
		// no compile
		//Locale CAN1 = new Locale.Builder().setLanguage("en").setRegion("CA");
		
		// Country DE
		Locale CAN2 = new Locale("ca","DE");
		
		// Without country
		Locale CAN3 = new Locale("ca");
		
		Locale CAN4 = Locale.CANADA;
		
		
		System.out.println( CAN4.getDisplayCountry());
	}
}
