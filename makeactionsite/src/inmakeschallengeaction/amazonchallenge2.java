package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonchallenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement prime = driver.findElement(By.xpath("//*[text()='Prime']"));
		Actions act = new Actions(driver);
		act.moveToElement(prime).perform();
		Thread.sleep(400);
		WebElement freeitems = driver.findElement(By.xpath("//*[@class=\"student-nav-content-img\"]"));
		act.moveToElement(freeitems).perform();
		freeitems.click();
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		System.out.println("Current Page title:"+driver.getTitle());
		
		driver.close();
		driver.quit();
	}

}
