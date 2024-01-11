package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonchallenge8 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 8");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		WebElement product = Driver.findElement(By.linkText("Mobiles"));
		product.click();
		WebElement searchproduct = Driver.findElement(By.xpath("//*[@placeholder=\"Search Amazon.in\"]"));
		searchproduct.sendKeys("Realme");
		WebElement searchkey=Driver.findElement(By.id("nav-search-submit-button"));
		searchkey.click();
		Thread.sleep(1000);
		Driver.close();
		Driver.quit();
	}

}
