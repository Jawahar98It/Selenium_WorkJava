package dropdownchallenges;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adochotelchallenge5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Challenge 5");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\dropdownselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File image=ts.getScreenshotAs(OutputType.FILE);
		File f= new File("E:\\Training_Selenium\\dropdownselenium\\Scrrenshots\\adochotel.png");
		FileUtils.copyFile(image, f);
		driver.close();
		driver.quit();

	}

}
