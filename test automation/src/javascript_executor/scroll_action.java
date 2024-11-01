package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.amazon.in/");

		Driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement scarch = Driver.findElement(By.xpath("//a[.='About Amazon']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)Driver;
		
		jse.executeScript("arguments[0].scrollIntoView();",scarch);
		
		scarch.click();
		
		Thread.sleep(2000);
		Driver.close();

	}

}
