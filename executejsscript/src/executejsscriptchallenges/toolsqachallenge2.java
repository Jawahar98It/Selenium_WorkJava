package executejsscriptchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqachallenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\executejsscript\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sharelink=driver.findElement(By.xpath("//*[@class=\"col-12 col-lg-auto find-us-text text-white find-us-text\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", sharelink);
		Thread.sleep(2000);
		WebElement popular = driver.findElement(By.xpath("//*[text()=\"Popular Tutorials\"]"));
		js.executeScript("arguments[0].scrollIntoView(false)", popular);
		driver.close();
		driver.quit();

	}

}
