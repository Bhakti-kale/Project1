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

	public void prodTitle_meth()
	{
		boolean b1	=prodTitle.isDisplayed();
		if(b1=true)
		{
			System.out.println("title is displayed");
		}
	}
	public void price_meth()
	{
		boolean b2=price.isDisplayed();
		if(b2=true)
		{
			System.out.println("price is displayed");
		}
	}
	public void review_meth()
	{
		boolean b3	=review.isDisplayed();
		if(b3=true)
		{
			System.out.println("review is displayed");
		}
	}
	public void description_meth()
	{
		boolean b4	=descr.isDisplayed();
		if(b4=true)
		{
			System.out.println("description is displayed");
		}
	}
	
	
	
	
	public Productdetails_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
