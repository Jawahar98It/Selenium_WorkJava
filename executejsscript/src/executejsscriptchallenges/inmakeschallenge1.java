package executejsscriptchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inmakeschallenge1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Challenge 1");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\executejsscript\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sentence = driver.findElement(By.xpath("//*[contains(text(),\"kinds\")]"));
		js.executeScript("arguments[0].scrollIntoView(true)", sentence);
		Thread.sleep(2400);
		//System.out.println(sentence.getText());
		Object txt=js.executeScript("return arguments[0].innerText", sentence);
		System.out.println(txt);
		driver.close();
		driver.quit();

	}

}
