package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdealchallenge2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement searchbox, searchbutton;
		WebElement iphone;
		System.out.println("Challenge2");
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		searchbox = driver.findElement(By.xpath("(//*[@name=\"keyword\"])[1]"));
		searchbox.sendKeys("Iphone 7");
		searchbutton = driver.findElement(By.xpath("//*[text()=\"Search\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		iphone = driver.findElement(
				By.xpath("//p[@title=\"Spectacular Ace - Black Plain Cases Compatible For iPhone 7 ( Pack of 1 )\"]"));
		iphone.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> handling_windows = driver.getWindowHandles();
		for (String all_window : handling_windows) {
			if (all_window != parentwindow) {
				driver.switchTo().window(all_window);
			}
		}
		Thread.sleep(3500);
		WebElement add_cart = driver.findElement(By.xpath("//*[text()=\"add to cart\"]"));
		add_cart.click();
		Thread.sleep(2000);
		WebElement price_amt = driver.findElement(By.xpath("(//*[text()=\"Rs. 249\"])[2]"));
		String Price = price_amt.getText();

		System.out.println("Price amount of Iphone Product is: " + Price);
		driver.close();
		driver.quit();


	}

}
