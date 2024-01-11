package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inmakeschallenge12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Inmakes learning hub");
		searchbox.sendKeys(Keys.RETURN);
		Thread.sleep(1500);
		WebElement inmakes = driver.findElement(By.xpath("//*[h3=\"Inmakes Learning Hub: India's No.1 Virtual Internship Platform\"]"));
		inmakes.click();
		Thread.sleep(1500);
		System.out.println("Current Page title: "+driver.getTitle());
		System.out.println("Current Page url: "+driver.getCurrentUrl());
		driver.close();
		driver.quit();
		

	}

}
