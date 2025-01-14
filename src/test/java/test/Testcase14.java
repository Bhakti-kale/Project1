//14.go to orders page and click on your last ordered product and give five star ratings 
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.OrdersPage;
import source.Product1Page;
import source.ReviewPage;
import source.ShoppingCart;
@Listeners(Listner_logic.class)
public class Testcase14 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void give_ratings() throws InterruptedException, EncryptedDocumentException, IOException
	{Excel_data ed=new Excel_data();
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
		home.returnandorder_meth();
		OrdersPage order=new OrdersPage(driver);
		order.write_prod_review_meth();
		Thread.sleep(3000);	
		ReviewPage rev=new ReviewPage(driver);
		rev.rating_meth();
		
		
}

}
