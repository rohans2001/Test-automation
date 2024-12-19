package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_ddt {
	private static String path = "C:\\Users\\ROHAN\\Desktop\\Testdata.xlsx";
	private static String value = null;
	private static FileInputStream fis = null;
	private static FileOutputStream fos = null;

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

	public static void writedata(String sheet, int row, int cell, String value) {
		try {
			fis = new FileInputStream(path);

			Workbook book = WorkbookFactory.create(fis);
			book.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
			fos = new FileOutputStream(path);
			book.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
