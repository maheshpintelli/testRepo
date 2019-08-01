package staleElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(id="login_field")
	public WebElement username;
	
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Sign in']")
	public WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}