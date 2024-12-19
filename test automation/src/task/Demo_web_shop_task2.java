package task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import generic.generic_screenshot_as;

public class Demo_web_shop_task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dummy53985738573@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@12345");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Log in']"));
		ele.click();

		// Navigate to the Apparel & Shoes category
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click();

		int itemCount = driver.findElements(By.xpath("//input[@value='Add to cart']")).size();

		// Loop to add each item to the cart one by one
		for (int i = 0; i < itemCount; i++) {
			boolean displayes = false; // Reset before each iteration

			// Ensure we're on the Apparel & Shoes page
			if (!driver.getCurrentUrl().contains("apparel-shoes")) {
				driver.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");
			}

			// Re-fetch the "Add to cart" elements list and click on the current item
			List<WebElement> add_to_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			WebElement cart = add_to_cart.get(i);

			Thread.sleep(3000);
			cart.click();
			Thread.sleep(3000);

			try {
				WebElement msg = driver.findElement(By.xpath("//div[@class='bar-notification success']/p"));
				if (msg.isDisplayed()) {
					displayes = true;
					System.out.println("Displayed");
				}
			} catch (Exception e) {
				System.out.println("Not Displayed");
				// Take a screenshot if the success message was not displayed
				Thread.sleep(2000);
				generic_screenshot_as.sc(driver);
			}

			// Navigate back only if the success message was not displayed
			if (!displayes) {
				driver.navigate().back();
				Thread.sleep(2000);
			}
		}
		// Navigate to the Shopping Cart
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		Thread.sleep(2000);

		// Check if there are items in the cart and remove them
		List<WebElement> cartItems = driver.findElements(By.xpath("//input[@name='removefromcart']"));

		if (!cartItems.isEmpty()) {
			// Click all "Remove" checkboxes
			for (WebElement removeCheckbox : cartItems) {
				removeCheckbox.click();
			}

			// Click on "Update shopping cart" to remove selected items
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			Thread.sleep(2000);

			System.out.println("All items removed from the cart.");
		} else {
			System.out.println("Cart is already empty.");
		}

		// Log out from the account
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		Thread.sleep(2000);

		System.out.println("Logged out successfully.");

		driver.close();
	}
}
