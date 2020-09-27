package testCases;
	import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.OnlineStatementDownloadPage;


	public class TC003_verfiyOnlineStatementDownload extends BaseTest{
		public HomePage hp;
		public LoginPage lp;
		public OnlineStatementDownloadPage osdp;
		
		@Test 
		public void OnlineStatementdownload()
		{
			
			hp= new HomePage(driver);
			lp= new LoginPage(driver);
			osdp= new OnlineStatementDownloadPage(driver);
			hp.ClickOnSignbtn();
			test.log(LogStatus.INFO, "SignIn button is clicked");
			String text= driver.getTitle();
			Assert.assertTrue(text.contains("Zero - Log in"));
		
			lp.logIn("username", "password");
			test.log(LogStatus.INFO, " User name and password is entered.");
			String text1= driver.getTitle();
			Assert.assertTrue(text1.contains("Zero - Account Summary"), "Page not found");
			
			osdp.statementDownload();
			test.log(LogStatus.INFO, "E-statement is downloaded");
			
			driver.navigate().to("chrome://downloads/");
			test.log(LogStatus.INFO, "Navigate to downloads");
			WebDriverWait wait=new WebDriverWait(driver, 30);
			String bodyText= driver.findElement(By.tagName("body")).getText();
			Assert.assertTrue(bodyText.contains("8534567-05-12-11.pdf"), "File not found");
			
		}
		

	}
