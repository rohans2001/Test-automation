package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.selenium.dev/");

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
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		
		Set<String> all_id = Driver.getWindowHandles();

		ArrayList<String> all_id1 = new ArrayList<>(all_id);

		int size = all_id1.size();

		Driver.switchTo().window(all_id1.get(size-1));
		

		Driver.switchTo().window(all_id1.get(2));
		Thread.sleep(3000);
		Driver.close();

	}

}
