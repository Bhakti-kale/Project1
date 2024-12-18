//3.Ensure login fails with incorrect email or password
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;

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
		Thread.sleep(10000);
		System.out.println("Login failed");
}
}