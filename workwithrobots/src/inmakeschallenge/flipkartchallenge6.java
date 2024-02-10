package inmakeschallenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Challenge 6");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\workwithrobots\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement shoe = driver.findElement(By.xpath("//*[text()=\"Grocery\"]"));
		Actions action = new Actions(driver);
		Robot rob = new Robot();
		action.contextClick(shoe).perform();
		Thread.sleep(1400);
		for (int i = 0; i <4; i++) 
		{
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_ENTER);	
		}
		
		Thread.sleep(5400);
		driver.close();
		driver.quit();
		
		

	}

}
