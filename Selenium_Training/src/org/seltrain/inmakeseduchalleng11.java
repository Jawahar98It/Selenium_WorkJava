package org.seltrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inmakeseduchalleng11 {

	public static void main(String[] args) {
		System.out.println("Challenge 11");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		WebElement address = driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/div[3]/div/ul/li[1]/a"));
		String dubai=address.getText();
		System.out.println("Dubai Address:"+dubai);
		driver.close();
		driver.quit();


	}

}
//<a href="https://www.google.com/maps/place/Mai+Tower/@25.288008,55.3629413,17z/data=!3m1!4b1!4m5!3m4!1s0x3e5f5c66a0b1662b:0x6d3dcadaa24a354b!8m2!3d25.288008!4d55.36513" target="_blank"><b>Dubai:</b>
//</a>