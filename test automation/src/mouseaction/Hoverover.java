package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		Driver.manage().window().maximize();

		WebElement prime = Driver.findElement(By.xpath("//span[.='Prime']"));
		
		Actions act = new Actions(Driver);
		
		act.moveToElement(prime).build().perform();
		
		Driver.quit();

	}
}
