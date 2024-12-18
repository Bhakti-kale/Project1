package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']") WebElement editaddress;
	@FindBy(id="ya-myab-address-edit-btn-0") WebElement edit;
	@FindBy(xpath="(//input[@class='a-button-input'])[3]") WebElement update;

	public void editaddress_meth()
	{
		editaddress.click();
	}
	public void edit_meth()
	{
        edit.click();
	}
	public void update_meth()
	{
        update.click();
	}
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
