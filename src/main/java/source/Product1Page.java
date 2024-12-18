package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1Page 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]") WebElement prod;
	@FindBy(id="add-to-wishlist-button-submit") WebElement addwishlist;
	@FindBy(xpath=" //button[@data-action='a-popover-close']") WebElement closePop;
	@FindBy(xpath="//input[@id='add-to-cart-button']") WebElement addcart;
	//input[@id='buy-now-button']
	@FindBy(xpath="//input[@id='buy-now-button']") WebElement buynow;
	
	//product details--it is there on productdetailspage
	

	

	
	//step 2

	public void product(WebDriver driver)
	{
		prod.click();
		//System.out.println(driver.getWindowHandles());
		Set <String> s1=	driver.getWindowHandles();
		Iterator <String> i1= s1.iterator();
		String parentid=	i1.next();
		String childid=	i1.next();
		driver.switchTo().window(childid);
		//addwishlist.click();
		
		
	}
	public void addtowishlist()
	{
		addwishlist.click();
	}
	public void closepopup()
	{
		closePop.click();
	}
	
	public void addtocart()
	{
		addcart.click();
	}
	public void buynow_meth()
	{
		buynow.click();
	}
	
	//step 3
	public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
