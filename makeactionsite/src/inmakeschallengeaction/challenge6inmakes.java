package inmakeschallengeaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class challenge6inmakes {

	public static void main(String[] args) {
		System.out.println("Challenge 6");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\makeactionsite\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/home");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
		action.moveToElement(course).perform();
		WebElement softest = driver.findElement(By.xpath("//*[text()=\"Software Testing Tamil\"]"));
		action.moveToElement(softest).perform();
		WebElement master = driver.findElement(By.xpath("//*[text()=\"ST Master Class\"]"));
		action.moveToElement(master).perform();
		master.click();
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		System.out.println("Current Page Title:"+driver.getTitle());
		driver.close();
		driver.quit();

	}

}
