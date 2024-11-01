package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_selected {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("file:///C:/Users/ROHAN/Desktop/Practice/Multi_dropdown.html");
		
		WebElement dp = Driver.findElement(By.xpath("//select[@id='a1']"));
		
		Select s=new Select(dp);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("2");																										
		Thread.sleep(1000);
		s.selectByVisibleText("Beer");
		Thread.sleep(1000);
		
		List<WebElement> all_opt = s.getAllSelectedOptions();
		
		for (WebElement opt : all_opt) {
			String text = opt.getText();
			System.out.println(text);
		}
		
		
		
		Driver.quit();

	}

}
