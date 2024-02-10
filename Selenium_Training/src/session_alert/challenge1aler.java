package session_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge1aler {
	
	public static void challenge1(WebElement alertok, WebDriver driver,Alert a) throws InterruptedException {
		
		alertok=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		alertok.click();
		Thread.sleep(3000);
		 a=driver.switchTo().alert();
		String info = a.getText();
		System.out.println(info);
		a.accept();

	}
	public static void challenge2(WebElement alertconfirm,WebElement okalert,WebDriver driver,Alert a) throws InterruptedException {
		okalert=driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]"));
		okalert.click();
		alertconfirm=okalert.findElement(By.xpath("//*[text()=\"click the button to display a confirm box \"]"));
		alertconfirm.click();
		Thread.sleep(500);
		a=driver.switchTo().alert();
		String info2=a.getText();
		System.out.println(info2);
		a.accept();

	}
	public static void challenge3(WebElement textbox,WebElement alertprompt,Alert a,WebDriver driver) throws InterruptedException 
	{
		textbox=driver.findElement(By.xpath("//*[text()=\"Alert with Textbox \"]"));
		textbox.click();
		alertprompt=driver.findElement(By.xpath("//*[text()=\"click the button to demonstrate the prompt box \"]"));
		alertprompt.click();
		Thread.sleep(1400);
		a=driver.switchTo().alert();
		String data=a.getText();
		System.out.println(data);
		a.sendKeys("Testing Team");
		
		a.accept();
	
	}

	public static void main(String[] args) throws InterruptedException {
		//System.out.println("Challenge 1");
		System.setProperty("webdriver.chrome.driver", "E:\\Training_Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alertok = null,alertconfirm=null,alertprompt=null;
		WebElement okalert=null;
		WebElement textbox=null;
		Thread.sleep(1200);
		Alert a=null;
		challenge1(alertok,driver,a);
		challenge2(okalert,alertconfirm,driver,a);
		challenge3(textbox,alertprompt,a,driver);
		
		driver.close();
		driver.quit();

	}
	
	

}
