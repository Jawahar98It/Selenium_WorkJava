package executejsscriptchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inmakeschallenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 3");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\executejsscript\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sentence = driver.findElement(By.xpath("//h2[text()=\"Programs\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", sentence);
		Thread.sleep(2400);
		driver.close();
		driver.quit();

	}

}
