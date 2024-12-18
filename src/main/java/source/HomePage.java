package source;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']") WebElement accountandlist;
	@FindBy(xpath="(//a[.='Start here.'])[1]") WebElement starthere;
	@FindBy(xpath="(//span[.='Sign in'])[1]") WebElement signin;
	@FindBy(id="twotabsearchtextbox") WebElement search_tf;
	@FindBy(xpath="//button[.='Manage Profiles']") WebElement manageProfile;
	@FindBy(xpath="//span[.='Your Account']") WebElement youraccount;
	@FindBy(id="nav-orders") WebElement returnandorder;
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']") WebElement sortby;
	
	@FindBy(xpath="//span[@class='a-price']") List<WebElement> allprices;
	//step 2
	public void accountandlist_hoverhover(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		
	}
	public void signin_method()
	{
		signin.click();
	}
	public void searching()
	{
		search_tf.sendKeys("shoe"+Keys.ENTER);
	}
	public void starthere_meth()
	{
		starthere.click();
	}
	public void manageProfile_meth()
	{
		manageProfile.click();
	}
	public void youraccount_meth()
	{
		youraccount.click();
	}
	public void returnandorder_meth()
	{
		returnandorder.click();
	}
	public void sortby_meth() throws InterruptedException
	{
		
		Select s1=new Select(sortby);
		s1.selectByVisibleText("Price: Low to High");
		
		//s1.selectByVisibleText("Price: High to Low");
		//Thread.sleep(5000);
		//s1.selectByVisibleText("Avg. Customer Review");
	}
	

	
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
