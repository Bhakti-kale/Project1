//6.verify that searching with filters (eg category,price range)yields accurate results
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.SerachResultPage;

public class Testcase6 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void search_with_filter() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//sThread.sleep(10000);
		home.searching();
		SerachResultPage search=new SerachResultPage(driver);
		search.deliveryday_meth();
		
}
}
