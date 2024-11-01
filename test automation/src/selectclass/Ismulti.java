package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismulti {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("file:///C:/Users/ROHAN/Desktop/Practice/Multi_dropdown.html");
		
		WebElement dp = Driver.findElement(By.xpath("//select[@id='a1']"));
		
		Select s=new Select(dp);
		
		boolean ds = s.isMultiple();
		
		if (ds) {
			System.out.println("it is a multiple dropdown");
		}
		
		else {
			System.out.println("it is a single select drop down");
		}
		
		Driver.quit();
		
		
		
		

	}

}
