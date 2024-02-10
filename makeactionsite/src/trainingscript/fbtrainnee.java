package trainingscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtrainnee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','testing@gmail.com')", email);
		Thread.sleep(2400);
		Object txt=js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(txt);
		
		WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
		js.executeScript("arguments[0].setAttribute('value','Testing@123')",password);
		
		Object txt2=js.executeScript("return arguments[0].getAttribute('value')", password);
		System.out.println(txt2);
		
		WebElement login = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		js.executeScript("arguments[0].click()", login);
		
		driver.close();
		driver.quit();
		
	}

}
