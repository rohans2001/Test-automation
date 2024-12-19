package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class generic_screenshot_as {

	private static String path = "C:\\Users\\ROHAN\\Desktop\\screenshot\\";
	private static String format = ".jpeg";

	public static void sc(WebDriver driver) {

		try {
			Date d = new Date();
			String d1 = d.toString();
			String date = d1.replace(':', '-');
			// Step 1
			TakesScreenshot sc = (TakesScreenshot) driver;

			// step 2
			File src = sc.getScreenshotAs(OutputType.FILE);
			File dst = new File(path + date + format);
			FileHandler.copy(src, dst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
