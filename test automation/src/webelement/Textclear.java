package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textclear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("file:///C:/Users/ROHAN/Desktop/Practice/input10.html");

		List<WebElement> inputs = Driver.findElements(By.xpath("//input"));

		int count = inputs.size();

		for (int i = 0; i <= count - 1; i++) {

			WebElement input = inputs.get(i);

			input.sendKeys("Selenium");
			;
		}
		Thread.sleep(2000);
		for (int i = count - 1; i >= 0; i--) {

			if (i % 2 == 0) {
				WebElement input = inputs.get(i);

				input.clear();
				Thread.sleep(3000);
			}

		}
		Driver.quit();
	}
}