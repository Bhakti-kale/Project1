//10.test updating item quantities and removing item from the cart
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.ShoppingCart;

public class Testcase10 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	
	public void updatequant_removitem() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	Thread.sleep(10000);
		home.searching();
		Product1Page prodpage=new Product1Page(driver);
		prodpage.product(driver);
		Thread.sleep(3000);
		prodpage.closepopup();
		Thread.sleep(3000);
		prodpage.addtocart();
		ShoppingCart shop=new ShoppingCart(driver);
		shop.gotocart();
		shop.quantity_meth();
		Thread.sleep(3000);
		shop.removeFromCart();
		shop.removeFromCart();
}
}

