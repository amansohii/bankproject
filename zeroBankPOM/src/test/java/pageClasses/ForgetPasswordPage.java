package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ForgetPasswordPage extends BasePage {

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@href='/forgot-password.html']")
	public WebElement forgetPwdLink;
	
	@FindBy(id="user_email")
	public WebElement emailTextbox;
	
	@FindBy (className= "btn-primary")
	public WebElement sendPwdBtn;
	
	public void forgetPwd(String emailid)
	{
		forgetPwdLink.click();
		emailTextbox.sendKeys(emailid);
	
		//sendPwdBtn.click();
	}
	
	public void forgetPwdBtn()
	{
		sendPwdBtn.click();
	}
	

}
