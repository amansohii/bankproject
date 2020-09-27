package testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.PurchaseForeignCurrencyPage;

public class TC006_verfiyPurchaseForeignCurrency extends BaseTest{
	public HomePage hp;
	public LoginPage lp;
	public PurchaseForeignCurrencyPage pfcp;
	
	@Test (dataProvider= "PurchaseCurrency")
	public void foreignCurrency(String currency,String pAmount, String sno)
	{
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		pfcp= new PurchaseForeignCurrencyPage(driver);
		
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text= driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));
	
		lp.logIn("username", "password");
		test.log(LogStatus.INFO, " User name and password is entered.");
		String text1= driver.getTitle();
		Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
		
		pfcp.foreignCurrency(currency, pAmount);
		test.log(LogStatus.INFO, "Currency, amount is entered");

		String text2 = driver.findElement(By.id("alert_content")).getText();
		Assert.assertTrue(text2.contains("Foreign currency cash was successfully purchased."));
		
	}


}
