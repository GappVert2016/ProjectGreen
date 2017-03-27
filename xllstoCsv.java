import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;

public class xllstoCsv {
	
	
	/*******************************************************/

	static void xls(File inputFile, File outputFile, int i, XSSFWorkbook workbook) {
		// For storing data into CSV files
		StringBuffer data = new StringBuffer();
		try {
			FileOutputStream fos = new FileOutputStream(outputFile);

			Cell cell;
			Row row;

			// Get the sheet i from the workbook
			XSSFSheet sheet = workbook.getSheetAt(i);

			// Iterate through each rows from first sheet
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					cell = cellIterator.next();

					switch (cell.getCellType())

					{
					case Cell.CELL_TYPE_BOOLEAN:
						data.append(cell.getBooleanCellValue() + ",");
						break;

					case Cell.CELL_TYPE_NUMERIC:
						data.append(cell.getNumericCellValue() + ",");
						break;

					case Cell.CELL_TYPE_STRING:
						data.append(cell.getStringCellValue() + ",");
						break;

					case Cell.CELL_TYPE_BLANK:
						data.append("" + "\n");
						break;

					default:
						data.append(cell + ",");
					}

				}
				data.append('\n');
				// }
			}
			fos.write(data.toString().getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*******************************************************/

	
	
	/*******************************************************/
	
	public static String StringToJSON(String str) throws JSONException {
		JSONArray array = CDL.toJSONArray(str);
		return array.toString(1);
	}
	/*******************************************************/

	
	
	/*******************************************************/

	public static String CSVToString(String str) {
		String csv = "";
		try {
			File fileIn = new File(str); // ouverture du fichier
			FileInputStream fis = new FileInputStream(fileIn);
			byte[] buffer = new byte[fis.available()]; // Récupération du
														// contenu du fichier
														// dans une variable de
														// type byte
			fis.read(buffer); // Lecture du contenu de la variable buffer
			csv = new String(buffer); // On parse le contenu de buffer dans
										// notre chaîne
			System.out.print(csv);
			fis.close(); // Fermeture du fichier
		} catch (Exception e) {
			e.printStackTrace();
		}

		return csv;
	}
	/**
	 * @throws JSONException *****************************************************/

	public static void main(String[] args) throws FileNotFoundException, IOException, JSONException {
		File inputFile = new File("Workbook1.xlsx");
		// Get the workbook object for XLS file
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(inputFile));
		// Get the number of sheet
		Integer nbr = workbook.getNumberOfSheets();

		for (int i = 0; i < nbr; i++) {
			/**XLS TO CSV**/
			File outputFile = new File("output" + i + ".csv");
			xls(inputFile, outputFile, i, workbook);
			/**CSV TO STRING**/
			String str = CSVToString("output" + i + ".csv");
			/**STRIN TO JSON**/
			System.out.println(StringToJSON(str));
		}
		System.out.print("True Xsl To CSV ");
	}
}
