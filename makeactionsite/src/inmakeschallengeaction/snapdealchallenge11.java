package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdealchallenge11 {
	
	public static void main(String[] args) {
		System.out.println("Challenge 11");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement womenfashion=driver.findElement(By.xpath("//*[text()=\"Women's Fashion\"]"));
		act.moveToElement(womenfashion).perform();
		WebElement heels=driver.findElement(By.xpath("//*[text()=\"Heels\"]"));
		act.moveToElement(heels).perform();
		heels.click();
		System.out.println("Current Page title:"+driver.getTitle());
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		driver.close();
	}

}
