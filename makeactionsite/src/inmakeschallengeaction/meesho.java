package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class meesho {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement Mensection = driver
				.findElement(By.xpath("(//*[@class=\"NavBarDesktop__Subtitle-sc-xsryom-0 izctWK\"])[3]"));
		action.moveToElement(Mensection).perform();
		WebElement Shirts = driver.findElement(By.xpath("//*[@href=\"/shirts-men/pl/3jq\"]"));
		action.moveToElement(Shirts).perform();
		Shirts.click();
		Thread.sleep(9000);
		System.out.println("Current url:" + driver.getCurrentUrl());
		System.out.println("Current Page title:" + driver.getTitle());
		driver.close();
		driver.quit();

	}

}
