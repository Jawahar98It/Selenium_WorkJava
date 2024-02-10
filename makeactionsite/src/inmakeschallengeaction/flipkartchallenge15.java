package inmakeschallengeaction;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge15 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 15");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement Baby = driver.findElement(By.xpath("//*[text()=\"Beauty, Toys & More\"]"));
		act.moveToElement(Baby).perform();
		Thread.sleep(400);
		WebElement Toys = driver.findElement(By.xpath("(//*[@class=\"_1BJVlg\"])[5]"));
		act.moveToElement(Toys).perform();
		WebElement Remotecar = driver.findElement(By.xpath("(//*[text()=\"Remote Control Toys\"])[2]"));
		act.moveToElement(Remotecar).perform();
		Remotecar.click();
		System.out.println("Current Page Url:"+driver.getCurrentUrl());
		System.out.println("Current Page Title:"+driver.getTitle());
		driver.quit();

	}

}
