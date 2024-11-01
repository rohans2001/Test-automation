package selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_selecttext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement dp = Driver.findElement(By.id("month"));

		Select s = new Select(dp);

		List<WebElement> all_opt = s.getOptions();
		ArrayList<String> l = new ArrayList<String>();

		for (WebElement opt : all_opt) {
			String text = opt.getText();
			l.add(text);
		}
		Collections.sort(l);
		for (String l1 : l) {
			System.out.println(l1);
		}
		Driver.quit();

	}

}
