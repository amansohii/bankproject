package testCases;



import org.testng.annotations.*;

import Base.BaseTest;
import pageClasses.ForgetPasswordPage;
import pageClasses.MoreServicesPage;


public class TC007_verfiyMoreServices extends BaseTest{
	public MoreServicesPage msp;
	
	@Test
	public void moreServices()
	{
		msp= new MoreServicesPage(driver);
		msp.moreServices();
		msp.accountactivity();
	
		
	}
	

}
