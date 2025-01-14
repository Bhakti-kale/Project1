//11.validate the entire checkout process,including address selection,payment method selection and order review 
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.CheckoutPage;
import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
@Listeners(Listner_logic.class)
public class Testcase11 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void validate_checkout_proc() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Excel_data ed=new Excel_data();
		ed.datafetching();

		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		Thread.sleep(5000);
		
		LoginPage login=new LoginPage(driver);
		Thread.sleep(2000);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();
		Thread.sleep(3000);
		home.searching();
		
		Product1Page prod=new Product1Page(driver);
		prod.product(driver);
		prod.addtocart();
		Thread.sleep(2000);
		prod.proceedtobuy_meth();
		Thread.sleep(5000);
		
		CheckoutPage check=new CheckoutPage(driver);
		check.address_selection_meth();
		Thread.sleep(3000);
		check.nothanks_meth();
		Thread.sleep(2000);
		check.payment_meth();
		Thread.sleep(5000);
     	check.cod_meth();
		Thread.sleep(2000);
     	check.usethispayment_meth();
		Thread.sleep(5000);
		String t1=check.reviewitem_meth();
		Assert.assertEquals(true, t1.contains("Arriving"));
	
}
}
