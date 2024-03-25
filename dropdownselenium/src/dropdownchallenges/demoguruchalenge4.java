package dropdownchallenges;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoguruchalenge4 {

	public static void main(String[] args) {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\dropdownselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select s = new Select(country);
		List<WebElement>options=s.getOptions();
		for (int i = 0; i < options.size(); i++) 
		{
			WebElement data=options.get(i);
			String country_name=data.getText();
			System.out.println(country_name);
		}
		driver.close();
		driver.quit();
	}

}
