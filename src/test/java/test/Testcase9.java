//9.verify that item can be added to shopping cart from the product pages
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.ShoppingCart;
@Listeners(Listner_logic.class)
public class Testcase9 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void add_to_cart() throws InterruptedException, EncryptedDocumentException, IOException
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
		Product1Page prodpage=new Product1Page(driver);
		prodpage.product(driver);
		Thread.sleep(3000);
		prodpage.addtocart();
		Thread.sleep(3000);
		ShoppingCart shop=new ShoppingCart(driver);
		String t= shop.addedtocart_meth();
		Assert.assertEquals(true, t.contains("Added to cart"), "not added to cart");	
}
}
