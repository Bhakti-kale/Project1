package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetails_page
{
	
	@FindBy(xpath="//span[@id='productTitle']") WebElement prodTitle;
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center aok-relative']/span/span/span[2]") WebElement price;
	@FindBy(xpath="//h3[.='Reviews with images']") WebElement review;
	@FindBy(xpath="//h2[.=' Product description  ']") WebElement descr;

	public String prodTitle_meth()
	{
		String tit=prodTitle.getText();
		return tit;
	}
	public String price_meth()
	{
		String pr=price.getText();
		return pr;
		
	}
	public boolean review_meth()
	{
		return review.isDisplayed();
		
	}
	public boolean description_meth()
	{
		return descr.isDisplayed();
		
	}
	
	
	
	
	public Productdetails_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
