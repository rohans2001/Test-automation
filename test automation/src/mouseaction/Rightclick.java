package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		Driver.manage().window().maximize();

		WebElement rightclick = Driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions act = new Actions(Driver);
		
		act.contextClick(rightclick).build().perform();
		
		Thread.sleep(2000);
		
		Driver.quit();

	}

}
