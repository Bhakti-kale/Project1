//7.ensure that the product detail page displays all necessary information(price,reviews,discription)
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
import source.Productdetails_page;
@Listeners(Listner_logic.class)
public class Testcase7 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void product_details() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		Product1Page prod=new Product1Page(driver);
		prod.product(driver);
		
		Productdetails_page pd=new Productdetails_page(driver);
		
		
		pd.price_meth();		
		pd.description_meth();	
		pd.review_meth();
		
		
		
		Assert.assertNotNull(pd.price_meth());
		Assert.assertTrue(pd.description_meth());
		Assert.assertTrue(pd.review_meth());
		
	}	
}
