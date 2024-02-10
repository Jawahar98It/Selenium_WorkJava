package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartchallenge17 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 17");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement Appliance = driver.findElement(By.xpath("(//*[@class=\"_2puWtW _3a3qyb\"])[6]"));
		action.moveToElement(Appliance).perform();
		Appliance.click();
		WebElement Tvapplian = driver.findElement(By.xpath("//*[text()=\"TVs & Appliances\"]"));
		action.moveToElement(Tvapplian).perform();
		Thread.sleep(500);
		WebElement Television = driver.findElement(By.xpath("//*[text()=\"Television\"]"));
		action.moveToElement(Television).perform();
		Television.click();
		WebElement fourktv = driver.findElement(By.xpath("(//*[@title=\"Mi X Series 163.9 cm (65 inch) Ultra HD (4K) LED Smart Google TV 2023 Edition with 4K Dolby Vision | HDR 10 | Dolby Audio |,DTS X | DTS Virtual: X | Vivid Picture Engine\"])[1]"));
		action.moveToElement(fourktv).perform();
		fourktv.click();
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		System.out.println("Current Page Title:"+driver.getTitle());
		driver.close();
		driver.quit();
	}

}
