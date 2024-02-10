package executejsscriptchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adochotelchallenge5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 5");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\executejsscript\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.xpath("//*[@name=\"username\"]"));
		js.executeScript("arguments[0].setAttribute('value','testing@gmail.com')", email);
		Thread.sleep(2400);
		Object txt=js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(txt);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		js.executeScript("arguments[0].setAttribute('value','Testing@123')",password);
		
		Object txt2=js.executeScript("return arguments[0].getAttribute('value')", password);
		System.out.println(txt2);
		
		WebElement login = driver.findElement(By.xpath("//*[@value=\"Login\"]"));
		js.executeScript("arguments[0].click()", login);
		
		driver.close();
		driver.quit();

	}

}
