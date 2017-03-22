import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadLine {
	public static void main(String[] argv) throws IOException {
		ArrayList<String> pContent = new ArrayList<String>();
		String fileName = "test.xml";

		BufferedReader lecteurAvecBuffer = null;
		String ligne;

		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException exc) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			// System.out.println(ligne);
			String contentLine = getTitle(ligne);

			if (contentLine != "")
				pContent.add("\"" + contentLine + "\"");
			// System.out.print(pContent);
		}
		lecteurAvecBuffer.close();
		System.out.print(pContent);
	}

	static String getTitle(String html) {

		Pattern p = Pattern.compile("<p>(.*)</p>");
		Matcher m = p.matcher(html);

		if (m.find())
			return m.group(1);
		return "";

	}
}
