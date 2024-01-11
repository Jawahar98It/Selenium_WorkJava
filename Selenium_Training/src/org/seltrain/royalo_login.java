package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class royalo_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://app.royalo.info/");
		Driver.manage().window().maximize();
		Thread.sleep(1000);
		String title = Driver.getTitle();
		System.out.println("Title of the site: "+title);
		String currenturl = Driver.getCurrentUrl();
		System.out.println("Url of the page: "+currenturl);
		
		WebElement gotologin = Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[2]/nav/div[3]/a"));
		gotologin.click();
		WebElement email=Driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input"));
		email.sendKeys("jawaharsumathi23@gmail.com");
		Thread.sleep(400);
		WebElement password=Driver.findElement(By.name("loginpassword"));
		password.sendKeys("jawaharb");
		WebElement check=Driver.findElement(By.xpath("//*[@id=\"basic_checkbox_1\"]"));
		Thread.sleep(500);
		WebElement login=Driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[4]/button"));
		login.click();
		Thread.sleep(3000);
		
		//Driver.close();
		Driver.quit();

	}

}
