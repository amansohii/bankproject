package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.ForgetPasswordPage;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class TC008_verifyForgetPassword extends BaseTest{
	public HomePage hp;
	public LoginPage lp;
	public ForgetPasswordPage fpp;
	
	@Test (dataProvider= "ForgetPassword") 	
	public void verfiyforgetpwd(String email, String sno)
	{
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		fpp= new ForgetPasswordPage(driver);
		
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text= driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));
	
		fpp.forgetPwd(email);	
		test.log(LogStatus.INFO, "Email-ID is entered");
		String aa= fpp.emailTextbox.getAttribute("value");
		
		if(aa.contains("@") )
		{
		
		fpp.forgetPwdBtn();
		
		}
		else
		{
			System.out.println("Enter email ID");
		}
		
		String actualPage= "http://zero.webappsecurity.com/forgotten-password-send.html";
		test.log(LogStatus.INFO, "EmailID is sent");
		String expectedPage= driver.getCurrentUrl();
		System.out.println(expectedPage);
		Assert.assertEquals(actualPage, expectedPage);
	}
}
