package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepotchallenge9 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge9");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement shopall= driver.findElement(By.xpath("//*[text()=\"Shop All\"]"));
		action.moveToElement(shopall).perform();
		shopall.click();
		Thread.sleep(400);
		WebElement department = driver.findElement(By.xpath("//*[text()=\"Shop By Department\"]"));
		action.moveToElement(department).perform();
		department.click();
		Thread.sleep(650);
		WebElement paint = driver.findElement(By.xpath("(//*[text()=\"Paint\"])[3]"));
		action.moveToElement(paint).perform();
		paint.click();
		Thread.sleep(600);
		WebElement interior = driver.findElement(By.xpath("//*[text()=\"Interior Paint\"]"));
		action.moveToElement(interior).perform();
		interior.click();
		Thread.sleep(700);
		WebElement ceiling = driver.findElement(By.xpath("//*[text()=\"Ceiling Paint\"]"));
		action.moveToElement(ceiling).perform();
		ceiling.click();
		Thread.sleep(650);
		System.out.println("Current Page title:"+driver.getTitle());
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
