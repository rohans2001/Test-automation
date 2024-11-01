package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/automation-practice-form");
		
		Driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		
		Driver.findElement(By.xpath("//div[.='19']")).click();
		
		Driver.close();
	}

}
