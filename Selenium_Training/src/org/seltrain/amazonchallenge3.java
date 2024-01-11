package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonchallenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 3");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("iphone");
		Thread.sleep(400);
		WebElement searchbutn = driver.findElement(By.id("nav-search-submit-button"));
		searchbutn.click();
		Thread.sleep(2000);
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Page Title: "+driver.getTitle());
		driver.quit();
	}

}
