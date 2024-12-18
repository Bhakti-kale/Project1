package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	@FindBy(xpath="//input[@id='ap_customer_name']") WebElement name;
	@FindBy(xpath="//input[@id='ap_phone_number']") WebElement mobno;
	@FindBy(xpath="//input[@id='ap_password']") WebElement pass;
	@FindBy(xpath="//span[@id='auth-continue']") WebElement verifymob;
	@FindBy(xpath="//input[@id='auth-pv-enter-code']") WebElement otp;
	@FindBy(xpath="//span[@class='a-button-text']") WebElement createacc;
	
	public void name_meth()
	{
		name.sendKeys("Bhakti");
	}
	public void mobno_meth()
	{
		mobno.sendKeys("7709055537");
	}
	public void pass_meth()
	{
		pass.sendKeys("Dnyanada@123");
	}
	public void verifymob_meth()
	{
		verifymob.click();
	}
	public void otp_meth()
	{
		otp.sendKeys("123");
	}
	public void createacc_meth()
	{
		createacc.click();
	}
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
