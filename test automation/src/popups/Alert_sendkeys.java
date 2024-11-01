package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Thread.sleep(1000);
		Alert al = Driver.switchTo().alert();
		al.sendKeys("yes");
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(2000);
		Driver.quit();

	}

}
