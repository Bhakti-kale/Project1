package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//img[@alt='select to rate item five star.']") WebElement rating;
	
	
	//step 2

	public void rating_meth()
	{
		rating.click();
	}
	//step 3
	public ReviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
