package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_data {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ROHAN/Desktop/Practice/mainpage.html");
		WebElement pass = driver.findElement(By.id("a1"));
		pass.sendKeys("selenium");
		Thread.sleep(2000);
		
		//switch to different frame and perform action
		
		driver.switchTo().frame(driver.findElement(By.id("n2")));
		driver.findElement(By.id("s1")).sendKeys("Api");
		Thread.sleep(2000);
		
		//navigate back to main frame
		
		driver.switchTo().defaultContent();
		pass.clear();
		Thread.sleep(2000);
		
		//switch to different frame and perform action
		
		driver.switchTo().frame("n3");  //using string arguments
		driver.findElement(By.id("l1")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}
