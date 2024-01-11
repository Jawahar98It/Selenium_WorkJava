package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chlng2utube {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search_query"));
		search.sendKeys("India");
		WebElement srhbtn=driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		srhbtn.click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		String cururl=driver.getCurrentUrl();
		System.out.println("Title:"+title);
		System.out.println("Current URL:"+cururl);
		driver.quit();
		
		
	}

}
