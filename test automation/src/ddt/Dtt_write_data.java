package ddt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Generic_ddt;

public class Dtt_write_data {
	
	 static String sheet="Sheet2";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Hindi Books",Keys.ENTER);
		
			List<WebElement> product_tittle = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span"));
			
			int size = product_tittle.size();
			int cell=0;
			
			for (int row = 0; row < size; row++) 
			{
					WebElement tittle_Element = product_tittle.get(row);
					String tittle_text = tittle_Element.getText().toString();
					System.out.println(tittle_text);
					Generic_ddt.writedata(sheet, row,cell , tittle_text);
			}
		
		driver.close();
	}

}
