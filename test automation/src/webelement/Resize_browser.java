package webelement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.facebook.com/");
		
		Dimension d=new Dimension(1680, 1050);
		Driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		Dimension d1=new Dimension(1600, 900);
		Driver.manage().window().setSize(d1);
		Thread.sleep(1000);
		
		Dimension d2=new Dimension(1400, 900);
		Driver.manage().window().setSize(d2);
		Thread.sleep(1000);
		
		Dimension d3=new Dimension(1400, 1050);
		Driver.manage().window().setSize(d3);
		Thread.sleep(1000);
		
		Dimension d4=new Dimension(1280, 600);
		Driver.manage().window().setSize(d4);
		Thread.sleep(1000);
		
		Driver.quit();
		
		
		

	}

}
