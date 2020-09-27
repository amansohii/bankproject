package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	@FindBy(id="signin_button")
	public WebElement btnSignIn;
	  
	public void ClickOnSignbtn() {
		btnSignIn.click();
	}
	


}
