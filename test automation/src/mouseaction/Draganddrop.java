package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		Driver.manage().window().maximize();

		WebElement amount = Driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement creditamounttarget = Driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		WebElement debitamounttarget = Driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement sales = Driver.findElement(By.xpath("//a[.=' SALES ']"));
		WebElement saletarget = Driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement bank = Driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement banktarget = Driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		
		
		Actions act = new Actions(Driver);
		
		act.dragAndDrop(amount,creditamounttarget).build().perform();
		act.dragAndDrop(sales, saletarget).build().perform();
		act.dragAndDrop(amount, debitamounttarget).perform();
		act.dragAndDrop(bank, banktarget).perform();
		
		Thread.sleep(5000);
		
		Driver.quit();

	}

}
