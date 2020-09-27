package Base;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ScreenShot;



public class CustomListeners extends BaseTest implements ITestListener  {

	

	@Override
	public void onTestStart(ITestResult arg0) {
		test = rep.startTest(arg0.getName().toUpperCase());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
		rep.endTest(test);
		rep.flush();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.screenshotCapture();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Below is for extent report, it will attach screenshot in the extent report
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception : "+result.getThrowable());
		test.log(LogStatus.INFO, test.addScreenCapture(ScreenShot.screenshotName));
		
		rep.endTest(test);
		rep.flush();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
