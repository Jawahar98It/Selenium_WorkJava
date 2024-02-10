package inmakeschallenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbchallenge1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\workwithrobots\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//*[@placeholder=\"Email address or phone number\"]"));
		name.sendKeys("testing@gmail.com");
		
		Actions action = new Actions(driver);
		action.moveToElement(name).click().doubleClick().build().perform();
		action.contextClick(name).perform();
		Robot rob = new Robot();
		for (int i = 0; i <2 ; i++) 
		{
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}
		System.out.println(name.getAttribute("value"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.click();
		action.contextClick(password).perform();
		for (int j = 0; j < 5; j++) 
		{
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
		}
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		

	}

}
