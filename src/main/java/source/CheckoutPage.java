package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//a[contains(text(),'Change')]") WebElement addsel;
	@FindBy(xpath="(//input[@type='radio'])[3]") WebElement seladdr;
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]") WebElement deltothisaddress;
	@FindBy(xpath="//a[contains(text(),'Change')]") WebElement changeaddbutt;
	@FindBy(xpath="((//i[@class='a-icon a-icon-radio'])[2]") WebElement seladd;
	@FindBy(xpath="//span[@id='shipToThisAddressButton']") WebElement usethisaddr;
	@FindBy(xpath="") WebElement paymeth;
	@FindBy(xpath="") WebElement ordereview;
	
	//payment methods
	@FindBy(xpath="//a[@id='payChangeButtonId']") WebElement changepaybutt;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']") WebElement credebCard;
	@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']") WebElement netbank;
	@FindBy(xpath="//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTEzMzlWVDA1MTNIQg&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']") WebElement otherUPI;
	@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']") WebElement cod;
	@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']") WebElement emi;		
	@FindBy(id="checkout-primary-continue-button-id-announc") WebElement usethispayment;
	@FindBy(xpath="//input[@placeholder='Enter Code']") WebElement entercode;
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']") WebElement apply;
	
    @FindBy(xpath="(//div[@class='a-row a-spacing-small'])[12]") WebElement reviewitem;		
	
	
	//step 2

	public void address_selection_meth() throws InterruptedException
	{
		addsel.click();
		Thread.sleep(4000);
		seladdr.click();
		deltothisaddress.click();
//		changeaddbutt.click();
//		seladd.click();
//		usethisaddr.click();
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
		usethispayment.click();	
	}
	public void entercode_meth()
	{
		entercode.sendKeys("abc");
	}
	public void apply_meth()
	{
		apply.click();	
	}
	public void credebCard_meth()
	{
		credebCard.click();
	}
	public void netbank_meth()
	{
		netbank.click();	
	}
	public void otherUPI_meth()
	{
		otherUPI.click();	
	}
	public void emi_meth()
	{
		emi.click();	
	}
	public void cod_meth()
	{
		cod.click();	
	}
	public void reviewitem_meth()
	{
		boolean b1=reviewitem.isDisplayed();
		if(b1=true)
		{
		System.out.println("order reviewd");
		}
	}
	
	//step 3
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
