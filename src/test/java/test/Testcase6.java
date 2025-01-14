//6.verify that searching with filters (eg category,price range)yields accurate results
package test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.Product1Page;
import source.SerachResultPage;
@Listeners(Listner_logic.class)
public class Testcase6 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void search_with_filter() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
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
		SerachResultPage search=new SerachResultPage(driver);
		search.deliveryday_meth();
		//search.pricerange_meth(driver);
}
}
