//13.check if user is able to apply for coupon code while ordering the product
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
public class Testcase13 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void apply_coupon_code() throws InterruptedException, EncryptedDocumentException, IOException
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
		Thread.sleep(3000);
		CheckoutPage check=new CheckoutPage(driver);
		check.entercode_meth();
		check.apply_meth();
		//check.usethispayment_meth();
	
}
}
