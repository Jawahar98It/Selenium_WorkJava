package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonchallenge12 {
	
public static void homepage(WebDriver driver) {
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

public static void Registerbutton(WebElement clikhere, WebElement register,WebDriver driver) throws InterruptedException {
	clikhere = driver.findElement(By.xpath("//*[text()=\"Hello, sign in\"]"));
	Actions act = new Actions(driver);
	act.moveToElement(clikhere).perform();
	Thread.sleep(400);
	register = driver.findElement(By.xpath("(//*[text()=\"Start here.\"])[1]"));
	act.moveToElement(register).perform();
	register.click();

}

public static void Registerpage(WebElement name,WebElement mobno,WebElement email,WebElement password,WebDriver driver) throws InterruptedException
{	
	name=driver.findElement(By.xpath("//*[@placeholder=\"First and last name\"]"));
	name.sendKeys("Jawahar");
	mobno=driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
	mobno.sendKeys("9876543210");
	email=driver.findElement(By.xpath("//*[@type=\"email\"]"));
	email.sendKeys("testing@gmail.com");
	password=driver.findElement(By.xpath("//*[@name=\"password\"]"));
	password.sendKeys("Testing@123");
	Thread.sleep(1000);
}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 12");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		homepage(driver);
		WebElement clikhere = null,register = null;
		Registerbutton(clikhere,register,driver);
		WebElement name = null,mobno = null,email = null,password = null;
		Registerpage(name,mobno,email,password,driver);
		
		
		driver.close();
		driver.quit();

	}

}
