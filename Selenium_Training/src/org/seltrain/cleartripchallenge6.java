package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartripchallenge6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.cleartrip.com/trains");
		Driver.manage().window().maximize();
		WebElement fromstation = Driver.findElement(By.xpath("//*[@id=\"from_station\"]"));
		fromstation.sendKeys("Salem");
		Thread.sleep(500);
		WebElement tostation = Driver.findElement(By.xpath("//*[@name=\"to_station\"]"));
		tostation.sendKeys("Madurai");
		Thread.sleep(600);
		WebElement enquiretrain = Driver.findElement(By.xpath("//*[@id=\"trainFormButton\"]"));
		enquiretrain.click();
		Thread.sleep(1500);
		System.out.println("Current Page url:"+Driver.getCurrentUrl());
		System.out.println("Page Title:"+Driver.getTitle());
		Driver.close();
		Driver.quit();
	}

}
