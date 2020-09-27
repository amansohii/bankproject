package Base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExcelReader;
import utilities.ExtentManager;



public class BaseTest extends ExcelReader {

	public static  WebDriver driver;

	public ExtentReports rep=ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeClass
	public WebDriver setUp() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	
	
	}
	
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}





