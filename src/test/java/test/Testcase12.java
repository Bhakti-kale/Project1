//12.check if user is able to select each payment method
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.CheckoutPage;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.ShoppingCart;
@Listeners(Listner_logic.class)
public class Testcase12 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void select_pay_method() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
		
		home.searching();
		Product1Page prod=new Product1Page(driver);
		prod.product(driver);
		prod.buynow_meth();
		Thread.sleep(5000);
		
		CheckoutPage check=new CheckoutPage(driver);
		check.credebCard_meth();
		Thread.sleep(3000);
		check.netbank_meth();
		check.otherUPI_meth();
		//check.emi_meth();
		check.cod_meth();
		
	
}
}
