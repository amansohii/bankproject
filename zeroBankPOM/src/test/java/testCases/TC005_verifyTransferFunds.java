package testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.TransferFundsPage;

public class TC005_verifyTransferFunds extends BaseTest{
	public HomePage hp;
	public LoginPage lp;
	public TransferFundsPage tfp;
	
	@Test (dataProvider= "TransferFunds1")
	public void tranferFunds(String fAccount, String TAccount, String TAmount, String TDescription, String sno)
	{
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		tfp= new TransferFundsPage(driver);
		
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text= driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));
	
		lp.logIn("username", "password");
		test.log(LogStatus.INFO, " User name and password is entered.");
		String text1= driver.getTitle();
		Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
		
		tfp.transferPayment(fAccount,TAccount,TAmount,TDescription);
		test.log(LogStatus.INFO, "Payee's from account ,To account, amount, and description is entered");
		String text2 = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
		Assert.assertTrue(text2.contains("You successfully submitted your transaction."));
	}
	

}
