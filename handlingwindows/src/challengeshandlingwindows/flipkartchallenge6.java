package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartchallenge6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//*[@title=\"Search for Products, Brands and More\"])[2]"));
		search.sendKeys("Mask");
		WebElement searchbutton = driver.findElement(By.xpath("//*[@class=\"_2iLD__\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		WebElement mask=driver.findElement(By.xpath("//a[text()=\"H-Store HS Black Red Black 02\"]"));
		mask.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> handling_windows=driver.getWindowHandles();
		for (String all_window : handling_windows) 
		{
			if(all_window != parentwindow)
			{
				driver.switchTo().window(all_window);
			}
		}
		WebElement delivery_code = driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]"));
	     delivery_code.sendKeys("636001");
	     Thread.sleep(2000);
	     driver.close();
	     driver.quit();

	}

}
