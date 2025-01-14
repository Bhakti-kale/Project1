//13.check if user is able to apply for coupon code while ordering the product
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.CheckoutPage;
import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
@Listeners(Listner_logic.class)
public class Testcase13 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void apply_coupon_code() throws InterruptedException, EncryptedDocumentException, IOException
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
		prod.buynow_meth();
		Thread.sleep(3000);
		CheckoutPage check=new CheckoutPage(driver);
		check.entercode_meth();
		check.apply_meth();
		
	
}
}
