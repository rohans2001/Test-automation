package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_website {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.selenium.dev/");

		Driver.manage().window().maximize();

		List<WebElement> elements = Driver.findElements(By.xpath("//li[contains(@class,'nav')]"));

		Actions act = new Actions(Driver);

		Robot r = new Robot();

		for (WebElement element : elements) {

			act.contextClick(element).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			

		}
		Driver.quit();
	}

}
