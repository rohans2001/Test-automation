package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.generic_fetch;

public class Demoqa_ddt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		// open the browser and goto the website
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.navigate().to("https://demoqa.com/automation-practice-form");

		// Finding the elements on webpage
		List<WebElement> test_elements = Driver.findElements(By.xpath("//input[@type='text']|//textarea"));
		int size = test_elements.size();

		// passing the data into the field
		
		for (int row=0;row<=11;row++) {
			for (int i = 0; i < size; i++) {
				WebElement webElement = test_elements.get(i);
				String data = generic_fetch.Fetch_data("Test_demoqa", row, i);
				webElement.sendKeys(Keys.CONTROL + "a");
				webElement.sendKeys(data);
				Thread.sleep(1000);
				webElement.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
			}

			String gender = generic_fetch.Fetch_data("Test_demoqa", row, 9);
			if (gender.equals("Male")) {
				Driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
			} else if (gender.equals("Female")) {
				Driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
			}
			WebElement submit_button = Driver.findElement(By.xpath("//button[.='Submit']"));
			JavascriptExecutor jse = (JavascriptExecutor) Driver;
			jse.executeScript("arguments[0].scrollIntoView();", submit_button);
			submit_button.click();
			Thread.sleep(2000);
			WebElement close_button = Driver.findElement(By.xpath("//button[.='Close']"));
			jse.executeScript("arguments[0].click();", close_button);
		}
		Driver.close();
	}

}
