//2.Verify login is successful with correct email and password
package test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.Excel_data;
//Login to amazon--->search product
import source.HomePage;
import source.LoginPage;
@Listeners(Listner_logic.class)
public class Testcase2 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void login_to_amazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Excel_data ed=new Excel_data();
		ed.datafetching();
	
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		Thread.sleep(5000);
		
		LoginPage login=new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();
		Thread.sleep(3000);
		String txt = home.user_profile();
		Assert.assertEquals(true, txt.contains("Hello, Bhakti"), "assertion fail txt user is incorrect");
		System.out.println("Login successful");
			
	}
}

