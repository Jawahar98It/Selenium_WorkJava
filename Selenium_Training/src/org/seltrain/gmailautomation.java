package org.seltrain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.gmail.com/");
		Driver.manage().window().maximize();
		Thread.sleep(1000);
		String title = Driver.getTitle();
		System.out.println("Title of the site: "+title);
		String currenturl = Driver.getCurrentUrl();
		System.out.println("Url of the page: "+currenturl);
		
		//Driver.close();
		Driver.quit();
	}

}
