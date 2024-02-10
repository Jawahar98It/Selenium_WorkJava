package inmakeschallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class googlechallenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\workwithrobots\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchitem = driver.findElement(By.xpath("//*[@name=\"q\"]"));
		searchitem.sendKeys("Inmakes Infotech");
		Actions action = new Actions(driver);
		action.moveToElement(searchitem).click().doubleClick().build().perform();
		Thread.sleep(2400);
		driver.close();
		driver.quit();

	}

}
