package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child_tittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.naukri.com/");

		Driver.findElement(By.xpath("//div[.='Services']")).click();

		Set<String> all_id = Driver.getWindowHandles();

		for (String id : all_id) {
			Driver.switchTo().window(id);
			String title = Driver.getTitle();
			System.out.println(title);
		}

		Driver.quit();

	}

}
