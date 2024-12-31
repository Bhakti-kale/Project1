//3.Ensure login fails with incorrect email or password
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
@Listeners(Listner_logic.class)
public class Testcase3 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void login_to_amazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.incorrectun();
		//login.cnt();
		//login.pwd();
		login.signin();
		Thread.sleep(15000);
		String txt = login.errormsg_meth();
		Assert.assertEquals(true, txt.contains("Your password is incorrect"), "assertion fail");
			
//		System.out.println("Login failed");
}
}