package inmakeschallengesiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 public class icicichallenge5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 5");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\iframeselenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement userid= driver.findElement(By.xpath("//*[@id=\"AuthenticationFG.USER_PRINCIPAL\"]"));
		js.executeScript("arguments[0].setAttribute('value','Bank@123')", userid);
		Thread.sleep(8500);
		Object username=js.executeScript("return arguments[0].getAttribute('value')", userid);
		System.out.println(username);
		driver.close();
		driver.quit();

	}

}
