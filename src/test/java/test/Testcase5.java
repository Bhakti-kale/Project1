//5.Test searching for products using its name like shoe 
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
@Listeners(Listner_logic.class)
public class Testcase5 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void login_to_amazon_search_a_product() throws InterruptedException, EncryptedDocumentException, IOException
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
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("shoe"), true, "search failed");
		System.out.println("searching product is successfull");
	}
}
