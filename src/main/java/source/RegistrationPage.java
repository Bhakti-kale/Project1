package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Excel_data
{
	@FindBy(xpath="//input[@id='ap_customer_name']") WebElement name;
	@FindBy(xpath="//input[@id='ap_phone_number']") WebElement mobno;
	@FindBy(xpath="//input[@id='ap_password']") WebElement pass;
	@FindBy(xpath="//span[@id='auth-continue']") WebElement verifymob;
	@FindBy(xpath="//input[@id='auth-pv-enter-code']") WebElement otp;
	@FindBy(xpath="//span[@class='a-button-text']") WebElement createacc;
	@FindBy(xpath = "//input[@name='code']")    WebElement verifycode;
    @FindBy(xpath = "//span[.='Solve this puzzle to protect your account']")    WebElement solvethispuzzle;
	
	public void name_meth()
	{
		name.sendKeys(fullnamevalue);
	}
	public void mobno_meth()
	{
		mobno.sendKeys(mobilenumbervalue);
	}
	public void pass_meth()
	{
		pass.sendKeys(passwordvalue);
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
	public void verifyCode() {
        if (solvethispuzzle.isDisplayed()) {
            System.out.println("User can register.");
        } else if (verifycode.isDisplayed()) {
            System.out.println("User can register.");
        } else {
            System.out.println("User unable to register.");
        }
    }
	public String getmsg()
	{
		String txt1=verifycode.getText();
		return txt1;
	}
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
