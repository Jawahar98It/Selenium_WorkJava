package inmakeschallengesiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sbichallenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 3");
		System.setProperty("webdriver.edge.driver", "E:\\Training_Selenium\\iframeselenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://retail.onlinesbi.sbi/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement login = driver.findElement(By.xpath("//span[text()=\"LOGIN\"]"));
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(2400);
		WebElement continue_login = driver.findElement(By.xpath("(//*[@class=\"login_button\"])[1]"));
		js.executeScript("arguments[0].click()", continue_login);
		Thread.sleep(2800);
		driver.close();
		driver.quit();

	}

}
