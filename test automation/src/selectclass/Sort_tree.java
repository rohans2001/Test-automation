package selectclass;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_tree {

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
		TreeSet<String> l = new TreeSet<String>();

		for (WebElement opt : all_opt) {
			String text = opt.getText();
			l.add(text);
		}
		for (String l1 : l) {
			System.out.println(l1);
		}
		Driver.quit();

	}

}
