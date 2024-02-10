package executejsscriptchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartchallenge6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 6");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\executejsscript\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement login = driver.findElement(By.xpath("(//*[@title=\"Login\"])[1]"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]"));
		js.executeScript("arguments[0].setAttribute('value','testing@yahoo.com')", username);
		Thread.sleep(2000);
		Object value = js.executeScript("return arguments[0].getAttribute('value')", username);
		System.out.println(value);
		
		driver.close();
		driver.quit();
	}

}
