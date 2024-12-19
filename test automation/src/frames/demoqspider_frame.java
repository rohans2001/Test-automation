package frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqspider_frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));

		// copying the data
		ArrayList<String> fill_data = new ArrayList<String>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='para']"));

		for (WebElement element : elements) {
			fill_data.add(element.getText());
		}

		driver.switchTo().frame(0);
		
		//Pasting the data in input fields
		List<WebElement> input_field = driver.findElements(By.xpath("//input"));
		System.out.println(input_field.size());
		int i = 0;

		for (WebElement input : input_field) {
			input.sendKeys(fill_data.get(i));
			i++;
		}

		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		

	}

}
