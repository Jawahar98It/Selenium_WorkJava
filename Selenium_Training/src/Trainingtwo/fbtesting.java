package Trainingtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreateAcc = driver.findElement(By.xpath("//*[text()=\"Create new account\"]"));
		CreateAcc.click();
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("(//*[@type=\"radio\"])[2]"));
		male.click();
		System.out.println("Current Page title: "+driver.getTitle());
		driver.close();
		driver.quit();
		
	}

}
