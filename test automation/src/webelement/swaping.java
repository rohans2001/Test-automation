package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ROHAN/Desktop/Practice/input.html");
		
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Selenium']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"x");
		WebElement ele3=driver.findElement(By.xpath("//input[@name='blank']"));
		ele3.sendKeys(Keys.CONTROL+"v");
		WebElement ele2=driver.findElement(By.xpath("//input[@value='Api']"));
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"x");
		ele1.sendKeys(Keys.CONTROL+"v");
		ele3.sendKeys(Keys.CONTROL+"a");
		ele3.sendKeys(Keys.CONTROL+"x");
		ele2.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		//driver.quit();
		

	}

}
