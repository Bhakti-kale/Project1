//9.verify that item can be added to shopping cart from the product pages
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;
@Listeners(Listner_logic.class)
public class Testcase9 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void add_to_cart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//sThread.sleep(10000);
		home.searching();
		Product1Page prodpage=new Product1Page(driver);
		prodpage.product(driver);
		Thread.sleep(3000);
		prodpage.addtocart();
		Thread.sleep(3000);
//		prodpage.closepopup();
//		Thread.sleep(3000);
		
}
}
