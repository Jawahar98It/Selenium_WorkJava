package challengeshandlingwindows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedeptchalenge3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Challenge 3");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\handlingwindows\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("//*[@aria-controls=\"results-listbox\"]"));
		searchbox.sendKeys("Ceiling Fan");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		WebElement remotefan= driver.findElement(By.xpath("(//h5[@class=\"sui-h5-display sui-line-clamp-3 sui-text-primary\"])[5]"));
		act.moveToElement(remotefan).perform();
		remotefan.click();
		WebElement remoteceiling = driver.findElement(By.xpath("(//*[contains(text(),\"White Color Changing\")])[2]"));
		act.moveToElement(remoteceiling).perform();
		remoteceiling.click();
		String Parent_window=driver.getWindowHandle();
		Set<String> normal_window=driver.getWindowHandles();
		for (String string : normal_window) 
		{
			if(string != Parent_window)
			{
				driver.switchTo().window(string);
			}
		}
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		

	}

}
