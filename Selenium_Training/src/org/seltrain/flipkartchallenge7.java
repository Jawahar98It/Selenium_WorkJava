package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartchallenge7 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 7");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchdata=driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]"));
		searchdata.sendKeys("Redmi");
		WebElement searchk =driver.findElement(By.xpath("//*[@class=\"_2iLD__\"]"));
		searchk.click();
		Thread.sleep(1000);
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Page Title: "+driver.getTitle());
		driver.quit();
		driver.close();
	}

}
