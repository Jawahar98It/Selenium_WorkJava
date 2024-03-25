package inmakeschallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin extends baseclass {
	
	public fblogin()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//*[@aria-label=\"Password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@name=\"login\"]")
	private WebElement login;
	
	
	
	public WebElement getEmail() {
		return email;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}


}
