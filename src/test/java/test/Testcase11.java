//11.validate the entire checkout process,including adress selection,payment method selection and order review 
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.CheckoutPage;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
@Listeners(Listner_logic.class)
public class Testcase11 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void validate_checkout_proc() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//sThread.sleep(10000);
		home.searching();
		Product1Page prod=new Product1Page(driver);
		prod.product(driver);
		prod.buynow_meth();
		Thread.sleep(10000);
		CheckoutPage check=new CheckoutPage(driver);
		check.address_selection_meth();
		check.payment_meth();
		check.cod_meth();
		check.usethispayment_meth();
		check.reviewitem_meth();
	
}
}
