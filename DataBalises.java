package extractContentBalise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBalises {

	public static void main(String[] args) {

		
		System.out.println(getTitle("<a href=\"http://www.google.fr\">Aller à Google</a>"));
	}

	
	static String getTitle(String html){
	    
		Pattern p = Pattern.compile("<a href=['\"](.*)['\"]>(.*)</a>");
		Matcher m = p.matcher(html);
		 
		if (m.find()) return m.group(2);
		
		/*Pattern p = Pattern.compile("<title *>(.*)</title>");
	     Matcher m = p.matcher(html);
	     if (m.matches()) return m.group(1);*/
		
	     else return null;
	}
	
}
