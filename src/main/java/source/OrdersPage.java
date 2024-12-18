package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@id='a-autoid-5']") WebElement writeprodrev;
	
	
	//step 2

	public void write_prod_review_meth()
	{
		writeprodrev.click();
	}
	//step 3
	public OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
