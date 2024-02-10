package inmakeschallenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Challenge 3");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Training_Selenium\\workwithrobots\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("(//*[@title=\"Login\"])[1]"));
		login.click();
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		WebElement username = driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]"));
		username.sendKeys("testing@test.com");
		action.moveToElement(username).click().doubleClick().build().perform();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
