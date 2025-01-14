package source;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerachResultPage 
{
	WebDriver driver;
	@FindBy(xpath="") WebElement category;
	@FindBy(xpath="//div[@id='p_36/range-slider_slider-item']") WebElement pricerange;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']") WebElement costReview;
	@FindBy(xpath="//span[.='Get It by Tomorrow']") WebElement deliveryday;//span[.='Tomorrow 8 am - 12 pm ']
	
	
	public void pricerange_meth(WebDriver driver) throws AWTException
	{
		//pricerange.click();
				
		Actions a1=new Actions(driver);
	    a1.contextClick(pricerange).perform();   //right click
	    //a1.click(pricerange);
		//to select option after doing rigfht click
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyPress(KeyEvent.VK_RIGHT);
	}
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
