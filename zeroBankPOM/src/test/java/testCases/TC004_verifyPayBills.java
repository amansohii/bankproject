package testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.PayBillsPage;

public class TC004_verifyPayBills extends BaseTest{
	public HomePage hp;
	public LoginPage lp;
	public PayBillsPage pbp;
	
	@Test (dataProvider= "PayBills1")	
	public void payBills(String pName1,String pAccount1, String pAmount1, String pDate1,  String pDesc1,String sno)
	{
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		pbp= new PayBillsPage(driver);
		
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text= driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));
	
		lp.logIn("username", "password");
		test.log(LogStatus.INFO, " User name and password is entered.");
		String text1= driver.getTitle();
		Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
		
		pbp.payBills(pName1, pAccount1, pAmount1,  pDate1,   pDesc1);
		test.log(LogStatus.INFO, "Payee's name , account, amount, and description is entered");
		String text2 = driver.findElement(By.id("alert_content")).getText();
		Assert.assertTrue(text2.contains("The payment was successfully submitted."));
		
	}
	

}
