package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonchallenge13 {
public static void getdriver(WebDriver driver) 
{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();;
}
public static void getsignin(WebElement hellosign,WebElement selleracc,WebDriver driver,Actions act) throws InterruptedException 
{
	
	act = new Actions(driver);
	hellosign = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	act.moveToElement(hellosign).perform();
	selleracc=driver.findElement(By.xpath("//*[text()=\"Your Seller Account\"]"));
	act.moveToElement(selleracc).perform();
	selleracc.click();
	Thread.sleep(1000);
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	System.out.println("Url of the page:"+url);
	System.out.println("Title of the page:"+title);
}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 13");
		System.setProperty("Webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		getdriver(driver);
		WebElement hellosign=null,selleracc=null;
		Actions act = null;
		getsignin(hellosign,selleracc,driver,act);
		
		driver.close();
		driver.quit();

	}

}
