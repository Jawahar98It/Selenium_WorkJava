package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class shopclueschallenge4 {

	public static void main(String[] args) {
		System.out.println("Challenge4");
		System.setProperty("webdriver.gecko.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//*[text()=\"Mobiles & More\"]"));
		action.moveToElement(mobile).perform();
		WebElement apple = driver.findElement(By.xpath("//*[text()=\"Apple\"]"));
		action.moveToElement(apple).perform();
		String value=apple.getText();
		System.out.println("Value in the dropdown:"+value);
		driver.close();
		driver.quit();
		

	}

}
