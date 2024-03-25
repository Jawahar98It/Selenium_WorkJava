package dropdownchallenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbchallenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 2");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\dropdownselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createacc = driver.findElement(By.xpath("//*[text()=\"Create new account\"]"));
		createacc.click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s = new Select(month);
		List<WebElement> value=s.getOptions();
		for (int i = 0; i < value.size(); i++) 
		{
			WebElement datas=value.get(i);
			String monthvalue=datas.getText();
			System.out.println(monthvalue);
		}
		driver.close();
		driver.quit();
	}

}
