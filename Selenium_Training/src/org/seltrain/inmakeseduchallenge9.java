package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inmakeseduchallenge9 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 9");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		WebElement content = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div/div/h1"));
		String value=content.getText();
		System.out.println("Contents in Webpage:"+value);
		Thread.sleep(500);
		driver.close();

	}

}
