package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	public static DataFormatter formatter = new DataFormatter();
public static String path;
public static int sheetindex;
	@DataProvider(name = "ForgetPassword")
		public Object[][] Forgetpwd() throws IOException {
		Object[][] arrayObject = getExcelData("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\Excel\\ZeroBankData.xlsx",0);
		return arrayObject;
	}

	@DataProvider(name = "AddPayee")
	public Object[][] addpayee() throws IOException {
	Object[][] arrayObject = getExcelData("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\Excel\\ZeroBankData.xlsx",1);
	return arrayObject;
}
	
	@DataProvider(name = "PayBills1")
	public Object[][] paybills() throws IOException {
	Object[][] arrayObject = getExcelData("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\Excel\\ZeroBankData.xlsx",2);
	return arrayObject;
}
	
	@DataProvider(name = "PurchaseCurrency")
	public Object[][] currency() throws IOException {
	Object[][] arrayObject = getExcelData("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\Excel\\ZeroBankData.xlsx",3);
	return arrayObject;
	

}
	@DataProvider(name = "TransferFunds1")
	public Object[][] tFunds() throws IOException {
	Object[][] arrayObject = getExcelData("C:\\Users\\Sohi\\eclipse-workspace\\zeroBankPOM\\src\\test\\Excel\\ZeroBankData.xlsx",4);
	return arrayObject;
	

}
	
	
	
	public String[][] getExcelData(String path, int sheetindex) throws IOException {
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(sheetindex);

		int rowCount = sheet.getLastRowNum();
		//System.out.println("Row Count is " + rowCount);
	

		XSSFRow columnCount = sheet.getRow(0);
		int col = columnCount.getLastCellNum();
		//System.out.println("Column Count is " + col);

		String[][] data = new String[rowCount][col];
		
		for (int i = 1; i <= rowCount; i++) {
			

			for (int j = 1; j < col; j++) 
			{
				//System.out.println(formatter.formatCellValue(sheet.getRow(i).getCell(j)).trim());
				data[i-1 ][j-1] = formatter.formatCellValue(sheet.getRow(i).getCell(j)).trim();
				
			}
		}
		wb.close();
		return data;

	}
}
