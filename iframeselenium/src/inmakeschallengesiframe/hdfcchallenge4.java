package inmakeschallengesiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hdfcchallenge4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Challenge 4");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\iframeselenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1500);
		WebElement loginid=driver.findElement(By.xpath("//*[@name=\"fldLoginUserId\"]"));
		js.executeScript("arguments[0].setAttribute('value','data@123')",loginid );
		WebElement login = driver.findElement(By.xpath("//*[text()=\"CONTINUE\"]"));
		js.executeScript("arguments[0].click()", login);
		
		driver.close();
		driver.quit();
	
	}

}
