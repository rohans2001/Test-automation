package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ROHAN/Desktop/Practice/input.html");
		WebElement ele=driver.findElement(By.xpath("//input[@value='Selenium']"));
		
		ele.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		
		driver.quit();
		
		

	}

}
