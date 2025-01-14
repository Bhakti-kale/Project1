package source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{
	WebDriver driver;
	//step 1	
	@FindBy(xpath="(//input[@type='submit'])[2]") WebElement deltothisaddress;
	@FindBy(xpath="//a[normalize-space()='Change']") WebElement changeaddbutt;
	@FindBy(xpath="//span[@id='shipToThisAddressButton']") WebElement usethisaddr;
	@FindBy(xpath="//a[@id='prime-interstitial-nothanks-button']") WebElement nothanks;
	
	@FindBy(xpath="") WebElement paymeth;
	@FindBy(xpath="") WebElement ordereview;
	
	//payment methods
	@FindBy(xpath="//a[@aria-label='Change payment method']") WebElement changepaybutt;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']") WebElement credebCard;
	@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']") WebElement netbank;
	@FindBy(xpath="//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTEzMzlWVDA1MTNIQg&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']") WebElement otherUPI;
	@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']") WebElement cod;
	@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']") WebElement emi;		
	@FindBy(xpath="//input[@data-testid='bottom-continue-button']") WebElement usethispayment;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']") WebElement entercode;
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']") WebElement apply;
	
    @FindBy(xpath="//h2[@class='a-size-medium a-spacing-none address-promise-text a-text-bold']") WebElement reviewitem;		
	
	
	//step 2

	public void address_selection_meth() throws InterruptedException
	{
		
	changeaddbutt.click();	
	Thread.sleep(7000);
	deltothisaddress.click();
	}
	
	public void nothanks_meth()
	{
		nothanks.click();
	}
	
	public void delevertothisadd_meth() throws InterruptedException
	{
		try {
			changeaddbutt.click();
		}catch(NoSuchElementException e)
		{
			System.out.println("not present");
		}
		catch(Exception e)
		{
			System.out.println("not present");
		}
	
	}
	
	public void payment_meth()
	{
		changepaybutt.click();
		
	}
	public void ordereview_meth()
	{
		
	}
	public void usethispayment_meth()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(usethispayment)).click();
		//usethispayment.click();	
	}
	public void entercode_meth()
	{
		entercode.sendKeys("abc");
	}
	public void apply_meth()
	{
		apply.click();	
	}
	public boolean credebCard_meth()
	{
		credebCard.click();
		return credebCard.isSelected();
	}
	public boolean netbank_meth()
	{
		netbank.click();
		return netbank.isSelected();
	}
	public boolean otherUPI_meth()
	{
		otherUPI.click();
		return otherUPI.isSelected();
	}
	public boolean emi_meth()
	{
		emi.click();
		return emi.isSelected();	
	}
	public boolean cod_meth()
	{
		cod.click();
		return cod.isSelected();
	}
	public String reviewitem_meth()
	{
		return reviewitem.getText();
	}
	
	//step 3
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
