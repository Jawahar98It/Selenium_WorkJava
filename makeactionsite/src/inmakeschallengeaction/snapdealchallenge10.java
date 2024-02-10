package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdealchallenge10 {

	public static void main(String[] args) {
		System.out.println("Challenge 10");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement mobile=driver.findElement(By.xpath("//*[text()=\"Mobile & Accessories\"]"));
		act.moveToElement(mobile).perform();
		WebElement sellingphn=driver.findElement(By.xpath("//*[text()=\"Top Selling Wearables\"]"));
		act.moveToElement(sellingphn).perform();
		sellingphn.click();
		System.out.println("Current Page title:"+driver.getTitle());
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		driver.close();
		

	}

}
