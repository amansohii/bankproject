package pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class PurchaseForeignCurrencyPage extends BasePage{

	public PurchaseForeignCurrencyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//a[@href='/bank/redirect.html?url=pay-bills.html']")
	 public WebElement payBillsTab;
	 
	 @FindBy(xpath="//a[@href='#ui-tabs-3']")
	 public WebElement foreignCurrencyTab;
	 
	 @FindBy(id="pc_currency")
	 public WebElement currencySelect;
	 
	 @FindBy(id="sp_sell_rate")
	 public WebElement sellRateMsg;
	 
	 @FindBy(id="pc_amount")
	 public WebElement amount;
	 
	 @FindBy(id="pc_inDollars_true")
	 public WebElement dollarUSRadio;
	 
	 @FindBy(id="pc_inDollars_false")
	 public WebElement selectCurrencyRadio;
	
	@FindBy(id="pc_calculate_costs")
	public WebElement calculateCurrencyBtn;
	
	@FindBy(id="pc_conversion_amount")
	 public WebElement conversionAmountDescription;
	
	@FindBy(id="purchase_cash")
	public WebElement purchaseBtn;
	  
	public void foreignCurrency(String currency,String pAmount) {
		payBillsTab.click();
		foreignCurrencyTab.click();
		
		Select currencyDrop= new Select(currencySelect);
		currencyDrop.selectByValue(currency);
		
		sellRateMsg.getText().contains("U.S. dollar (USD)");
		
		amount.sendKeys(pAmount);
		
		dollarUSRadio.click();
		
		calculateCurrencyBtn.click();
		conversionAmountDescription.getText().contains("U.S. dollar (USD)");
		purchaseBtn.click();
		
	}
	

}
