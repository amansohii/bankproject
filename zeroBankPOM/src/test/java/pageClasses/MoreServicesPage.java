package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class MoreServicesPage extends BasePage {
	
	public MoreServicesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	@FindBy(id="online-banking")
	public WebElement moreServBtn;
	
	@FindBy(id="account_summary_link")
	public WebElement accSummary ;
	
	@FindBy(id="account_activity_link")
	public WebElement accActivity ;
	
	@FindBy(id="transfer_funds_link")
	public WebElement transFunds  ;
	
	@FindBy(id="pay_bills_link")
	public WebElement payBills  ;
	
	@FindBy(id="money_map_link")
	public WebElement moneyMap  ;
	  
	@FindBy(id="online_statements_link")
	public WebElement onlnStatment  ;
	
	public void moreServices() {
		moreServBtn.click();
		}
	public void accountsummary()
	{
		accSummary.click();	
	}
	public void accountactivity()
	{
		accActivity.click();
	}
	public void transfunds()
	{
		transFunds.click();
	}
	public void paybills()
	{
		payBills.click();
	}
	public void moneymap()
	{
		moneyMap.click();
	}
	public void onlinestatement()
	{
		onlnStatment.click();
	}
	
	


}
