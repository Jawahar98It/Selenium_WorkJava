package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbuschallenge5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 5");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.redbus.in/");
		driver1.manage().window().maximize();
		WebElement fromplace=driver1.findElement(By.xpath("//*[@id=\"src\"]"));
		fromplace.sendKeys("Salem");
		WebElement toplace=driver1.findElement(By.id("dest"));
		toplace.sendKeys("Chennai");
		Thread.sleep(500);
		WebElement switchplace=driver1.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div[2]"));
		switchplace.click();
		Thread.sleep(7500);
		driver1.quit();
		driver1.close();

	}

}

