package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge16 {

	public static void main(String[] args) {
		System.out.println("Challenge 16");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement electronic = driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
		action.moveToElement(electronic).perform();
		WebElement Audio = driver.findElement(By.xpath("//a[text()='Audio']"));
		action.moveToElement(Audio).perform();
		Audio.click();
		WebElement electronic2 = driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
		action.moveToElement(electronic2).perform();
		WebElement realme = driver.findElement(By.xpath("//*[text()=\"Realme\"]"));
		action.moveToElement(realme).perform();
		realme.click();
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		System.out.println("Current Page Title:"+driver.getTitle());
		driver.close();

	}

}
