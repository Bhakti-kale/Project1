//4.Check if a user can successfully edit their profile information
package test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.AccountPage;
import source.Excel_data;
import source.HomePage;
import source.LoginPage;
@Listeners(Listner_logic.class)
public class Testcase4 extends LaunchQuit
{
@Test(retryAnalyzer=test.RetryLogic.class)
public void edit_profile_info() throws EncryptedDocumentException, IOException, InterruptedException
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
	
	home.accountandlist_hoverhover(driver);
	home.youraccount_meth();
	
	AccountPage acc=new AccountPage(driver);
	acc.loginnsecurity_meth();
	Thread.sleep(15000);
	acc.editname_meth();
	acc.savechanges_meth();
	Thread.sleep(5000);
	String txt1=acc.updatemsg_meth();
	Assert.assertEquals(true, txt1.contains("Name updated"), "profile not updated");
}

}
