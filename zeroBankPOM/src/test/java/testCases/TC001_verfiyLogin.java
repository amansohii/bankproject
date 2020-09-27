package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;


public class TC001_verfiyLogin extends BaseTest{
	
	public HomePage hp;
	public LoginPage lp;
	
	@Test
	public void verifyLogin()
	{
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text= driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));
	
		lp.logIn("username", "password");
		test.log(LogStatus.INFO, " User name and password is entered.");
		String text1= driver.getTitle();
		Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
	}
	
	


	
	
	

}
