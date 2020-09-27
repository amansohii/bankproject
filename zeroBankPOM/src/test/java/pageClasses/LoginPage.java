package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="user_login")
	public WebElement userName;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy (name="submit")
	public WebElement logInBtn;
	
	public void logIn(String uName, String pword)
	{
		userName.sendKeys(uName);
		password.sendKeys(pword);
		logInBtn.click();
	}
	

}
