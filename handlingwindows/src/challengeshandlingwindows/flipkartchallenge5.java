package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartchallenge5
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement search ;
		WebElement searchbutton ,phone;
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		search = driver.findElement(By.xpath("(//*[@title=\"Search for Products, Brands and More\"])[2]"));
		search.sendKeys("Redmi phone");
		searchbutton = driver.findElement(By.xpath("//*[@class=\"_2iLD__\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		phone=driver.findElement(By.xpath("(//*[text()=\"REDMI A2 (Aqua Blue, 64 GB)\"])[1]"));
		phone.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> handling_windows=driver.getWindowHandles();
		for (String all_window : handling_windows) 
		{
			if(all_window != parentwindow)
			{
				driver.switchTo().window(all_window);
			}
		}
		WebElement price_amt = driver.findElement(By.xpath("(//*[text()=\"₹5,499\"])[1]"));
	     String amount=price_amt.getText();
	     Thread.sleep(2000);
		System.out.println("Price Value of Redmi Phone: "+amount);
		
		driver.close();
		driver.quit();
		
	}
	

}
