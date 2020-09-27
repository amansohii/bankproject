package pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class PayBillsPage extends BasePage {

	public PayBillsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@href='/bank/redirect.html?url=pay-bills.html']")
	public WebElement payBillsTab;
	
	@FindBy(id="sp_payee")
	public WebElement payeeName;
	
	@FindBy(id="sp_account")
	public WebElement payeeAccount;
	
	@FindBy(id="sp_amount")
	public WebElement payeeAmount;
	
	@FindBy(id="sp_date")
	public WebElement date;
	
	
	@FindBy(id="sp_description")
	public WebElement payeeDesc;
	
	@FindBy(id="pay_saved_payees")
	public WebElement payBtn;
	
	public void payBills(String pName,String pAccount, String pAmount, String pDate,  String pDesc)
	{
		payBillsTab.click();
		
		Select dropdwonPayeeName =new Select(payeeName);
		dropdwonPayeeName.selectByValue(pName);
		
		Select dropDownAccount= new Select(payeeAccount);
		dropDownAccount.selectByValue(pAccount);
		
		payeeAmount.sendKeys(pAmount);
		
		date.sendKeys(pDate);
						
		payeeDesc.sendKeys(pDesc);
		payBtn.click();
		
		
	}

}
