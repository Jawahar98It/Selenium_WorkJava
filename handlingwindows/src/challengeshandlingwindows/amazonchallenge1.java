package challengeshandlingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonchallenge1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 1");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		js.executeScript("arguments[0].setAttribute('value','iphone X')", search);
		WebElement find_item = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		js.executeScript("arguments[0].click()", find_item);
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("//*[text()=\"i Phone X (Space Grey, 64 GB)\"]"));
		js.executeScript("arguments[0].click()", iphone);
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> multiple_handles=driver.getWindowHandles();
		System.out.println(multiple_handles);
		for (String all_id : multiple_handles) 
		{
			if(all_id != handle)
			{
				driver.switchTo().window(all_id);
			}
		}
		WebElement price = driver.findElement(By.xpath("(//*[text()=\"91,000\"])[1]"));
		String amt =price.getText();
		
		System.out.println("Iphone x Offer price: "+amt);
		driver.close();
		driver.quit();
		
		
		

	}

}
