package extractContentBalise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;


public class test {

	public static void main(String[] args) throws JDOMException, IOException {

		SAXBuilder builder = new SAXBuilder();
		
		File xmlProductFile = new File("exemple.xml");
		
		Document document = (Document) builder.build(xmlProductFile);
	
		
		Element root = ((org.jdom2.Document) document).getRootElement();
		ElementFilter filter = new org.jdom2.filter.ElementFilter("nom");
		
		ArrayList<String> pContent = new ArrayList<String>();

		for(Element c : root.getDescendants(filter)) {
		    
			pContent.add("\""+c.getTextNormalize()+"\"");
			System.out.println(c.getTextNormalize());
		} 
		
		System.out.println(pContent);
	}

}
