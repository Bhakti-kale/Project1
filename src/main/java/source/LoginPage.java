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

public class LoginPage 
{
	WebDriver driver;
	//step 1
	@FindBy(id="ap_email") WebElement username;
	@FindBy(id="continue") WebElement continue_button;
	@FindBy(name="password") WebElement password;
	@FindBy(id="signInSubmit") WebElement signin_button;
	
	@FindBy(xpath="//span[contains(text(),'Your password is incorrect')]") WebElement errormsg;

	
	//step 2
	public void un() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\Bhakti\\eclipse-workspace\\Project1\\ExcelSheet\\Credentials.xlsx");//let java knows location of excel sheet with help of fileinput stream class
		Workbook w1=	WorkbookFactory.create(f1);//to open excel sheet f1
		//String un1=	NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String un=	w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pass=	w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		username.sendKeys(un);	
		continue_button.click();
		password.sendKeys(pass);
		System.out.println("This is my username-->"+un);
	}
	public void incorrectun() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\Bhakti\\eclipse-workspace\\Project1\\ExcelSheet\\Credentials.xlsx");//let java knows location of excel sheet with help of fileinput stream class
		Workbook w1=	WorkbookFactory.create(f1);//to open excel sheet f1
		//String un1=	NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String un=	w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String pass=	w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		username.sendKeys(un);	
		continue_button.click();
		password.sendKeys(pass);
		System.out.println("This is my pass-->"+pass);
	}
//	public void cnt()
//	{
//		continue_button.click();
//	}
//	public void pwd()
//	{
//		password.sendKeys(pass);
//		
//	}
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
