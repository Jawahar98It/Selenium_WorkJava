package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class challenge4fb {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Challenge 4");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		WebElement email,password, signbutn;
		email=Driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("testing@gmail.com");
		Thread.sleep(400);
		password=Driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
		password.sendKeys("Testing@123");
		Thread.sleep(1500);
		signbutn=Driver.findElement(By.xpath("//*[@name=\"login\"]"));
		signbutn.click();
		System.out.println("Current Page Title:"+Driver.getTitle());
		System.out.println("Current Page Url: "+Driver.getCurrentUrl());
		Driver.quit();

	}

}
