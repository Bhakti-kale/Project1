package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerachResultPage 
{
	@FindBy(xpath="") WebElement category;
	@FindBy(xpath="") WebElement pricerange;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']") WebElement costReview;
	@FindBy(xpath="//span[.='Get It by Tomorrow']") WebElement deliveryday;//span[.='Tomorrow 8 am - 12 pm ']
	
	
	public void deliveryday_meth()
	{
		deliveryday.click();
//		boolean b5=deliveryday.isDisplayed();
//		if(b5=true)
//		{
//			System.out.println("filtered correctly");
//		}
	}
	public void costReview_meth()
	{
		costReview.click();
	}
	
	
	
	
	public SerachResultPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
