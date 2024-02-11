package photocopy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2challenge {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(600);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File image=ts.getScreenshotAs(OutputType.FILE);
		File f= new File("E:\\Training_Selenium\\Selenium_Training\\pagescreenshots\\flipkart.png");
		FileUtils.copyFile(image, f);
		driver.close();
		driver.quit();

	}

}
