package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartchallenge3 
{
	
	public static void getpage(WebDriver driver)  
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}
	
	public static void  Homefurniture(WebDriver driver,WebElement furniture,WebElement Bathlinen,Actions act) throws InterruptedException
	{
		act = new Actions(driver);
		furniture=driver.findElement(By.xpath("(//*[@class=\"_1XjE3T\"])[5]"));
		act.moveToElement(furniture).perform();
		Bathlinen = driver.findElement(By.xpath("//*[text()=\"Bath linen\"]"));
		act.moveToElement(Bathlinen).perform();
		Bathlinen.click();
		Thread.sleep(1000);

	}
	
	public static void productname(Actions act,String name,WebDriver driver,WebElement contentname) 
	{
		act = new Actions(driver);
		contentname=driver.findElement(By.xpath("//*[text()=\"The Wholeseller Cotton 650 GSM Bath Towel\"]"));
		act.moveToElement(contentname).perform();
		String produtname=contentname.getText();
		System.out.println("Product name is:"+produtname);

	}
	public static void closedriver(WebDriver driver) 
	{
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Challenge 3");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		getpage(driver);
		WebElement furniture = null;
		WebElement Bathlinen = null;
		Actions act = null;
		Thread.sleep(300);
		Homefurniture(driver,furniture,Bathlinen,act);
		WebElement contentname = null;
		String name = null;
		productname(act,name,driver,contentname);
		closedriver(driver);

	}
}