package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_language {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		
		WebElement lang = Driver.findElement( By.xpath("//a[.='हिन्दी']"));
		
		Actions act=new Actions(Driver);
		
		act.contextClick(lang).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Driver.quit();
		
		
	}
}
