//4.Check if a user can successfully edit their profile information
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.AccountPage;
import source.HomePage;
import source.LoginPage;
@Listeners(Listner_logic.class)
public class Testcase4 extends LaunchQuit
{
@Test(retryAnalyzer=test.RetryLogic.class)
public void edit_profile_info() throws EncryptedDocumentException, IOException, InterruptedException
{
	HomePage home=new HomePage(driver);
	home.accountandlist_hoverhover(driver);
	home.signin_method();
	LoginPage login=new LoginPage(driver);
	login.un();
	login.signin();
	Thread.sleep(10000);
	home.accountandlist_hoverhover(driver);
	home.youraccount_meth();
	AccountPage acc=new AccountPage(driver);
	acc.editaddress_meth();
	acc.edit_meth();
	acc.update_meth();
	
}

}
