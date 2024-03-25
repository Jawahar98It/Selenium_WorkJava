package dropdownchallenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbchallenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\dropdownselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createacc = driver.findElement(By.xpath("//*[text()=\"Create new account\"]"));
		createacc.click();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s = new Select(date);
		List<WebElement> options=s.getOptions();
		for (int i = 1; i < options.size(); i+=2) 
		{
			WebElement evenvalue=options.get(i);
			String date_data=evenvalue.getText();
			System.out.println(date_data);
		}
		driver.close();

	}

}
