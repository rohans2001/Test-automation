package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic_fetch {
	static String path = "C:\\Users\\ROHAN\\Desktop\\Testdata.xlsx";
	static String value = null;

	public static String Fetch_data(String sheetname, int row, int cell) {

		try {
			FileInputStream file = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(file);
			value = book.getSheet(sheetname).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

}
