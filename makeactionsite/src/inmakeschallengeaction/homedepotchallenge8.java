package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepotchallenge8 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge8");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement shopall= driver.findElement(By.xpath("//*[@aria-label=\"open drawer to view Shop All\"]"));
		action.moveToElement(shopall).perform();
		shopall.click();
		Thread.sleep(250);
		WebElement department = driver.findElement(By.xpath("//*[text()=\"Shop By Department\"]"));
		action.moveToElement(department).perform();
		department.click();
		Thread.sleep(300);
		WebElement heatandcool = driver.findElement(By.xpath("//*[@id=\"menu-item-id-5mTrtGpYeRGQNyXudbwaVY\"]"));
		action.moveToElement(heatandcool).perform();
		heatandcool.click();
		Thread.sleep(300);
		WebElement aircondition = driver.findElement(By.xpath("//*[text()=\"Air Conditioners\"]"));
		action.moveToElement(aircondition).perform();
		aircondition.click();
		Thread.sleep(300);
		WebElement portable = driver.findElement(By.xpath("//*[text()=\"Portable Air Conditioners\"]"));
		action.moveToElement(portable).perform();
		portable.click();
		Thread.sleep(300);
		System.out.println("Current Page title:"+driver.getTitle());
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
