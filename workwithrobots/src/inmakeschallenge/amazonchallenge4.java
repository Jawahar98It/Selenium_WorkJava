package inmakeschallenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonchallenge4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.out.println("Challenge 4");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\workwithrobots\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement clikhere = driver.findElement(By.xpath("//*[text()=\"Hello, sign in\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(clikhere).perform();
		Thread.sleep(400);
		WebElement sign = driver.findElement(By.xpath("(//*[@class=\"nav-action-inner\"])[1]"));
		act.moveToElement(sign).perform();
		sign.click();
		Thread.sleep(500);
		WebElement emailfield = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		emailfield.sendKeys("georgecluney@yahoo.com");
		act.moveToElement(emailfield).click().doubleClick().build().perform();
		act.contextClick(emailfield).perform();
		
		Robot r = new Robot();
		for (int i = 0; i < 4; i++) 
		{	
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		driver.close();
		driver.quit();

	}

}
