package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("file:///C:/Users/ROHAN/Desktop/Practice/Checkbox.html");
		
		List<WebElement> checkboxs = Driver.findElements(By.xpath("//input"));
		
		int count = checkboxs.size();
		
		for (int i = 0; i <= count-1; i++) {
			
			WebElement checkbox = checkboxs.get(i);
			
			checkbox.click();
		}
		Thread.sleep(2000);
		for (int i = count-1; i>=0; i--) {
			
			if (i%2!=0) {
				WebElement checkbox = checkboxs.get(i);
				
				checkbox.click();
			}

	}
		Thread.sleep(3000);
		Driver.quit();
		
	}
}
