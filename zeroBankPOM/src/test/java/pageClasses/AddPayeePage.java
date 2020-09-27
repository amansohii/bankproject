package pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AddPayeePage extends BasePage{

	public AddPayeePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//a[@href='/bank/redirect.html?url=pay-bills.html']")
	 public WebElement payBillsTab;
	 
	 @FindBy(xpath="//a[@href='#ui-tabs-2']")
	 public WebElement addNewPayeeTab;
	 
	 @FindBy(id="np_new_payee_name")
	 public WebElement payeeName;
	 
	 @FindBy(id="np_new_payee_address")
	 public WebElement payeeAddress;
	 
	 @FindBy(id="np_new_payee_account")
	 public WebElement payeeAccount;
	 
	 @FindBy(id="np_new_payee_details")
	 public WebElement payeeDetail;
	
	@FindBy(id="add_new_payee")
	public WebElement addBtn;
	  
	public void addBtnCLick(String pName, String pAddress, String pAccount, String pDetails) {
		payBillsTab.click();
		addNewPayeeTab.click();
		payeeName.sendKeys(pName);
		payeeAddress.sendKeys(pAddress);
		payeeAccount.sendKeys(pAccount);
		payeeDetail.sendKeys(pDetails);
		//addBtn.click();
		
		
	}
	

}
