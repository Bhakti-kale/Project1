//14.go to orders page and click on your last ordered product and give five star ratings 
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.OrdersPage;
import source.Product1Page;
import source.ReviewPage;
import source.ShoppingCart;

public class Testcase14 extends LaunchQuit
{
	@Test//(retryAnalyzer=test.RetryLogic.class)
	public void give_ratings() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//Thread.sleep(10000);
		home.returnandorder_meth();
		OrdersPage order=new OrdersPage(driver);
		order.write_prod_review_meth();
		Thread.sleep(3000);	
		ReviewPage rev=new ReviewPage(driver);
		rev.rating_meth();
		
		
}

}
