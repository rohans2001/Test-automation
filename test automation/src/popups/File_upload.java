package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement File = Driver.findElement(By.id("uploadPicture"));
		Thread.sleep(1000);
		
		File.sendKeys("C:\\Users\\ROHAN\\Desktop\\New Text Document (2).txt");
		
		//Driver.close();

	}

}
