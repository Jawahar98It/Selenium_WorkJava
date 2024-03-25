package inmakeschallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sampledata extends baseclass{

	public static void main(String[] args) throws InterruptedException 
	{
		launchbrowser();
		launchurl("https://www.facebook.com/");
		windowMaximize();
		
		
		fblogin chal1= new fblogin();
		
	
		
		
		//WebElement email=driver.findElement(By.xpath("//*[@placeholder=\"Email address or phone number\"]"));
		passText("testing@gmail.com",chal1.getEmail());
		
		
		//WebElement password = driver.findElement(By.xpath("//*[@aria-label=\"Password\"]"));
		passText("Data123",chal1.getPassword());
		
		submtbtn(chal1.getLogin());
		
		Thread.sleep(8000);
		driver.navigate().refresh();
		
		passText("tester@yahoo.com",chal1.getEmail());
		
		passText("Selenium@123",chal1.getPassword());
		
		submtbtn(chal1.getLogin());
		
		Thread.sleep(12000);
		
		closebrowser();

	}

}
