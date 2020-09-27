package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseTest;

public class ScreenShot extends BaseTest{
	public static String screenshotPath;
	public static String screenshotName;
	
		public static void screenshotCapture() throws IOException {
		File srcFile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date= new Date();
		screenshotName = date.toString().replace(":", "_").replace(" ", "_") + ".png";
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\resources\\ScreenShort\\" + screenshotName));

}
}
