package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class TransferFundsPage extends BasePage {

	public TransferFundsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@href='/bank/redirect.html?url=transfer-funds.html']")
	public WebElement transferFundTab;
	
	@FindBy(id="tf_toAccountId")
	public WebElement fromAccount ;
	
	
	@FindBy(id="tf_toAccountId")
	public WebElement toAccount ;
	
	@FindBy(id="tf_amount")
	public WebElement amount;
	
	@FindBy(id="tf_description")
	public WebElement description;
	
	@FindBy(id="btn_submit")
	public WebElement continueBtn;

	
	public void transferPayment(String fAccount, String TAccount, String TAmount, String TDescription)
	{
		transferFundTab.click();
		
		Select dropDownFromAccount = new Select(fromAccount);
		dropDownFromAccount.selectByValue(fAccount);
		
		Select dropDownToAccount = new Select(toAccount);
		dropDownToAccount.selectByValue(TAccount);
		
		amount.sendKeys(TAmount);
		
		description.sendKeys(TDescription);
		
		//Actions actions = new Actions(driver);
		//actions.doubleClick(continueBtn).perform();

		continueBtn.click();
		continueBtn.click();
		
	}
	

}
