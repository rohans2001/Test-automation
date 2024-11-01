package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");

		Driver.findElement(By.name("cusid")).sendKeys("abc");
		Thread.sleep(1000);
		Driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert al = Driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(2000);
		Driver.quit();

	}

}
