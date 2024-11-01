package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//a[.='Log in']")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dummy53985738573@gmail.com");
		Driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@12345");
		Driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click();
		Driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top JR Plus Size')]/../../../div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//h1[contains(text(),'Rockabilly Polka Dot Top JR Plus Size')]/../../div[6]/div/input[2]")).click();
		Thread.sleep(2000);
		WebElement element = Driver.findElement(By.xpath("//div[@id='bar-notification']/p"));
		boolean displayed = element.isDisplayed();
		if (displayed) {
			Driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			Driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			Driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
		WebElement element2 = Driver.findElement(By.xpath("//div[contains(text(),'Your Shopping Cart is empty!')]"));
		
		boolean displayed2 = element2.isDisplayed();
		if (displayed2) {
			String text = element2.getText();
			System.out.println(text);
			Driver.findElement(By.xpath("//a[.='Log out']")).click();
			
		}
		
		Thread.sleep(2000);
		Driver.close();
		
		
	}

}
