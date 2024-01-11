package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inmakeseduchalenge10 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 10");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmakesedu.com/about_us");
		driver.manage().window().maximize();
		WebElement content = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/h2"));
		String value=content.getText();
		System.out.println("Contents in Webpage:"+value);
		Thread.sleep(600);
		driver.close();

	}

}
