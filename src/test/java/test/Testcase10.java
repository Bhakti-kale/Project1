//10.test updating item quantities and removing item from the cart
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.ShoppingCart;
@Listeners(Listner_logic.class)
public class Testcase10 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	
	public void updatequant_removitem() throws InterruptedException, EncryptedDocumentException, IOException
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
		shop.gotocart();
		shop.quantity_meth();
		Thread.sleep(3000);
		shop.removeFromCart();
		
}
}

