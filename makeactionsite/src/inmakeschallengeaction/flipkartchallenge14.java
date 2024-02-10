package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge14 {

	public static void main(String[] args) {
		System.out.println("Challenge 14");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement Fashion = driver.findElement(By.xpath("(//*[@class=\"_2GaeWJ\"])[3]"));
		action.moveToElement(Fashion).perform();
		WebElement Women = driver.findElement(By.xpath("//*[text()=\"Women Footwear\"]"));
		action.moveToElement(Women).perform();
		WebElement Flatswomen = driver.findElement(By.xpath("(//*[@class=\"_3490ry\"])[2]"));
		action.moveToElement(Flatswomen).perform();
		Flatswomen.click();
		System.out.println("Current Page Title:"+driver.getTitle());
		System.out.println("Current Page Url:"+driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
