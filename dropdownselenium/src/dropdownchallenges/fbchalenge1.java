package dropdownchallenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbchalenge1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 1");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\dropdownselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createacc = driver.findElement(By.xpath("//*[text()=\"Create new account\"]"));
		createacc.click();
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select value = new Select(year);
		List<WebElement> options = value.getOptions();
		for (int i = 0; i < options.size(); i++) 
		{
			WebElement data = options.get(i);
			String years =data.getAttribute("value");
			System.out.println(years);
		}
		driver.close();
		driver.quit();
	}

}
