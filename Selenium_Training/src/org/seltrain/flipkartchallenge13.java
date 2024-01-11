package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartchallenge13 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 13");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement loginpage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a"));
		loginpage.click();
		Thread.sleep(1000);
		System.out.println("Current url:"+driver.getCurrentUrl());
		System.out.println("Current page title: "+driver.getTitle());
		driver.quit();
	}

}
