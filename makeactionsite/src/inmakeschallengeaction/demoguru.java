package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoguru {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 1");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		Actions action = new Actions(driver);
		WebElement debitacc=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		action.dragAndDrop(bank, debitacc).perform();
		WebElement sales =driver.findElement(By.xpath("//*[text()=' SALES ']"));
		WebElement creditacc = driver.findElement(By.xpath(" (//li[@class='placeholder'])[2]"));
		action.dragAndDrop(sales, creditacc).perform();
		WebElement amount=driver.findElement(By.xpath("//*[text()=\" 5000 \"]"));
		WebElement debitamt=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		action.dragAndDrop(amount, debitamt).perform();
		WebElement amt2=driver.findElement(By.xpath("//*[text()=\" 5000\"]"));
		WebElement creditamt=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		action.dragAndDrop(amt2, creditamt).perform();
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		

	}

}
