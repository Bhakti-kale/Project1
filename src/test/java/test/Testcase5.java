//5.Test searching for products using its name like shoe 
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;
@Listeners(Listner_logic.class)
public class Testcase5 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void login_to_amazon_search_a_product() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//Thread.sleep(10000);
		home.searching();
		Thread.sleep(3000);
}
}
