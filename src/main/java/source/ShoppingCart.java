package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@id='nav-cart-count']") WebElement cart;
	@FindBy(xpath="(//input[@value='Delete'])[1]") WebElement remove;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']") WebElement quantity;
	
	@FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']") WebElement addedtocart;
	
	
	

	
	//step 2

	public void gotocart()
	{
		cart.click();
		
	}
	public void removeFromCart()
	{
		remove.click();
	}
	public void quantity_meth()
	{
		quantity.click();
		
	}
	public String addedtocart_meth()
	{
		String t1=addedtocart.getText();
		return t1;
		
	}
	//step 3
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
