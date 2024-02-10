package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class shopclueschallenge5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge5");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement sports = driver.findElement(By.xpath("//*[text()=\"Sports & More\"]"));
		action.moveToElement(sports).perform();
		WebElement weight = driver.findElement(By.xpath("//*[text()=\"Weight Gainers\"]"));
		action.moveToElement(weight).perform();
		weight.click();
		Thread.sleep(500);
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		System.out.println("Current Page title:"+driver.getTitle());
		driver.close();
		driver.quit();

	}

}
