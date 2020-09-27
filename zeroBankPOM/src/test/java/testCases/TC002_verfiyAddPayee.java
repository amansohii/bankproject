package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.AddPayeePage;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class TC002_verfiyAddPayee extends BaseTest {
	public HomePage hp;
	public LoginPage lp;
	public AddPayeePage app;
	
	@Test(dataProvider = "AddPayee")
	public void verfiyAddPayee(String pName1, String pAddress1, String pAccount1, String pDetail1, String sno) {

		hp= new HomePage(driver);
		lp= new LoginPage(driver);
		app= new AddPayeePage(driver);
		hp.ClickOnSignbtn();
		test.log(LogStatus.INFO, "SignIn button is clicked");
		String text = driver.getTitle();
		Assert.assertTrue(text.contains("Zero - Log in"));

		lp.logIn("username", "password");
		test.log(LogStatus.INFO, " User name and password is entered.");
		String text1 = driver.getTitle();
		Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
		
		
		app.addBtnCLick(pName1, pAddress1, pAccount1, pDetail1);
		test.log(LogStatus.INFO, " Payee's name, address, account and detail is entered.");
		String text2 = driver.findElement(By.id("alert_content")).getText();
		Assert.assertTrue(text2.contains("was successfully created."));
	}

}
