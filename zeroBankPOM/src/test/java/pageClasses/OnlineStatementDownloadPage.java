package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class OnlineStatementDownloadPage extends BasePage {

	public OnlineStatementDownloadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@href='/bank/redirect.html?url=online-statements.html']")
	public WebElement onlineStatementTab;
	
	@FindBy(id="os_accountId")
	public WebElement account;
	
	@FindBy(xpath="//a[contains(text(),'2011')]")
	public WebElement year;
	
	@FindBy(xpath="//a[@href='/bank/online-statements-by-name.html?name=8534567-05-12-11.pdf']")
	public WebElement pdfLink;
	
	public void statementDownload()
	{
		onlineStatementTab.click();
		Select dropDownFromAccount = new Select(account);
		dropDownFromAccount.selectByValue("5");
		
		try {
		    year.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		    year.click();
		}
		
		pdfLink.click();
		
	}


}
