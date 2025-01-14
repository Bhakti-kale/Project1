package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
	
	@FindBy(xpath="//h2[contains(text(),'Login & security')]") WebElement loginnsecurity;
	@FindBy(xpath="//span[@id='NAME_BUTTON']") WebElement editname;
	@FindBy(xpath="//input[@id=\"cnep_1C_submit_button\"]") WebElement savechanges;
	@FindBy(xpath="//div[contains(text(),'Name updated.')]") WebElement updatemsg;

	public void loginnsecurity_meth()
	{
		loginnsecurity.click();
	}
	public void editname_meth()
	{
		editname.click();
	}
	public void savechanges_meth()
	{
		savechanges.click();
	}
	public String updatemsg_meth()
	{
		String txt= updatemsg.getText();
		return txt;
	}
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
