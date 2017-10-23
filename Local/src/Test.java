import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
	
		/*Locale locale= Locale.getDefault();
		System.out.println(locale);
		
		Locale localeTR = new Locale("tr","TR");
		System.out.println(localeTR.getCountry());
		System.out.println(localeTR.getDisplayCountry());
		System.out.println(localeTR.getLanguage());
		System.out.println(localeTR.getDisplayLanguage());*/
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormat.format(date));
		
		Locale locGe = Locale.GERMAN;
		DateFormat dateFormatGE = DateFormat.getDateInstance(DateFormat.FULL,locGe);
		System.out.println(dateFormatGE.format(date));
		
		Locale locIT = Locale.ITALIAN;
		DateFormat localeIT = DateFormat.getDateInstance(DateFormat.FULL,locIT);
		System.out.println(localeIT.format(date));
		
		/*Locale locFr=Locale.FRANCE;
		DateFormat dateFormatFr=DateFormat.getDateInstance(DateFormat.FULL,locFr);
		System.out.println(dateFormatFr.format(date));*/
	}

}
