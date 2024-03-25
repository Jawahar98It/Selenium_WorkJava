package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartchallenge7 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 7");
		System.setProperty("webdriver.chrome.driver","E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//*[@title=\"Search for Products, Brands and More\"])[2]"));
		search.sendKeys("Hp Laptop");
		WebElement searchbutton = driver.findElement(By.xpath("//*[@class=\"_2iLD__\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		WebElement hp_lap=driver.findElement(By.xpath("(//*[contains(text(),\"Eyesafe\")])[1]"));
		hp_lap.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> handling_windows=driver.getWindowHandles();
		for (String all_window : handling_windows) 
		{
			if(all_window != parentwindow)
			{
				driver.switchTo().window(all_window);
			}
		}
		WebElement lap_amt = driver.findElement(By.xpath("(//*[text()=\"₹55,990\"])[1]"));
	     String lap_amount=lap_amt.getText();
	     System.out.println("Laptop amount is: "+lap_amount);
	     Thread.sleep(2000);
	     driver.close();
	     driver.quit();

	}

}
