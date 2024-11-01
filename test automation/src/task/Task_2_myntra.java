package task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_2_myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.myntra.com/");

		Driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement scarch = Driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));

		scarch.sendKeys("hrx shoes");
		Thread.sleep(1000);
		scarch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		WebElement whats_new = Driver.findElement(By.xpath("//input[@type='radio' and @value='new']"));
		JavascriptExecutor jseExecutor = (JavascriptExecutor) Driver;

		jseExecutor.executeScript("arguments[0].click();", whats_new);

		Thread.sleep(2000);

		WebElement Frist_product = Driver.findElement(By.xpath("//div[@class='search-searchProductsContainer row-base']/section/ul/li[1]"));
		Thread.sleep(1000);
		Actions act = new Actions(Driver);
		act.moveToElement(Frist_product).perform();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//span[.='wishlist']")).click();
		Thread.sleep(2000);
		Driver.close();

	}

}
