package source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Excel_data
{
	WebDriver driver;
	//step 1
	@FindBy(id="ap_email") WebElement username;
	@FindBy(id="continue") WebElement continue_button;
	@FindBy(name="password") WebElement password;
	@FindBy(id="signInSubmit") WebElement signin_button;
	
	@FindBy(xpath="//span[contains(text(),'Your password is incorrect')]") WebElement errormsg;

	
	//step 2
	public void un()
	{
		username.sendKeys(name);
	}
	public void cnt()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password.sendKeys(pass);
	}
	public void incorrectpwd()
	{
		password.sendKeys(pass2);
	}
	public void signin()
	{
		signin_button.click();
	}
	public String errormsg_meth()
	{
		String errmsg= errormsg.getText();
		return errmsg;
		
		
//		if(errormsg.isDisplayed())
//		{
//			System.out.println("Test case passed with incorrect id or pass");
//		}
//		else {
//			System.out.println("tc failed");
//		}
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
