package inmakeschallenge;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdealchallenge5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Challenge 5");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\workwithrobots\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement product = driver.findElement(By.xpath("(//*[text()=\"Bhawna Collection Loard Shiv Trishul Damru Locket With Puchmukhi Rudraksha Mala Gold-plated Brass, Wood For Men & Women\"])[1]"));
		Actions action = new Actions(driver);
		action.contextClick(product).perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4500);
		
		driver.close();
		driver.quit();

	}

}
