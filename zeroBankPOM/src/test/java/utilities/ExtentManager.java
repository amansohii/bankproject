package utilities;



import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	public  static ExtentReports extent;

	public static ExtentReports getInstance() {
		// TODO Auto-generated method stub 
		if (extent==null)
		{
			extent = new ExtentReports("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\resources\\reports\\extent.html");
			//extent = new ExtentReports(System.getProperty(("user.dir")+"\\src\\test\\resources\\reports\\extent.html"),true,DisplayOrder.OLDEST_FIRST);
			//extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\ReportsConfig.xml"));
		
			
		}
		
		return extent;
		
		
	}

}
