package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class challenge1facebook {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 1");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver Driver1 = new FirefoxDriver();
		Driver1.get("https://www.facebook.com/");
		Driver1.manage().window().maximize();
		
		WebElement email,Password, siginbutn;
		email=Driver1.findElement(By.id("email"));
		email.sendKeys("testing@gmail.com");
		Thread.sleep(1000);
		Password=Driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		Password.sendKeys("Testing@123");
		Thread.sleep(500);
		siginbutn=Driver1.findElement(By.name("login"));
		siginbutn.click();
		Driver1.quit();
		
		

	}

}
