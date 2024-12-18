//7.ensure that the product detail page displays all necessary information(price,reviews,discription)
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.Productdetails_page;

public class Testcase7 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void product_details() throws InterruptedException, EncryptedDocumentException, IOException
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
		Productdetails_page pd=new Productdetails_page(driver);
		pd.prodTitle_meth();
		pd.price_meth();
		pd.description_meth();
		pd.review_meth();
	}
}
