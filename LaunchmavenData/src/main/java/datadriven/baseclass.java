package datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;
	public static void launchbrowser()
	{
		//WebDriverManager.chromedriver().driverVersion("E:\\Training_Selenium\\LaunchmavenData\\Drivers\\chromedriver.exe").setup();
		driver = new ChromeDriver();
	}

	public static void launchurl() {
		driver.get("https://www.google.com/");

	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void pageTitle() {
		String title =driver.getTitle();
		System.out.println(title);

	}
	public static void passText( WebElement data) 
	{
		data = driver.findElement(By.xpath("//*[@role=\"combobox\"]"));
		data.sendKeys("Inmakes Infotech");

	}
	public static void makerobot(Robot r) throws InterruptedException {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}
	public static void closeBrowser() {
		driver.close();
		driver.quit();

	}
	
	
}
