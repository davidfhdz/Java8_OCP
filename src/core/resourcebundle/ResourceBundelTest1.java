package core.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class ResourceBundelTest1 {

	public static void main(String[] args) {
		ResourceBundle.Control rbc = ResourceBundle.Control.getControl(Control.FORMAT_CLASS);
		Locale locale = new Locale("de");
		ResourceBundle rb = ResourceBundle.getBundle("core.resourcebundle.SRBundle",locale, rbc);
		System.out.println(rb.getString("Table"));
	}

}
