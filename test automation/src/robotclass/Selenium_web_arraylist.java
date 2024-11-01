package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_web_arraylist {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.selenium.dev/");

		Driver.manage().window().maximize();

		WebElement download = Driver.findElement(By.xpath("//a[.='Downloads']"));
		WebElement documentation = Driver.findElement(By.xpath("//a[.='Documentation']"));
		WebElement projects = Driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement support = Driver.findElement(By.xpath("//a[.='Support']"));
		WebElement blog = Driver.findElement(By.xpath("//a[.='Blog']"));

		ArrayList<WebElement> links = new ArrayList<WebElement>();

		links.add(download);
		links.add(documentation);
		links.add(projects);
		links.add(support);
		links.add(blog);

		Actions act = new Actions(Driver);

		Robot r = new Robot();
		for (WebElement element : links) {

			act.contextClick(element).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Driver.quit();

	}

}
