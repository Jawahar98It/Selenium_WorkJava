package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdealchallenge4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Challenge 4");
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("(//*[@name=\"keyword\"])[1]"));
		searchbox.sendKeys("Hand Sanitizer");
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()=\"Search\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		WebElement sanitizer = driver.findElement(By.xpath("(//*[@title=\"Peesafe - Antibacterial Hand Sanitizer 50 mL (Pack of 1)\"])[2]"));
		sanitizer.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> handling_windows=driver.getWindowHandles();
		for (String all_window : handling_windows) 
		{
			if(all_window != parentwindow)
			{
				driver.switchTo().window(all_window);
			}
		}
		Thread.sleep(3500);
		WebElement add_cart = driver.findElement(By.xpath("//*[text()=\"add to cart\"]"));
		add_cart.click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
